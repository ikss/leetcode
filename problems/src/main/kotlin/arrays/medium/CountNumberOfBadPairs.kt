package arrays.medium

import java.util.*

/**
 * You are given a 0-indexed integer array nums.
 * A pair of indices (i, j) is a bad pair if i < j and `j - i != nums[j] - nums[i]`.
 *
 * Return the total number of bad pairs in nums.
 *
 * [URL](https://leetcode.com/problems/count-number-of-bad-pairs/)
 */
object CountNumberOfBadPairs {

    fun countBadPairs(nums: IntArray): Long {
        var badPairs = 0L
        val diffCount = HashMap<Int, Int>()

        for (pos in nums.indices) {
            val diff = pos - nums[pos]

            // Count of previous positions with same difference
            val goodPairsCount = diffCount.getOrDefault(diff, 0)

            // Total possible pairs minus good pairs = bad pairs
            badPairs += pos.toLong() - goodPairsCount

            // Update count of positions with this difference
            diffCount[diff] = goodPairsCount + 1
        }

        return badPairs
    }
}
