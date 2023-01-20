package arrays.medium

/**
 * Given an integer array nums, return all the different possible non-decreasing subsequences of the given array
 * with at least two elements. You may return the answer in any order.
 *
 * [URL](https://leetcode.com/problems/non-decreasing-subsequences/)
 */
object NonDecreasingSubsequences {
    fun findSubsequences(nums: IntArray): List<List<Int>> {
        val result = mutableSetOf<MutableList<Int>>()

        for (i in 0 until nums.size - 1) {
            val current = mutableListOf(nums[i])
            traverse(i, nums, current, result)
        }

        return result.toList()
    }

    private fun traverse(start: Int, nums: IntArray, current: MutableList<Int>, result: MutableSet<MutableList<Int>>) {
        if (current.size > 1) {
            result.add(ArrayList(current))
        }
        for (i in start + 1 until nums.size) {
            val shouldAdd = nums[i] >= current.last()
            if (shouldAdd) {
                current.add(nums[i])
            }
            traverse(i, nums, current, result)
            if (shouldAdd) {
                current.removeLast()
            }
        }
    }
}

fun main() {
    val nums = intArrayOf(4, 6, 7, 7)
    println(NonDecreasingSubsequences.findSubsequences(nums))
}