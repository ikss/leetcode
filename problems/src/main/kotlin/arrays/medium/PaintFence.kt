package arrays.medium

import java.util.*

/**
 * You are painting a fence of n posts with k different colors. You must paint the posts following these rules:
 * * Every post must be painted exactly one color.
 * * There cannot be three or more consecutive posts with the same color.
 *
 * Given the two integers n and k, return the number of ways you can paint the fence.
 *
 * [URL](https://leetcode.com/problems/paint-fence/)
 */
object PaintFence {
    fun numWays(n: Int, k: Int): Int {
        if (n == 1) return k

        var prevprev = k
        var prev = k * k

        for (i in 3 .. n) {
            val temp = prev
            prev = (k - 1) * (prev + prevprev)
            prevprev = temp
        }

        return prev
    }
}