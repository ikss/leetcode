package easy

/**
 * You are given a 0-indexed integer array nums and an integer k. Your task is to perform the following operation
 * exactly k times in order to maximize your score:
 * 1. Select an element m from nums.
 * 2. Remove the selected element m from the array.
 * 3. Add a new element with a value of m + 1 to the array.
 * 4. Increase your score by m.
 * 5. Return the maximum score you can achieve after performing the operation exactly k times.
 *
 * [URL](https://leetcode.com/problems/maximum-sum-with-exactly-k-elements/)
 */
object MaximumSumWithExactlyKElements {
    fun maximizeSum(nums: IntArray, k: Int): Int {
        val max = nums.max()

        return k * max + k * (k - 1) / 2
    }
}
