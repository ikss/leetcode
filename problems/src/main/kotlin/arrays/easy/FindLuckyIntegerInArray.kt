package arrays.easy

/**
 * Given an array of integers arr, a lucky integer is an integer that has a frequency in the array equal to its value.
 *
 * Return the largest lucky integer in the array. If there is no lucky integer return -1.
 *
 * [URL](https://leetcode.com/problems/find-lucky-integer-in-an-array/)
 */
object FindLuckyIntegerInArray {
    fun findLucky(arr: IntArray): Int {
        val res = IntArray(501)

        for (n in arr) {
            res[n]++
        }

        for (i in 500 downTo 1) {
            if (i == res[i]) return i
        }

        return -1
    }
}
