package medium

/**
 * You are given an integer n. We reorder the digits in any order (including the original order)
 * such that the leading digit is not zero.
 *
 * Return true if and only if we can do this so that the resulting number is a power of two.
 *
 * [URL](https://leetcode.com/problems/reordered-power-of-2/)
 */
object ReorderedPowerOf2 {
    fun reorderedPowerOf2(n: Int): Boolean {
        val digits = countDigits(n)

        for (i in 0 until 31) {
            if (digits.contentEquals(countDigits(1 shl i))) {
                return true
            }
        }
        return false
    }

    private fun countDigits(n: Int): IntArray {
        val result = IntArray(10)
        var n = n
        while (n > 0) {
            result[n % 10]++
            n /= 10
        }

        return result
    }
}
