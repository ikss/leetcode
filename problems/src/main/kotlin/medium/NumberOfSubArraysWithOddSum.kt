package medium

/**
 * Given an array of integers arr, return the number of subarrays with an odd sum.
 *
 * Since the answer can be very large, return it modulo 10^9 + 7.
 *
 * [URL](https://leetcode.com/problems/number-of-sub-arrays-with-odd-sum/)
 */
object NumberOfSubArraysWithOddSum {
    fun numOfSubarrays(arr: IntArray): Int {
        val mod = 1_000_000_007
        var result = 0
        var sum = 0
        var sumEven = 1
        var sumOdd = 0

        for (n in arr) {
            sum += n

            if (sum % 2 == 0) {
                result += sumOdd
                sumEven++
            } else {
                result += sumEven
                sumOdd++
            }
            result %= mod
        }

        return result
    }
}
