package medium

/**
 * You are given a 0-indexed array nums consisiting of positive integers. You can do the following operation on the array any number of times:
 * * Select an index i such that 0 <= i < n - 1 and replace either of `nums[i]` or `nums[i+1]` with their gcd value.
 *
 * Return the minimum number of operations to make all elements of nums equal to 1. If it is impossible, return -1.
 *
 * The gcd of two integers is the greatest common divisor of the two integers.
 *
 * [URL](https://leetcode.com/problems/minimum-number-of-operations-to-make-all-array-elements-equal-to-1/)
 */
object MinimumNumberOfOperationsToMakeAllArrayElementsEqualTo1 {

    fun minOperations(nums: IntArray): Int {
        val n = nums.size
        var num1 = 0
        var g = 0
        for (x in nums) {
            if (x == 1) {
                num1++
            }
            g = gcd(g, x)
        }
        if (num1 > 0) {
            return n - num1
        }
        if (g > 1) {
            return -1
        }

        var minLen = n
        for (i in 0..<n) {
            var currGcd = 0
            for (j in i..<n) {
                currGcd = gcd(currGcd, nums[j])
                if (currGcd == 1) {
                    minLen = minOf(minLen, j - i + 1)
                    break
                }
            }
        }
        return minLen + n - 2
    }

    private fun gcd(a: Int, b: Int): Int {
        if (b == 0) return a
        return gcd(b, a % b)
    }
}
