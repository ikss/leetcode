package easy

/**
 * You are given an integer array nums.
 *
 * Return the smallest index i such that the sum of the digits of `nums[i]` is equal to i.
 *
 * If no such index exists, return -1.
 *
 * [URL](https://leetcode.com/problems/smallest-index-with-digit-sum-equal-to-index/)
 */
object SmallestIndexWithDigitSumEqualToIndex {
    fun smallestIndex(nums: IntArray): Int {
        for (i in nums.indices) {
            val n = nums[i]
            if (digitsSum(n) == i) {
                return i
            }
        }

        return -1
    }

    private fun digitsSum(n: Int): Int {
        var sum = 0
        var n = n

        while (n > 0) {
            sum += n % 10
            n /= 10
        }

        return sum
    }
}
