package data_structures.other_data_structures.medium

import java.util.*

/**
 * Given an array of unique integers, arr, where each integer `arr[i]` is strictly greater than 1.
 *
 * We make a binary tree using these integers, and each number may be used for any number of times.
 * Each non-leaf node's value should be equal to the product of the values of its children.
 *
 * Return the number of binary trees we can make. The answer may be too large so return the answer modulo 10^9 + 7.
 *
 * [URL](https://leetcode.com/problems/binary-trees-with-factors/)
 */
object BinaryTreeWithFactors {
    private const val MOD = 1_000_000_007

    fun numFactoredBinaryTrees(arr: IntArray): Int {
        val numbers = TreeMap<Int, Int>()
        arr.sort()

        for (n in arr) {
            var result = 1

            for (e in numbers) {
                val rem = n % e.key
                val div = n / e.key
                if (rem == 0 && numbers[div] != null) {
                    result += (numbers[div]!! * e.value) % MOD
                }
            }

            numbers[n] = result % MOD
        }

        return numbers.values.sumOf { it } % MOD
    }
}
