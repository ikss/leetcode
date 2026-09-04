package easy

import data_structures.TreeNode
import java.util.*

/**
 * You are given an integer array nums of length n and an integer k.
 *
 * For each index i, define its instability score as `max(nums[0..i]) - min(nums[i..n - 1])`.
 *
 * In other words:
 * * `max(nums[0..i])` is the largest value among the elements from index 0 to index i.
 * * `min(nums[i..n - 1])` is the smallest value among the elements from index i to index n - 1.
 *
 * An index i is called stable if its instability score is less than or equal to k.
 *
 * Return the smallest stable index. If no such index exists, return -1.
 *
 * [URL](https://leetcode.com/problems/smallest-stable-index-i/)
 */
object SmallestStableIndexI {
    fun firstStableIndex(nums: IntArray, k: Int): Int {
        val n = nums.size
        val min = IntArray(n)
        min[n - 1] = nums[n - 1]
        val max = IntArray(n)
        max[0] = nums[0]

        for (i in 1 until n) {
            max[i] = maxOf(max[i - 1], nums[i])
        }
        for (i in n - 2 downTo 0) {
            min[i] = minOf(min[i + 1], nums[i])
        }

        for (i in 0 until n) {
            val stability = max[i] - min[i]
            if (stability <= k) {
                return i
            }
        }
        return -1
    }
}
