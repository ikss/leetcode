package hard

/**
 * Given an unsorted integer array nums, return the smallest missing positive integer.
 *
 * You must implement an algorithm that runs in O(n) time and uses constant extra space.
 *
 * [URL](https://leetcode.com/problems/first-missing-positive/)
 */
object FirstMissingPositive {
    fun firstMissingPositiveNaive(nums: IntArray): Int {
        val set = sortedSetOf<Int>()
        for (n in nums) {
            if (n > 0) set.add(n)
        }

        var min = 1
        for (el in set) {
            if (el != min) break
            min++
        }
        return min
    }

    fun firstMissingPositiveOptimized(nums: IntArray): Int {
        for (i in nums.indices) {
            while (nums[i] > 0 && nums[i] <= nums.size && (nums[nums[i] - 1] != nums[i])) {
                swap(nums, i, nums[i] - 1)
            }
        }
        for (i in nums.indices) {
            if (nums[i] != i + 1) return i + 1
        }
        return nums.size + 1
    }

    private fun swap(nums: IntArray, i: Int, j: Int) {
        val tmp = nums[i]
        nums[i] = nums[j]
        nums[j] = tmp
    }
}
