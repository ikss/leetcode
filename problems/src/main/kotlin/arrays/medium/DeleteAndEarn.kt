package arrays.medium

import java.util.*

/**
 * You are given an integer array nums. You want to maximize the number of points you get by performing
 * the following operation any number of times:
 * * Pick any `nums[i]` and delete it to earn `nums[i]` points.
 * Afterwards, you must delete every element equal to `nums[i] - 1` and every element equal to `nums[i] + 1`.
 *
 *  Return the maximum number of points you can earn by applying the above operation some number of times.
 *
 * [URL](https://leetcode.com/problems/delete-and-earn/)
 */
object DeleteAndEarn {
    fun deleteAndEarn(nums: IntArray): Int {
        val max = nums.max()
        val sum = IntArray(max + 1)
        for (n in nums) {
            sum[n] += n
        }

        for (i in 1 until max) {
            sum[i + 1] = maxOf(sum[i], sum[i - 1] + sum[i + 1])
        }
        return sum[max]
    }
}