package arrays.medium

/**
 * An integer x is numerically balanced if for every digit d in the number x,
 * there are exactly d occurrences of that digit in x.
 *
 * Given an integer n, return the smallest numerically balanced number strictly greater than n.
 *
 * [URL](https://leetcode.com/problems/next-greater-numerically-balanced-number/)
 */
object NextGreaterNumericallyBalancedNumber {
    fun nextBeautifulNumber(n: Int): Int {
        for (i in n + 1..1224444) {
            if (isBalance(i)) {
                return i
            }
        }
        return -1
    }

    private fun isBalance(x: Int): Boolean {
        var x = x
        val count = IntArray(10)
        while (x > 0) {
            count[x % 10]++
            x /= 10
        }
        for (d in 0..9) {
            if (count[d] > 0 && count[d] != d) {
                return false
            }
        }
        return true
    }
}
