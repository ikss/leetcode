package arrays.easy

/**
 * Given a 0-indexed integer array nums of length n and an integer k, return the number of pairs (i, j) where
 * 0 <= i < j < n, such that `nums[i] == nums[j]` and (i * j) is divisible by k.
 *
 * [URL](https://leetcode.com/problems/count-equal-and-divisible-pairs-in-an-array/)
 */
object CountEqualAndDivisiblePairsInArray {
    fun countPairs(nums: IntArray, k: Int): Int {
        var result = 0

        for (i in 0 until nums.size - 1) {
            for (j in i + 1 until nums.size) {
                if (nums[i] == nums[j] && (i * j) % k == 0) {
                    result++
                }
            }
        }

        return result
    }
}
