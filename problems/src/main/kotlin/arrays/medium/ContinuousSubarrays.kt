package arrays.medium

import java.util.*

/**
 * You are given a 0-indexed integer array nums. A subarray of nums is called continuous if:
 *
 * Let i, i + 1, ..., j be the indices in the subarray.
 * Then, for each pair of indices `i <= i1, i2 <= j, 0 <= |nums[i1] - nums[i2]| <= 2`.
 * Return the total number of continuous subarrays.
 *
 * A subarray is a contiguous non-empty sequence of elements within an array.
 *
 * The distance used in this problem is the Manhattan distance: the distance between two cells (x0, y0) and (x1, y1)
 * is |x0 - x1| + |y0 - y1|.
 *
 * [URL](https://leetcode.com/problems/continuous-subarrays/)
 */
object ContinuousSubarrays {
    fun continuousSubarrays(nums: IntArray): Long {
        var result = 0L
        val map = TreeMap<Int, Int>()
        var left = 0
        for (right in nums.indices) {
            val nr = nums[right]
            map[nr] = map.getOrDefault(nr, 0) + 1

            while (map.lastEntry().key - map.firstEntry().key > 2) {
                val lr = nums[left]
                map[lr] = map[lr]!! - 1
                if (map[lr] == 0) {
                    map.remove(lr)
                }
                left++
            }

            result += right - left + 1
        }

        return result
    }
}
