package easy

/**
 * You are given a 0-indexed integer array nums.
 *
 * The distinct count of a subarray of nums is defined as:
 * * Let `nums[i..j]` be a subarray of nums consisting of all the indices from i to j such that 0 <= i <= j < nums.length.
 *
 * Then the number of distinct values in `nums[i..j]` is called the distinct count of `nums[i..j]`.
 * Return the sum of the squares of distinct counts of all subarrays of nums.
 *
 * A subarray is a contiguous non-empty sequence of elements within an array.
 *
 * [URL](https://leetcode.com/problems/assign-cookies/)
 */
object SubarraysDistinctElementSumOfSquaresI {
    fun sumCounts(nums: List<Int>): Int {
        var result = 0

        for (i in nums.indices) {
            val set = HashSet<Int>()
            for (j in i until nums.size) {
                set.add(nums[j])
                result += set.size * set.size
            }
        }

        return result
    }
}
