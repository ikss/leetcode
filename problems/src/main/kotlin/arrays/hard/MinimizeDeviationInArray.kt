package arrays.hard

import java.util.*


/**
 * You are given an array nums of n positive integers.
 *
 * You can perform two types of operations on any element of the array any number of times:
 * * If the element is even, divide it by 2.
 * * * For example, if the array is `[1,2,3,4]`, then you can do this operation on the last element,
 * and the array will be `[1,2,3,2]`.
 *
 * * If the element is odd, multiply it by 2.
 * * * For example, if the array is `[1,2,3,4]`, then you can do this operation on the first element,
 * and the array will be `[2,2,3,4]`.
 *
 * The deviation of the array is the maximum difference between any two elements in the array.
 *
 * Return the minimum deviation the array can have after performing some number of operations.
 *
 * [URL](https://leetcode.com/problems/minimize-deviation-in-array/)
 */
object MinimizeDeviationInArray {
    fun minimumDeviation(nums: IntArray): Int {
        val n = nums.size
        val pq = PriorityQueue<Int>(n, Collections.reverseOrder())

        var min = Int.MAX_VALUE
        var result = Int.MAX_VALUE

        for (i in nums.indices) {
            if (nums[i] % 2 == 1) {
                nums[i] *= 2
            }
            pq.add(nums[i])
            min = minOf(min, nums[i])
        }

        while (true) {
            val a = pq.poll()
            result = minOf(result, a - min)
            if (a % 2 == 1) break
            min = minOf(min, a / 2)
            pq.add(a / 2)
        }

        return result
    }
}
