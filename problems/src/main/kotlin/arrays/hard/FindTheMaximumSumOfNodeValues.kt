package arrays.hard

import java.util.*


/**
 * There exists an undirected tree with n nodes numbered 0 to n - 1. You are given a 0-indexed 2D integer array edges
 * of length n - 1, where `edges[i] = [ui, vi]` indicates that there is an edge between nodes ui and vi in the tree.
 * You are also given a positive integer k, and a 0-indexed array of non-negative integers nums of length n,
 * where `nums[i]` represents the value of the node numbered i.
 *
 * Alice wants the sum of values of tree nodes to be maximum,
 * for which Alice can perform the following operation any number of times (including zero) on the tree:
 * Choose any edge `[u, v]` connecting the nodes u and v, and update their values as follows:
 * * `nums[u] = nums[u] XOR k`
 * * `nums[v] = nums[v] XOR k`
 *
 * Return the maximum possible sum of the values Alice can achieve by performing the operation any number of times.
 *
 * [URL](https://leetcode.com/problems/find-the-maximum-sum-of-node-values/)
 */
object FindTheMaximumSumOfNodeValues {
    fun maximumValueSum(nums: IntArray, k: Int, edges: Array<IntArray>): Long {
        val n = nums.size
        var result = 0L
        val netChange = IntArray(n) {
            result += nums[it]
            (nums[it] xor k) - nums[it]
        }

        netChange.sortDescending()

        for (i in 0 until n step 2) {
            if (i + 1 == n) {
                break
            }
            val pairSum = netChange[i] + netChange[i + 1]
            if (pairSum > 0) {
                result += pairSum
            }
        }
        return result
    }
}
