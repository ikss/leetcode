package easy

/**
 * You are given a positive number n.
 *
 * Return the smallest number x greater than or equal to n, such that the binary representation of x contains only set bits
 *
 * [URL](https://leetcode.com/problems/smallest-number-with-all-set-bits/)
 */
object SmallestNumberWithAllSetBits {
    fun smallestNumber(n: Int): Int {
        var result = 1
        while (result <= n) {
            result *= 2
        }
        return result - 1
    }
}
