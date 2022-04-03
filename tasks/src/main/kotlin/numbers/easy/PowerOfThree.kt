package numbers.easy

/**
 * Given an integer n, return true if it is a power of three. Otherwise, return false.
 * An integer n is a power of three, if there exists an integer x such that n == 3x.
 *
 * [URL](https://leetcode.com/problems/roman-to-integer/)
 */
object PowerOfThree {
    fun isPowerOfThree(n: Int): Boolean {
        if (n == 0) return false
        var i = n
        while (i % 3 == 0) {
            i /= 3
        }
        return i == 1
    }
}
