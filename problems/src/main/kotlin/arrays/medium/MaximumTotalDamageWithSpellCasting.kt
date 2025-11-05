package arrays.medium

import java.util.*

/**
 * A magician has various spells.
 *
 * You are given an array power, where each element represents the damage of a spell. Multiple spells can have the same
 * damage value.
 *
 * It is a known fact that if a magician decides to cast a spell with a damage of `power[i]`, they cannot cast any spell
 * with a damage of `power[i] - 2`, `power[i] - 1`, `power[i] + 1`, or `power[i] + 2`.
 *
 * Each spell can be cast only once.
 *
 * Return the maximum possible total damage that a magician can cast.
 *
 * [URL](https://leetcode.com/problems/maximum-total-damage-with-spell-casting/)
 */
object MaximumTotalDamageWithSpellCasting {
    fun maximumTotalDamage(power: IntArray): Long {
        val count = TreeMap<Long, Int>()
        for (p in power) {
            val pl = p.toLong()
            count[pl] = count.getOrDefault(pl, 0) + 1
        }
        val prev = ArrayDeque<Pair<Long, Long>>()

        var max = 0L
        for ((p, c) in count) {
            var prevPower = 0L
            while (prev.isNotEmpty() && prev.peek().first < p - 2) {
                prevPower = maxOf(prev.pop().second, prevPower)
            }
            prev.offerFirst(p - 2 to prevPower)

            val currPower = p * c
            val newMax = prevPower + currPower
            max = maxOf(max, newMax)
            prev.offer(p to max)
        }

        return max
    }
}
