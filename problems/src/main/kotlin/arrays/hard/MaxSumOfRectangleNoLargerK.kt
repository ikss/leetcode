package arrays.hard

import java.util.*

/**
 * There are n children standing in a line. Each child is assigned a rating value given in the integer array ratings.
 *
 * You are giving candies to these children subjected to the following requirements:
 *
 * * Each child must have at least one candy.
 * * Children with a higher rating get more candies than their neighbors.
 *
 * Return the minimum number of candies you need to have to distribute the candies to the children.
 *
 * [URL](https://leetcode.com/problems/candy/)
 */
object MaxSumOfRectangleNoLargerK {
    fun maxSumSubmatrix(matrix: Array<IntArray>, k: Int): Int {
        val n = matrix.size
        val m = matrix[0].size
        var res = Int.MIN_VALUE
        for (i in 0 until m) {
            val arr = IntArray(n)
            for (j in i until m) {
                for (l in 0 until n) {
                    arr[l] += matrix[l][j]
                }
                res = maxOf(res, maxSubSumarray(arr, k))
                if (res == k) return res
            }
        }
        return res
    }

    private fun maxSubSumarray(arr: IntArray, k: Int): Int {
        val presum = TreeSet<Int>()
        presum.add(0)
        var res = Int.MIN_VALUE
        var sum = 0
        for (i in arr.indices) {
            sum += arr[i]
            val x = presum.ceiling(sum - k)
            if (x != null) {
                res = maxOf(res, sum - x)
            }
            presum.add(sum)
        }
        return res
    }
}
