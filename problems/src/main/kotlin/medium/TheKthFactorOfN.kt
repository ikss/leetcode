package medium

/**
 * You are given two positive integers n and k. A factor of an integer n is defined as an integer i where n % i == 0.
 * Consider a list of all factors of n sorted in ascending order, return the kth factor in this list or return -1
 * if n has less than k factors.
 *
 * [URL](https://leetcode.com/problems/the-kth-factor-of-n/)
 */
object TheKthFactorOfN {
    fun kthFactor(n: Int, k: Int): Int {
        var k = k
        for (d in 1..n / 2) {
            if (n % d == 0 && --k == 0) {
                return d
            }
        }
        return if (k == 1) n else -1
    }

    fun kthFactorSqrt(n: Int, k: Int): Int {
        var k = k
        val root = Math.sqrt(n.toDouble())

        var i = 1
        while (i < root) {
            if (n % i == 0 && --k == 0) return i
            i++
        }

        for (i in root.toInt() downTo 1) {
            if (n % i == 0 && --k == 0) return n / i
        }

        return -1
    }
}