package data_structures.arrays.medium

import kotlin.random.Random

/**
 * Given an integer array nums, design an algorithm to randomly shuffle the array.
 * All permutations of the array should be equally likely as a result of the shuffling.

 * Implement the Solution class:

 *  * Solution(int[] nums) Initializes the object with the integer array nums.
 *  * int[] reset() Resets the array to its original configuration and returns it.
 *  * int[] shuffle() Returns a random shuffling of the array.
 *
 * [URL](https://leetcode.com/problems/shuffle-an-array/)
 */
@Suppress("unused")
class ShuffleAnArray(nums: IntArray) {
    private val oldNums = nums.copyOf()
    fun reset(): IntArray {
        return oldNums
    }

    fun shuffle(): IntArray {
        val nums = oldNums.copyOf()
        for (i in nums.indices) {
            val rnd = Random.nextInt(nums.size - i) + i
            val tmp = nums[rnd]
            nums[rnd] = nums[i]
            nums[i] = tmp
        }
        return nums
    }
}
