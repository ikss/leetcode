package numbers.easy

/**
 * Given an integer n, return true if it is a power of four. Otherwise, return false.
 *
 * An integer n is a power of four, if there exists an integer x such that n == 4^x.
 *
 * [URL](https://leetcode.com/problems/power-of-four/)
 */
object PowerOfFour {
    fun isPowerOfFour(n: Int): Boolean {
        if (n <= 0) return false
        var i = n
        while (i % 4 == 0) {
            i /= 4
        }
        return i == 1
    }
}
