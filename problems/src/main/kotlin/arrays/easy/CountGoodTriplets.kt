package arrays.easy

import kotlin.math.abs

/**
 * Given an array of integers arr, and three integers a, b and c. You need to find the number of good triplets.
 *
 * A triplet `(arr[i], arr[j], arr[k])` is good if the following conditions are true:
 * * 0 <= i < j < k < arr.length
 * * `|arr[i] - arr[j]| <= a`
 * * `|arr[j] - arr[k]| <= b`
 * * `|arr[i] - arr[k]| <= c`
 *
 * Where |x| denotes the absolute value of x.
 *
 * Return the number of good triplets.
 *
 * [URL](https://leetcode.com/problems/count-good-triplets/)
 */
object CountGoodTriplets {
    fun countGoodTripletsBruteForce(arr: IntArray, a: Int, b: Int, c: Int): Int {
        var result = 0

        for (i in 0 until arr.size - 2) {
            for (j in i + 1 until arr.size - 1) {
                for (k in j + 1 until arr.size) {
                    if (
                        Math.abs(arr[i] - arr[j]) <= a &&
                        Math.abs(arr[j] - arr[k]) <= b &&
                        Math.abs(arr[k] - arr[i]) <= c
                    ) {
                        result++
                    }
                }
            }
        }
        return result
    }

    fun countGoodTripletsOptimized(arr: IntArray, a: Int, b: Int, c: Int): Int {
        var result = 0
        val n = arr.size
        val sum = IntArray(1001)

        for (num in arr[0]..1000) {
            ++sum[num]
        }

        for (j in 1..<n-1) {
            for (k in j + 1..<n) {
                if (abs(arr[j] - arr[k]) > b) continue
                val lj = arr[j] - a
                val rj = arr[j] + a
                val lk = arr[k] - c
                val rk = arr[k] + c
                val l = maxOf(0, lj, lk)
                val r = minOf(1000, rj, rk)

                if (l <= r) {
                    result += if (l == 0) {
                        sum[r]
                    } else {
                        sum[r] - sum[l - 1]
                    }
                }
            }
            for (k in arr[j]..1000) {
                ++sum[k]
            }
        }
        return result
    }
}
