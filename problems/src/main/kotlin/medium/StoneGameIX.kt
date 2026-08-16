package medium

/**
 * Alice and Bob continue their games with stones. There is a row of n stones, and each stone has an associated value.
 * You are given an integer array stones, where `stones[i]` is the value of the ith stone.
 *
 * Alice and Bob take turns, with Alice starting first. On each turn, the player may remove any stone from stones.
 * The player who removes a stone loses if the sum of the values of all removed stones is divisible by 3.
 * Bob will win automatically if there are no remaining stones (even if it is Alice's turn).
 *
 * Assuming both players play optimally, return true if Alice wins and false if Bob wins.
 *
 * [URL](https://leetcode.com/problems/stone-game-ix/)
 */
object StoneGameIX {
    fun stoneGameIX(stones: IntArray): Boolean {
        var cnt0 = 0
        var cnt1 = 0
        var cnt2 = 0

        for (n in stones) {
            when (n % 3) {
                0 -> cnt0++
                1 -> cnt1++
                2 -> cnt2++
            }
        }

        if (cnt0 % 2 == 0) {
            return cnt1 >= 1 && cnt2 >= 1
        }

        return cnt1 - cnt2 > 2 || cnt2 - cnt1 > 2
    }
}