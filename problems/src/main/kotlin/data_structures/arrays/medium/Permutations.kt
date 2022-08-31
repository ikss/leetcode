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

    private fun backtrack(ret: MutableList<List<Int>>, used: MutableSet<Int>, nums: IntArray) {
        if (used.size == nums.size) {
            ret.add(used.toList())
            return
        }
        for (n in nums) {
            if (!used.add(n)) continue

            backtrack(ret, used, nums)
            used.remove(n)
        }
    }
}
