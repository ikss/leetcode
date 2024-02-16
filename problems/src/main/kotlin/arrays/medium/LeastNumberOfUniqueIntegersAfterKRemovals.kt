package arrays.medium

/**
 * Given an array of integers arr and an integer k.
 * Find the least number of unique integers after removing exactly k elements.
 *
 * [URL](https://leetcode.com/problems/least-number-of-unique-integers-after-k-removals/)
 */
object LeastNumberOfUniqueIntegersAfterKRemovals {
    fun findLeastNumOfUniqueInts(arr: IntArray, k: Int): Int {
        val map = HashMap<Int, Int>()

        for (n in arr) {
            map.merge(n, 1, Int::plus)
        }

        var unique = map.size
        var left = k
        for (v in map.values.sorted()) {
            if (v > left) {
                break
            }
            left -= v
            unique -= 1
        }
        return unique
    }
}
