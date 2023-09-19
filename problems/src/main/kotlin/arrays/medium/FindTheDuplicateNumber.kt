package arrays.medium

/**
 * Given an array of integers nums containing n + 1 integers where each integer is in the range `[1, n]` inclusive.
 *
 * There is only one repeated number in nums, return this repeated number.
 *
 * You must solve the problem without modifying the array nums and uses only constant extra space.
 *
 * [URL](https://leetcode.com/problems/find-the-duplicate-number/)
 */
object FindTheDuplicateNumber {
    fun findDuplicate(nums: IntArray): Int {
        var slow = 0
        var fast = 0
        do {
            slow = nums[slow]
            fast = nums[nums[fast]]
        } while (slow != fast)

        slow = 0

        while (slow != fast) {
            slow = nums[slow]
            fast = nums[fast]
        }

        return slow
    }
}
