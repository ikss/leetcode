package medium

import java.util.*

/**
 * You are given a 0-indexed integer array nums and an integer k. You have a starting score of 0.
 *
 * In one operation:
 * 1. choose an index i such that 0 <= i < nums.length,
 * 2. increase your score by `nums[i]`, and
 * 3. replace `nums[i]` with `ceil(nums[i] / 3)`.
 * Return the maximum possible score you can attain after applying exactly k operations.
 *
 * The ceiling function ceil(val) is the least integer greater than or equal to val.
 *
 * [URL](https://leetcode.com/problems/maximal-score-after-applying-k-operations/)
 */
object MaximalScoreAfterApplyingKOperations {
    fun maxKelements(nums: IntArray, k: Int): Long {
        val pq = PriorityQueue<Int> { n1, n2 -> n2 - n1 }

        for (n in nums) {
            pq.offer(n)
        }

        var result = 0L

        for (i in 0 until k) {
            val num = pq.poll()

            result += num

            pq.offer(Math.ceil(num.toDouble() / 3).toInt())
        }
        return result
    }
}
