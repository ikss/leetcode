package medium

import java.util.*

/**
 * Given an integer array nums, return the length of the longest strictly increasing subsequence.
 *
 * A subsequence is a sequence that can be derived from an array by deleting some or no elements without changing
 * the order of the remaining elements. For example, [3,6,2,7] is a subsequence of the array [0,3,1,6,2,2,7].
 *
 * [URL](https://leetcode.com/problems/longest-increasing-subsequence/)
 */
object LongestIncreasingSubsequence {
    fun lengthOfLISArray(nums: IntArray): Int {
        val piles = IntArray(nums.size)

        var size = 0
        for (n in nums) {
            var i = 0
            var j = size
            while (i != j) {
                val mid = (j - i) / 2 + i
                if (piles[mid] < n) {
                    i = mid + 1
                } else {
                    j = mid
                }
            }
            piles[i] = n
            if (i == size) size++
        }

        return size
    }

    fun lengthOfLISTreeSet(nums: IntArray): Int {
        val piles = TreeSet<Int>()

        for (n in nums) {
            val greater = piles.ceiling(n)
            if (greater != null) {
                piles.remove(greater)
            }
            piles.add(n)
        }

        return piles.size
    }
}
