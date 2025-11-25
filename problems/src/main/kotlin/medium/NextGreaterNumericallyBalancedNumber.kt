package medium

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
        for (num in n + 1..10000000) {
            if (balanced(num)) {
                return num
            }
        }
        return -1
    }

    private fun balanced(num: Int): Boolean {
        var num = num
        val counts = IntArray(6)
        while (num > 0) {
            val i = num % 10
            if (i == 0 || i > 6) return false
            counts[i - 1]++
            num /= 10
        }
        for (d in 1..6) {
            if (counts[d - 1] > 0 && counts[d - 1] != d) {
                return false
            }
        }
        return true
    }
}
