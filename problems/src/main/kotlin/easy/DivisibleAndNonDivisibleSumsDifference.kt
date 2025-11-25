package easy

/**
 * You are given positive integers n and m.
 *
 * Define two integers, num1 and num2, as follows:
 * * num1: The sum of all integers in the range [1, n] that are not divisible by m.
 * * num2: The sum of all integers in the range [1, n] that are divisible by m.
 *
 * Return the integer num1 - num2.
 *
 * [URL](https://leetcode.com/problems/divisible-and-non-divisible-sums-difference/)
 */
object DivisibleAndNonDivisibleSumsDifference {
    fun differenceOfSumsBruteForce(n: Int, m: Int): Int {
        var result = 0

        for (i in 1..n) {
            if (i % m == 0) {
                result -= i
            } else {
                result += i
            }
        }

        return result
    }

    fun differenceOfSumsMath(n: Int, m: Int): Int {
        val total = (1 + n) * n / 2

        val divisible = (1 + n / m) * (n / m) * m

        return total - divisible
    }
}
