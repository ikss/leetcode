package easy

/**
 * You are given an integer n.
 *
 * Form a new integer x by concatenating all the non-zero digits of n in their original order.
 * If there are no non-zero digits, x = 0.
 *
 * Let sum be the sum of digits in x.
 *
 * Return an integer representing the value of x * sum.
 *
 *
 *
 * [URL](https://leetcode.com/problems/concatenate-non-zero-digits-and-multiply-by-sum-i/)
 */
object ConcatenateNonZeroDigitsAndMultiplyBySumI {
    fun sumAndMultiply(n: Int): Long {
        var sum = 0
        var newNum = 0

        var n = n
        var mul = 1
        while (n > 0) {
            val digit = n % 10
            n /= 10
            if (digit == 0) continue

            sum += digit
            newNum += digit * mul
            mul *= 10
        }

        return sum.toLong() * newNum
    }
}
