package easy

/**
 * You are given an integer array nums.
 *
 * You replace each element in nums with the sum of its digits.
 *
 * Return the minimum element in nums after all replacements.
 *
 * [URL](https://leetcode.com/problems/minimum-element-after-replacement-with-digit-sum/)
 */
object MinimumElementAfterReplacementWithDigitSum {
    fun minElement(nums: IntArray): Int {
        var result = Int.MAX_VALUE

        for (n in nums) {
            result = minOf(result, getDigitSum(n))
        }

        return result
    }

    private fun getDigitSum(n: Int): Int {
        var result = 0
        var n = n

        while (n > 0) {
            result += n % 10
            n /= 10
        }

        return result
    }
}