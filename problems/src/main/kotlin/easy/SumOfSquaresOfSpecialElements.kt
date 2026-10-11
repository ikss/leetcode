package easy

/**
 * You are given a 1-indexed integer array nums of length n.
 *
 * An element `nums[i]` of nums is called special if i divides n, i.e. n % i == 0.
 *
 * Return the sum of the squares of all special elements of nums.
 *
 * [URL](https://leetcode.com/problems/sum-of-squares-of-special-elements/)
 */
object SumOfSquaresOfSpecialElements {
    fun sumOfSquares(nums: IntArray): Int {
        var result = 0
        val n = nums.size

        for (i in nums.indices) {
            val num = nums[i]
            if (n % (i + 1) == 0) {
                result += num * num
            }
        }

        return result
    }
}