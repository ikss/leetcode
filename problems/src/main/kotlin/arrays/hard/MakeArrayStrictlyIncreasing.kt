package arrays.hard

import java.util.*


/**
 * Given two integer arrays arr1 and arr2, return the minimum number of operations (possibly zero) needed to make arr1
 * strictly increasing.
 *
 * In one operation, you can choose two indices 0 <= i < arr1.length and 0 <= j < arr2.length
 * and do the assignment `arr1[i] = arr2[j]`.
 *
 * If there is no way to make arr1 strictly increasing, return -1.
 *
 * [URL](https://leetcode.com/problems/make-array-strictly-increasing/)
 */
object MakeArrayStrictlyIncreasing {
    fun makeArrayIncreasing(arr1: IntArray, arr2: IntArray): Int {
        Arrays.sort(arr2)
        val dp: MutableMap<Pair<Int, Int>, Int> = HashMap()
        val answer = dfs(0, -1, arr1, arr2, dp)
        return if (answer < 2001) answer else -1
    }

    private fun dfs(i: Int, prev: Int, arr1: IntArray, arr2: IntArray, dp: MutableMap<Pair<Int, Int>, Int>): Int {
        if (i == arr1.size) {
            return 0
        }
        if (dp.containsKey(Pair(i, prev))) {
            return dp[Pair(i, prev)]!!
        }
        var cost = 2001

        // If arr1[i] is already greater than prev, we can leave it be.
        if (arr1[i] > prev) {
            cost = dfs(i + 1, arr1[i], arr1, arr2, dp)
        }

        // Find a replacement with the smallest value in arr2.
        val idx = bisectRight(arr2, prev)

        // Replace arr1[i], with a cost of 1 operation.
        if (idx < arr2.size) {
            cost = Math.min(cost, 1 + dfs(i + 1, arr2[idx], arr1, arr2, dp))
        }
        dp[Pair(i, prev)] = cost
        return cost
    }

    private fun bisectRight(arr: IntArray, value: Int): Int {
        var left = 0
        var right = arr.size
        while (left < right) {
            val mid = (left + right) / 2
            if (arr[mid] <= value) {
                left = mid + 1
            } else {
                right = mid
            }
        }
        return left
    }
}
