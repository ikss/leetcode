package arrays.medium

/**
 * An element x of an integer array arr of length m is dominant if more than half the elements of arr have a value of x.
 *
 * You are given a 0-indexed integer array nums of length n with one dominant element.
 *
 * You can split nums at an index i into two arrays `nums[0, ..., i]` and `nums[i + 1, ..., n - 1]`,
 * but the split is only valid if:
 * * 0 <= i < n - 1
 * * nums[0, ..., i], and nums[i + 1, ..., n - 1] have the same dominant element.
 *
 * Here, nums[i, ..., j] denotes the subarray of nums starting at index i and ending at index j,
 * both ends being inclusive. Particularly, if j < i then nums[i, ..., j] denotes an empty subarray.
 *
 * Return the minimum index of a valid split. If no valid split exists, return -1.
 *
 * [URL](https://leetcode.com/problems/minimum-index-of-a-valid-split/)
 */
object MinimumIndexOfValidSplit {
    fun minimumIndex(nums: List<Int>): Int {
        val dominant = findDominant(nums)
        val runningCount = IntArray(nums.size)

        for (i in nums.indices) {
            val num = nums[i]
            val prev = if (i == 0) 0 else runningCount[i - 1]

            runningCount[i] = prev + if (num == dominant) 1 else 0
        }

        for (i in 0 until nums.size - 1) {
            val prev = runningCount[i]
            val post = runningCount[nums.size - 1] - runningCount[i]

            if (prev > (i + 1) / 2 && post > (nums.size - i - 1) / 2) {
                return i
            }
        }

        return -1
    }

    private fun findDominant(nums: List<Int>): Int {
        val count = HashMap<Int, Int>()
        val dominantCount = nums.size / 2
        for (num in nums) {
            count[num] = count.getOrDefault(num, 0) + 1
            if (count[num]!! > dominantCount) {
                return num
            }
        }
        return -1
    }
}
