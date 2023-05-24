package arrays.medium

import java.util.*


/**
 * You are given two 0-indexed integer arrays nums1 and nums2 of equal length n and a positive integer k.
 * You must choose a subsequence of indices from nums1 of length k.
 *
 * For chosen indices i0, i1, ..., ik - 1, your score is defined as:
 *
 * The sum of the selected elements from nums1 multiplied with the minimum of the selected elements from nums2.
 * It can defined simply as: (`nums1[i0] + nums1[i1] +...+ nums1[ik - 1]) * min(nums2[i0] , nums2[i1], ... ,nums2[ik - 1]`).
 * Return the maximum possible score.
 *
 * A subsequence of indices of an array is a set that can be derived from the set {0, 1, ..., n-1} by deleting some or no elements.
 *
 * [URL](https://leetcode.com/problems/maximum-subsequence-score/)
 */
object MaximumSubsequenceScore {
    fun maxScore(nums1: IntArray, nums2: IntArray, k: Int): Long {
        // Sort pair (nums1[i], nums2[i]) by nums2[i] in decreasing order.
        val n = nums1.size
        val pairs = Array(n) { nums1[it] to nums2[it] }
        pairs.sortByDescending { it.second }

        // Use a min-heap to maintain the top k elements.
        val topKHeap = PriorityQueue<Int>()
        var topKSum: Long = 0
        for (i in 0 until k) {
            val first = pairs[i].first
            topKSum += first.toLong()
            topKHeap.add(first)
        }

        // The score of the first k pairs.
        var answer = topKSum * pairs[k - 1].second

        // Iterate over every nums2[i] as minimum from nums2.
        for (i in k until n) {
            // Remove the smallest integer from the previous top k elements
            // then ddd nums1[i] to the top k elements.
            val (first, second) = pairs[i]
            topKSum += (first - topKHeap.poll()).toLong()
            topKHeap.add(first)

            // Update answer as the maximum score.
            answer = maxOf(answer, topKSum * second)
        }
        return answer
    }
}