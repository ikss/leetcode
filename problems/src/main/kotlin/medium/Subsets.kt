package medium

/**
 * Given an integer array nums of unique elements, return all possible subsets (the power set).
 *
 * The solution set must not contain duplicate subsets. Return the solution in any order.
 *
 * [URL](https://leetcode.com/problems/subsets/)
 */
object Subsets {
    fun subsets(nums: IntArray): List<List<Int>> {
        val result = ArrayList<List<Int>>()
        result.add(emptyList())
        for (i in nums.indices) {
            backtrack(i, nums, arrayListOf(nums[i]), result)
        }
        return result
    }

    private fun backtrack(i: Int, nums: IntArray, curr: ArrayList<Int>, result: ArrayList<List<Int>>) {
        if (i == nums.size - 1) {
            result.add(ArrayList(curr))
            return
        }

        curr.add(nums[i + 1])
        backtrack(i + 1, nums, curr, result)
        curr.removeLast()
        backtrack(i + 1, nums, curr, result)
    }
}
