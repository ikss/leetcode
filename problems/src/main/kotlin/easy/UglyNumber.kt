package easy

/**
 * An ugly number is a positive integer whose prime factors are limited to 2, 3, and 5.
 *
 * Given an integer n, return true if n is an ugly number.
 *
 * [URL](https://leetcode.com/problems/ugly-number/)
 */
object UglyNumber {
    fun isUgly(n: Int): Boolean {
        if (n < 1) return false
        if (n < 7) return true

        var n = n

        while (n > 1) {
            n /= when {
                n % 2 == 0 -> 2
                n % 3 == 0 -> 3
                n % 5 == 0 -> 5
                else -> return false
            }
        }
        return true
    }
}
