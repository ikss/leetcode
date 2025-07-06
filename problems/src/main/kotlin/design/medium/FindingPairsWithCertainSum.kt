package design.medium

/**
 * You are given two integer arrays nums1 and nums2.
 * You are tasked to implement a data structure that supports queries of two types:
 *
 * Add a positive integer to an element of a given index in the array nums2.
 * Count the number of pairs (i, j) such that `nums1[i] + nums2[j]` equals a given value
 * (0 <= i < nums1.length and 0 <= j < nums2.length).
 * Implement the FindSumPairs class:
 * * FindSumPairs(int[] nums1, int[] nums2) Initializes the FindSumPairs object with two integer arrays nums1 and nums2.
 * * void add(int index, int val) Adds val to `nums2[index]`, i.e., apply `nums2[index] += val`.
 * * int count(int tot) Returns the number of pairs (i, j) such that `nums1[i] + nums2[j] == tot`.
 *
 * [URL](https://leetcode.com/problems/design-a-food-rating-system/)
 */

object FindingPairsWithCertainSum {
    class FindSumPairs(val nums1: IntArray, val nums2: IntArray) {
        private val counts2 = HashMap<Int, Int>()

        init {
            for (n in nums2) {
                counts2[n] = counts2.getOrDefault(n, 0) + 1
            }
        }

        fun add(index: Int, `val`: Int) {
            val old = nums2[index]
            val new = old + `val`
            nums2[index] = new
            counts2[old] = counts2[old]!! - 1
            if (counts2[old] == 0) {
                counts2.remove(old)
            }
            counts2[new] = counts2.getOrDefault(new, 0) + 1
        }

        fun count(tot: Int): Int {
            var result = 0

            for (num in nums1) {
                result += counts2.getOrDefault(tot - num, 0)
            }

            return result
        }
    }
}