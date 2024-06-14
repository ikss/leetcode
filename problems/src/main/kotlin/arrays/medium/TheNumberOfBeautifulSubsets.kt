package arrays.medium

/**
 * You are given an array nums of positive integers and a positive integer k.
 *
 * A subset of nums is beautiful if it does not contain two integers with an absolute difference equal to k.
 *
 * Return the number of non-empty beautiful subsets of the array nums.
 *
 * A subset of nums is an array that can be obtained by deleting some (possibly none) elements from nums.
 * Two subsets are different if and only if the chosen indices to delete are different.
 *
 * [URL](https://leetcode.com/problems/the-number-of-beautiful-subsets/)
 */
object TheNumberOfBeautifulSubsets {
    fun beautifulSubsets(nums: IntArray, k: Int): Int {
        return backtrack(nums, 0, ArrayList(nums.size), k)
    }

    private fun backtrack(nums: IntArray, start: Int, currSet: ArrayList<Int>, k: Int): Int {
        if (start == nums.size) return if (currSet.size > 0) 1 else 0
        var result = 0
        if (canAdd(currSet, nums[start], k)) {
            currSet.add(nums[start])
            result += backtrack(nums, start + 1, currSet, k)
            currSet.removeAt(currSet.size - 1)
        }
        result += backtrack(nums, start + 1, currSet, k)
        return result
    }

    private fun canAdd(currSet: List<Int>, num: Int, k: Int): Boolean {
        for (n in currSet) {
            if (Math.abs(n - num) == k) return false
        }
        return true
    }
}