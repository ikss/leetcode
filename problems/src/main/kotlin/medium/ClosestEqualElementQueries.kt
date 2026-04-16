package medium

import java.util.*

/**
 * You are given a circular array nums and an array queries.
 *
 * For each query i, you have to find the following:
 *
 * * The minimum distance between the element at index `queries[i]` and any other index j in the circular array,
 * where `nums[j] == nums[queries[i]]`. If no such index exists, the answer for that query should be -1.
 *
 * Return an array answer of the same size as queries, where `answer[i]` represents the result for query i.
 *
 * [URL](https://leetcode.com/problems/closest-equal-element-queries/)
 */
object ClosestEqualElementQueries {
    fun solveQueries(nums: IntArray, queries: IntArray): List<Int> {
        val n = nums.size
        val map = HashMap<Int, TreeSet<Int>>()

        for (i in nums.indices) {
            map.computeIfAbsent(nums[i]) { TreeSet() }.add(i)
        }

        val result = ArrayList<Int>(queries.size)

        for (q in queries) {
            val num = nums[q]

            val set = map[num]!!

            if (set.size == 1) {
                result.add(-1)
                continue
            }

            val lower = set.lower(q)
            val higher = set.higher(q)

            val lowerDistance = if (lower != null) q - lower else n - set.last() + q
            val higherDistance = if (higher != null) higher - q else n - q + set.first()

            result.add(minOf(lowerDistance, higherDistance))
        }

        return result
    }
}
