package arrays.medium


/**
 * Given a binary array nums and an integer goal, return the number of non-empty subarrays with a sum goal.
 *
 * A subarray is a contiguous part of the array.
 *
 * [URL](https://leetcode.com/problems/binary-subarrays-with-sum/)
 */
object BinarySubarraysWithSum {
    fun numSubarraysWithSumPrefixSum(nums: IntArray, goal: Int): Int {
        var sum = 0
        var result = 0

        val freq = HashMap<Int, Int>()

        for (num in nums) {
            sum += num
            if (sum == goal) {
                result++
            }

            freq[sum - goal]?.let {
                result += it
            }

            freq.merge(sum, 1, Int::plus)
        }

        return result
    }

    fun numSubarraysWithSumPrefixZeroes(nums: IntArray, goal: Int): Int {
        var sum = 0
        var result = 0
        var left = 0
        var prefixZeroes = 0

        for (right in nums.indices) {
            sum += nums[right]

            while ((sum > goal || nums[left] == 0) && left < right) {
                if (nums[left] == 1) {
                    prefixZeroes = 0
                } else {
                    prefixZeroes++
                }
                sum -= nums[left++]
            }

            if (sum == goal) {
                result += 1 + prefixZeroes
            }
        }
        return result
    }
}
