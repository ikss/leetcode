package arrays.easy

/**
 * The XOR total of an array is defined as the bitwise XOR of all its elements, or 0 if the array is empty.
 * * For example, the XOR total of the array [2,5,6] is 2 XOR 5 XOR 6 = 1.
 *
 * Given an array nums, return the sum of all XOR totals for every subset of nums.
 *
 * Note: Subsets with the same elements should be counted multiple times.
 *
 * An array a is a subset of an array b if a can be obtained from b by deleting some (possibly zero) elements of b.
 *
 * [URL](https://leetcode.com/problems/sum-of-all-subset-xor-totals/)
 */
object SumOfAllSubsetXORTotals {
    fun subsetXORSum(nums: IntArray): Int {
        return traverse(0, nums, 0)
    }

    private fun traverse(i: Int, nums: IntArray, curr: Int): Int {
        if (i == nums.size) {
            return curr
        }
        var result = 0
        result += traverse(i + 1, nums, curr xor nums[i])

        result += traverse(i + 1, nums, curr)

        return result
    }
}