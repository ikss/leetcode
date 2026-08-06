package easy

/**
 * You are given two integers n and t.
 * Return the smallest number greater than or equal to n such that the product of its digits is divisible by t.
 *
 * [URL](https://leetcode.com/problems/smallest-divisible-digit-product-i/)
 */
object SmallestDivisibleDigitProductI {
    fun smallestNumber(n: Int, t: Int): Int {
        var n = n

        while (getProduct(n) % t != 0) {
            n++
        }
        return n
    }

    private fun getProduct(n: Int): Int {
        if (n < 10) return n
        var n = n
        var result = 1

        while (n > 0) {
            result *= n % 10
            n /= 10
        }

        return result
    }
}
