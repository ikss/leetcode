package strings.easy

/**
 * A distinct string is a string that is present only once in an array.
 *
 * Given an array of strings arr, and an integer k, return the kth distinct string present in arr.
 * If there are fewer than k distinct strings, return an empty string "".
 *
 * Note that the strings are considered in the order in which they appear in the array.
 *
 * [URL](https://leetcode.com/problems/kth-distinct-string-in-an-array/)
 */
object KthDistinctStringInArray {
    fun kthDistinct(arr: Array<String>, k: Int): String {
        val map = LinkedHashMap<String, Int>()

        for (a in arr) {
            map.merge(a, 1, Int::plus)
        }

        var distinct = 0
        for ((str, v) in map) {
            if (v == 1) distinct++
            if (distinct == k) return str
        }

        return ""
    }
}