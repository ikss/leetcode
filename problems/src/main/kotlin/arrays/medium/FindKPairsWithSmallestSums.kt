package arrays.medium

import java.util.*

/**
 * You are given two integer arrays nums1 and nums2 sorted in ascending order and an integer k.
 *
 * Define a pair (u, v) which consists of one element from the first array and one element from the second array.
 *
 * Return the k pairs (u1, v1), (u2, v2), ..., (uk, vk) with the smallest sums.
 *
 * [URL](https://leetcode.com/problems/find-k-pairs-with-smallest-sums/)
 */
object FindKPairsWithSmallestSums {
    fun kSmallestPairs(nums1: IntArray, nums2: IntArray, k: Int): List<List<Int>> {
        val pq = PriorityQueue<List<Int>> { e1, e2 -> e1[0] - e2[0] }
        val visited = HashSet<Pair<Int, Int>>()
        val result = ArrayList<List<Int>>()

        pq.offer(listOf(nums1[0] + nums2[0], 0, 0))
        visited.add(0 to 0)

        for (r in 0 until k) {
            val (_, i, j) = pq.poll() ?: break
            result.add(listOf(nums1[i], nums2[j]))

            if (i + 1 < nums1.size && visited.add(i + 1 to j)) {
                pq.offer(listOf(nums1[i + 1] + nums2[j], i + 1, j))
            }
            if (j + 1 < nums2.size && visited.add(i to j + 1)) {
                pq.offer(listOf(nums1[i] + nums2[j + 1], i, j + 1))
            }
        }

        return result
    }
}
