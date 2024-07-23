package arrays.easy

/**
 * Given an array of integers nums, sort the array in increasing order based on the frequency of the values.
 * If multiple values have the same frequency, sort them in decreasing order.
 *
 * Return the sorted array.
 *
 * [URL](https://leetcode.com/problems/sort-array-by-increasing-frequency/)
 */
object SortArrayByIncreasingFrequency {
    fun frequencySort(nums: IntArray): IntArray {
        val map = HashMap<Int, Int>()

        for (n in nums) {
            map.merge(n, 1, Int::plus)
        }

        return nums.sortedWith { n1, n2 ->
            val f1 = map[n1]!!
            val f2 = map[n2]!!
            if (f1 == f2) n2.compareTo(n1) else f1.compareTo(f2)
        }.toIntArray()
    }
}
