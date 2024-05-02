package arrays.easy

/**
 * Given an integer array nums that does not contain any zeros,
 * find the largest positive integer k such that -k also exists in the array.
 *
 * Return the positive integer k. If there is no such integer, return -1.
 *
 * [URL](https://leetcode.com/problems/largest-positive-integer-that-exists-with-its-negative/)
 */
object LargestPositiveIntegerThatExistsWithItsNegative {
    fun findMaxKSet(nums: IntArray): Int {
        val set = HashSet<Int>()
        var found = -1
        for (n in nums) {
            if (set.contains(n)) {
                found = maxOf(found, Math.abs(n))
            }
            set.add(-n)
        }

        return found
    }

    fun findMaxKTwoPointers(nums: IntArray): Int {
        nums.sort()
        var left = 0
        var right = nums.size - 1
        
        while (left < right) {
            if (nums[left] > 0 || nums[right] < 0) {
                break
            }
            val sum = nums[left] + nums[right]
            if (sum == 0) {
                return nums[right]
            } else if (sum < 0) {
                left++
            } else {
                right--
            }
        }
        return -1
    }
}
