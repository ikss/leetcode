package medium

import java.util.*


/**
 * You are given an array nums of distinct positive integers.
 * You need to sort the array in increasing order based on the sum of the digits of each number.
 * If two numbers have the same digit sum, the smaller number appears first in the sorted order.
 *
 * Return the minimum number of swaps required to rearrange nums into this sorted order.
 *
 * A swap is defined as exchanging the values at two distinct positions in the array.
 *
 * [URL](https://leetcode.com/problems/minimum-swaps-to-sort-by-digit-sum/)
 */
object MinimumSwapsToSortByDigitSum {

    fun minSwaps(nums: IntArray): Int {
        val n = nums.size
        val digitSum = IntArray(n)
        for (i in 0..<n) {
            val x = nums[i]
            val sum = digitsSum(x)
            digitSum[i] = sum
        }

        val indices = arrayOfNulls<Int>(n)
        for (i in 0..<n) {
            indices[i] = i
        }
        Arrays.sort(indices, Comparator { a: Int, b: Int ->
            if (digitSum[a] != digitSum[b]) {
                digitSum[a].compareTo(digitSum[b])
            } else {
                nums[a].compareTo(nums[b])
            }
        })

        val targetPos = IntArray(n)
        for (pos in 0..<n) {
            targetPos[indices[pos]!!] = pos
        }

        val parent = IntArray(n) { it }
        var components = n

        for (i in 0..<n) {
            val ri = find(parent, i)
            val rj = find(parent, targetPos[i])
            if (ri != rj) {
                parent[ri] = rj
                components--
            }
        }

        return n - components
    }

    private fun digitsSum(x: Int): Int {
        var x1 = x
        var sum = 0
        while (x1 > 0) {
            sum += x1 % 10
            x1 /= 10
        }
        return sum
    }

    private fun find(parent: IntArray, x: Int): Int {
        if (parent[x] != x) {
            parent[x] = find(parent, parent[x])
        }
        return parent[x]
    }
}
