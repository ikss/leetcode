package easy

/**
 * Given an array of integers arr, return true if the number of occurrences of each value in the array is unique,
 * or false otherwise.
 *
 * [URL](https://leetcode.com/problems/unique-number-of-occurrences/)
 */
object UniqueNumberOfOccurrences {
    fun uniqueOccurrences(arr: IntArray): Boolean {
        val map = HashMap<Int, Int>()

        for (i in arr) {
            map.merge(i, 1, Int::plus)
        }

        val set = HashSet<Int>()

        for (v in map.values) {
            if (!set.add(v)) return false
        }
        return true
    }
}
