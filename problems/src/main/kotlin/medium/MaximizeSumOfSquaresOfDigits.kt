package medium

import java.util.ArrayDeque

/**
 * You are given two positive integers num and sum.
 *
 * A positive integer n is good if it satisfies both of the following:
 *
 * The number of digits in n is exactly num.
 * The sum of digits in n is exactly sum.
 * The score of a good integer n is the sum of the squares of digits in n.
 *
 * Return a string denoting the good integer n that achieves the maximum score.
 * If there are multiple possible integers, return the maximum one. If no such integer exists, return an empty string.
 *
 * [URL](https://leetcode.com/problems/maximize-sum-of-squares-of-digits/)
 */
object MaximizeSumOfSquaresOfDigits {
    fun maxSumOfSquares(num: Int, sum: Int): String {
        if (num * 9 < sum) return ""

        var num = num
        var sum = sum

        val result = StringBuilder(num)
        while (num-- > 0) {
            for (digit in 9 downTo 0) {
                if (sum - digit >= 0) {
                    sum -= digit
                    result.append(digit)
                    break
                }
            }
        }

        return result.toString()
    }
}
