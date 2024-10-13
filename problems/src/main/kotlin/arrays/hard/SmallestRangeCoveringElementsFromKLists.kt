package arrays.hard

import java.util.*

/**
 * You have k lists of sorted integers in non-decreasing order. Find the smallest range that includes at least one
 * number from each of the k lists.
 *
 * We define the range `[a, b]` is smaller than range `[c, d]` if b - a < d - c or a < c if b - a == d - c.
 *
 * [URL](https://leetcode.com/problems/smallest-range-covering-elements-from-k-lists/)
 */
object SmallestRangeCoveringElementsFromKLists {
    fun smallestRange(nums: List<List<Int>>): IntArray {
        val pq = PriorityQueue<IntArray> { a, b -> a[0] - b[0] }
        var maxVal = Int.MIN_VALUE
        var rangeStart = 0
        var rangeEnd = Int.MAX_VALUE

        for (i in nums.indices) {
            pq.offer(intArrayOf(nums[i][0], i, 0))
            maxVal = maxOf(maxVal, nums[i][0])
        }

        while (pq.size == nums.size) {
            val (minVal, row, col) = pq.poll()

            if (maxVal - minVal < rangeEnd - rangeStart) {
                rangeStart = minVal
                rangeEnd = maxVal
            }

            if (col + 1 < nums[row].size) {
                val nextVal = nums[row][col + 1]
                pq.offer(intArrayOf(nextVal, row, col + 1))
                maxVal = maxOf(maxVal, nextVal)
            }
        }

        return intArrayOf(rangeStart, rangeEnd)
    }
}