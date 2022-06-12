package collections.arrays.medium

/**
 * Given an integer array nums and an integer k, return the k most frequent elements.
 * You may return the answer in any order.
 *
 * [URL](https://leetcode.com/problems/top-k-frequent-elements/)
 */
object TopKFrequentElements {

    fun topKFrequent(nums: IntArray, k: Int): IntArray {
        val map = nums.toList().groupingBy { it }.eachCount().entries.sortedByDescending { it.value }

        return map.take(k).map { it.key }.toIntArray()
    }
}
