package easy

/**
 * Given an integer n, return true if it is a power of four. Otherwise, return false.
 *
 * An integer n is a power of four, if there exists an integer x such that n == 4^x.
 *
 * [URL](https://leetcode.com/problems/power-of-four/)
 */
object PowerOfFour {
    fun isPowerOfFourCycle(n: Int): Boolean {
        if (n == 1) return true
        else if (n < 1) return false
        var n = n
        while (n > 1) {
            if (n % 4 != 0) return false
            n /= 4
        }
        return true
    }

    fun isPowerOfFourBit(num: Int): Boolean {
        // 0x55555555 (1010101010101010101010101010101) is to get rid of those power of 2 but not power of 4
        // so that the single 1 bit always appears at the odd position
        return num > 0 && (num and num - 1 == 0 && num and 0x55555555 != 0)
    }
}
