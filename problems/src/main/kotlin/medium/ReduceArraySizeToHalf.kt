package medium

/**
 * You are given an integer array arr. You can choose a set of integers and remove all the occurrences of these integers
 * in the array.

Return the minimum size of the set so that at least half of the integers of the array are removed.
 *
 * [URL](https://leetcode.com/problems/reduce-array-size-to-the-half/)
 */
object ReduceArraySizeToHalf {
    fun minSetSize(arr: IntArray): Int {
        val map = HashMap<Int, Int>()
        for (i in arr) {
            map.merge(i, 1, Integer::sum)
        }
        var res = 0
        var sum = arr.size / 2

        for (v in map.values.sortedDescending()) {
            if (sum <= 0) break
            res++
            sum -= v
        }

        return res
    }
}
