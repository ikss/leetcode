package arrays.medium

import java.util.*

/**
 * There is a battle and n heroes are trying to defeat m monsters. You are given two 1-indexed arrays of positive
 * integers heroes and monsters of length n and m, respectively. `heroes[i]` is the power of ith hero, and `monsters[i]`
 * is the power of ith monster.
 *
 * The ith hero can defeat the jth monster if `monsters[j] <= heroes[i]`.
 *
 * You are also given a 1-indexed array coins of length m consisting of positive integers. `coins[i]` is the number of
 * coins that each hero earns after defeating the ith monster.
 *
 * Return an array ans of length n where `ans[i]` is the maximum number of coins that the ith hero can collect from this battle.
 *
 * Notes
 * * The health of a hero doesn't get reduced after defeating a monster.
 * * Multiple heroes can defeat a monster, but each monster can be defeated by a given hero only once.
 *
 * [URL](https://leetcode.com/problems/maximum-coins-heroes-can-collect/)
 */
object MaximumCoinsHeroesCanCollect {
    fun maximumCoins(heroes: IntArray, monsters: IntArray, coins: IntArray): LongArray {
        val msize = monsters.size
        val monstersAndCoins = Array(msize) { monsters[it] to coins[it] }

        monstersAndCoins.sortBy { it.first }

        val coinsRunningSum = TreeMap<Int, Long>()
        for ((m, c) in monstersAndCoins) {
            val prev = coinsRunningSum.floorEntry(m)?.value ?: 0L
            coinsRunningSum[m] = c + prev
        }
        val result = LongArray(heroes.size)

        for (i in heroes.indices) {
            result[i] = coinsRunningSum.floorEntry(heroes[i])?.value ?: 0L
        }

        return result
    }
}
