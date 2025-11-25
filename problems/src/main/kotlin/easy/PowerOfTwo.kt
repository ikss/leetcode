package easy

/**
 * Given an integer n, return true if it is a power of two. Otherwise, return false.
 *
 * An integer n is a power of two, if there exists an integer x such that n == 2^x.
 *
 * [URL](https://leetcode.com/problems/power-of-two/)
 */
object PowerOfTwo {
    fun isPowerOfTwo(n: Int): Boolean {
        return n > 0 && ((n and n - 1) == 0)
    }
}
