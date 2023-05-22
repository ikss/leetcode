package arrays.medium

import java.util.*

/**
 * Given an integer array nums and an integer k, return the k most frequent elements.
 * You may return the answer in any order.
 *
 * [URL](https://leetcode.com/problems/top-k-frequent-elements/)
 */
object TopKFrequentElements {

    fun topKFrequentGrouping(nums: IntArray, k: Int): IntArray {
        val map = nums.toList().groupingBy { it }.eachCount().entries.sortedByDescending { it.value }

        return map.take(k).map { it.key }.toIntArray()
    }

    fun topKFrequentPriorityQueue(nums: IntArray, k: Int): IntArray {
        val countMap = mutableMapOf<Int, Int>()
        for (n in nums) {
            countMap.merge(n, 1, Integer::sum)
        }
        val pq = PriorityQueue<Map.Entry<Int, Int>> { o1, o2 -> o2.value - o1.value }
        pq.addAll(countMap.entries)

        val ret = IntArray(k)
        for (i in 0 until k) {
            ret[i] = pq.poll().key
        }
        return ret
    }

}
