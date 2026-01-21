package medium

/**
 * You are given an array nums consisting of n prime integers.
 *
 * You need to construct an array ans of length n, such that, for each index i, the bitwise OR of `ans[i] and ans[i] + 1`
 * is equal to `nums[i]`, i.e. `ans[i] OR (ans[i] + 1) == nums[i]`.
 *
 * Additionally, you must minimize each value of `ans[i]` in the resulting array.
 *
 * If it is not possible to find such a value for `ans[i]` that satisfies the condition, then set `ans[i] = -1`.
 *
 * [URL](https://leetcode.com/problems/construct-the-minimum-bitwise-array-ii/)
 */
object ConstructTheMinimumBitwiseArrayII {
    fun minBitwiseArray(nums: List<Int>): IntArray {
        val n = nums.size
        val result = IntArray(n)
        for (i in 0..<n) {
            val x = nums[i]
            var res = -1
            var d = 1
            while ((x and d) != 0) {
                res = x - d
                d = d shl 1
            }
            result[i] = res
        }
        return result
    }
}
