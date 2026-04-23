package medium

import data_structures.TreeNode

/**
 * You are given a 0-indexed integer array nums. There exists an array arr of length nums.length,
 * where `arr[i]` is the sum of |i - j| over all j such that `nums[j] == nums[i]` and j != i.
 * If there is no such j, set `arr[i]` to be 0.
 *
 * Return the array arr.
 *
 * [URL](https://leetcode.com/problems/sum-of-distances/)
 */
object SumOfDistances {
    fun distance(nums: IntArray): LongArray {
        val map = HashMap<Int, ArrayList<Int>>()

        for (i in nums.indices) {
            val n = nums[i]

            map.computeIfAbsent(n) { ArrayList() }.add(i)
        }

        val result = LongArray(nums.size)

        for (g in map.values) {
            var sum = 0L
            for (el in g) {
                sum += el
            }

            var prefixTotal = 0L

            for (i in g.indices) {
                val el = g[i]
                result[el] = sum - prefixTotal * 2 + el.toLong() * (2 * i - g.size)
                prefixTotal += el
            }
        }

        return result
    }
}