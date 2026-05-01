package medium

/**
 * You are given an integer array nums of length n.
 *
 * Assume arrk to be an array obtained by rotating nums by k positions clock-wise.
 * We define the rotation function F on nums as follow:
 * * `F(k) = 0 * arrk[0] + 1 * arrk[1] + ... + (n - 1) * arrk[n - 1]`.
 *
 * Return the maximum value of F(0), F(1), ..., F(n-1).
 *
 * The test cases are generated so that the answer fits in a 32-bit integer.
 *
 * [URL](https://leetcode.com/problems/rotate-function/)
 */
object RotateFunction {
    fun maxRotateFunction(nums: IntArray): Int {
        val n = nums.size
        var f = 0
        var sum = 0
        for (i in nums.indices) {
            val n = nums[i]
            sum += n
            f += n * i
        }
        var result = f

        for (i in n - 1 downTo 0) {
            f += sum - n * nums[i]
            result = maxOf(result, f)
        }

        return result
    }
}
