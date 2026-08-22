package easy

import data_structures.TreeNode
import java.util.*

/**
 * You are given a positive integer n. Determine whether n is divisible by the sum of the following two values:
 * * The digit sum of n (the sum of its digits).
 * * The digit product of n (the product of its digits).
 *
 * Return true if n is divisible by this sum; otherwise, return false.
 *
 * [URL](https://leetcode.com/problems/check-divisibility-by-digit-sum-and-product/)
 */
object CheckDivisibilityByDigitSumAndProduct {
    fun checkDivisibility(n: Int): Boolean {
        var sum = 0
        var product = 1

        var num = n

        while (num > 0) {
            val digit = num % 10
            num /= 10

            sum += digit
            product *= digit
        }

        return n % (sum + product) == 0
    }
}
