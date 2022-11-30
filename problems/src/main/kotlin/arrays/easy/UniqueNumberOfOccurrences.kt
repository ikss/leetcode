package arrays.easy

/**
 * Given an array of integers arr, return true if the number of occurrences of each value in the array is unique,
 * or false otherwise.
 *
 * [URL](https://leetcode.com/problems/unique-number-of-occurrences/)
 */
object UniqueNumberOfOccurrences {
    fun uniqueOccurrences(arr: IntArray): Boolean {
        val map = hashMapOf<Int, Int>()

        for (i in arr) {
            map[i] = map.getOrDefault(i, 0) + 1
        }

        val set = hashSetOf<Int>()

        for (v in map.values) {
            if (!set.add(v)) return false
        }
        return true
    }
}
