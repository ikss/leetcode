package medium

/**
 * Given an integer n, return the nth digit of the infinite integer sequence `[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, ...]`.
 *
 * [URL](https://leetcode.com/problems/nth-digit/)
 */
object NthDigit {
    fun findNthDigit(n: Int): Int {
        var n = n
        var len = 1
        var count = 9L

        while (n > len * count) {
            n -= (len * count).toInt()
            len += 1
            count *= 10
        }

        val num = (count / 9) + (n - 1) / len
        val s = num.toString()
        return s[(n - 1) % len] - '0'
    }
}