package medium

/**
 * You are given a positive integer n.
 *
 * Return the maximum product of any two digits in n.
 *
 * Note: You may use the same digit twice if it appears more than once in n.
 *
 * [URL](https://leetcode.com/problems/maximum-product-of-two-digits/)
 */
object MaximumProductOfTwoDigits {
    fun maxProduct(n: Int): Int {
        var i1 = 0
        var i2 = 0

        var n = n
        while (n > 0) {
            val digit = n % 10
            n /= 10

            if (digit > i1) {
                i2 = maxOf(i1, i2)
                i1 = digit
            } else if (digit > i2) {
                i2 = digit
            }
        }

        return i1 * i2
    }
}
