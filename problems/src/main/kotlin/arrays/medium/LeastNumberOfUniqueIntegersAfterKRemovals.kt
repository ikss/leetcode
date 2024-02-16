package arrays.medium

/**
 * Given an array of integers arr and an integer k.
 * Find the least number of unique integers after removing exactly k elements.
 *
 * [URL](https://leetcode.com/problems/least-number-of-unique-integers-after-k-removals/)
 */
object LeastNumberOfUniqueIntegersAfterKRemovals {
    fun findLeastNumOfUniqueIntsSortValues(arr: IntArray, k: Int): Int {
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

    fun findLeastNumOfUniqueIntsCountSort(arr: IntArray, k: Int): Int {
        val map = HashMap<Int, Int>()

        for (n in arr) {
            map.merge(n, 1, Int::plus)
        }

        val n = arr.size
        val countOfFrequencies = IntArray(n + 1)

        for (count in map.values) {
            countOfFrequencies[count]++
        }

        var unique = map.size
        var left = k
        for (i in 1..n) {
            val numElementsToRemove = minOf(left / i, countOfFrequencies[i])

            left -= i * numElementsToRemove

            unique -= numElementsToRemove

            if (left < i || unique == 0) {
                return unique
            }
        }

        return 0
    }
}
