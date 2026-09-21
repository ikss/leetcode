package medium

/**
 * You are given an array of positive integers nums, and a positive integer k.
 *
 * You are allowed to perform an operation once on nums, where in each operation you can remove any non-overlapping
 * prefix and suffix from nums such that nums remains non-empty.
 *
 * You need to find the x-value of nums, which is the number of ways to perform this operation so that the product of
 * the remaining elements leaves a remainder of x when divided by k.
 *
 * Return an array result of size k where `result[x]` is the x-value of nums for 0 <= x <= k - 1.
 *
 * A prefix of an array is a subarray that starts from the beginning of the array and extends to any point within it.
 *
 * A suffix of an array is a subarray that starts at any point within the array and extends to the end of the array.
 *
 * Note that the prefix and suffix to be chosen for the operation can be empty.
 *
 * [URL](https://leetcode.com/problems/find-x-value-of-array-i/)
 */
object FindXValueOfArrayI {
    fun resultArray(nums: IntArray, k: Int): LongArray {
        val result = LongArray(k)

        var dp = LongArray(k)

        for (i in 0 until nums.size) {
            val newDp = LongArray(k)

            newDp[nums[i] % k]++

            for (r in dp.indices) {
                newDp[((r.toLong() * nums[i]) % k).toInt()] += dp[r]
            }
            dp = newDp
            for (r in dp.indices) {
                result[r] += dp[r]
            }
        }

        return result
    }

}