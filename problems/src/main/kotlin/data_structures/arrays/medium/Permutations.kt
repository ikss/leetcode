package data_structures.arrays.medium


/**
 * Given an array nums of distinct integers, return all the possible permutations. You can return the answer in any order.
 *
 * [URL](https://leetcode.com/problems/permutations/)
 */
object Permutations {
    fun permute(nums: IntArray): List<List<Int>> {
        val ret: MutableList<List<Int>> = mutableListOf()
        backtrack(ret, mutableSetOf(), nums)
        return ret
    }

    private fun backtrack(ret: MutableList<List<Int>>, tmpList: MutableSet<Int>, nums: IntArray) {
        if (tmpList.size == nums.size) {
            ret.add(tmpList.toList())
            return
        }
        for (i in nums.indices) {
            if (!tmpList.add(nums[i])) continue
            backtrack(ret, tmpList, nums)
            tmpList.remove(nums[i])
        }
    }
}
