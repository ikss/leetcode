package arrays.easy

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
    fun countGoodTriplets(arr: IntArray, a: Int, b: Int, c: Int): Int {
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
}
