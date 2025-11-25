package easy

/**
 * Given an integer array sorted in non-decreasing order,
 * there is exactly one integer in the array that occurs more than 25% of the time, return that integer.
 *
 * [URL](https://leetcode.com/problems/element-appearing-more-than-25-in-sorted-array/)
 */
object ElementAppearingMoreThanQuarterInSortedArray {
    fun findSpecialInteger(arr: IntArray): Int {
        val count = arr.size / 4

        for (i in 0 until arr.size - count) {
            if (arr[i] == arr[i + count]) {
                return arr[i]
            }
        }
        return -1
    }
}
