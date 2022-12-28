package arrays.medium

import java.util.*

/**
 * You are given a 0-indexed integer array piles, where `piles[i]` represents the number of stones in the ith pile,
 * and an integer k. You should apply the following operation exactly k times:
 *
 * Choose any `piles[i]` and remove `floor(piles[i] / 2)` stones from it.
 * Notice that you can apply the operation on the same pile more than once.
 *
 * Return the minimum possible total number of stones remaining after applying the k operations.
 *
 * floor(x) is the greatest integer that is smaller than or equal to x (i.e., rounds x down).
 *
 * [URL](https://leetcode.com/problems/remove-stones-to-minimize-the-total/)
 */
object RemoveStonesToMinimizeTheTotal {
    fun minStoneSum(piles: IntArray, k: Int): Int {
        val queue = PriorityQueue<Int> { a, b -> b - a }
        var sum = 0
        for (pile in piles) {
            sum += pile
            queue.add(pile)
        }

        repeat(k) {
            val pile = queue.poll()
            val removed = pile / 2
            queue.add(pile - removed)
            sum -= removed
        }

        return sum
    }
}
