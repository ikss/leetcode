package easy

/**
 * You are given an integer n.
 *
 * Define its mirror distance as: abs(n - reverse(n)) where reverse(n) is the integer formed by reversing the digits of n.
 *
 * Return an integer denoting the mirror distance of n.
 *
 * abs(x) denotes the absolute value of x.
 *
 * [URL](https://leetcode.com/problems/mirror-distance-of-an-integer/)
 */
object MirrorDistanceOfAnInteger {
    fun mirrorDistance(n: Int): Int {
        val reverse = reverse(n)
        return Math.abs(n - reverse)
    }

    private fun reverse(n: Int): Int {
        var result = 0
        var n = n

        while (n > 0) {
            val rem = n % 10
            n /= 10

            if (rem == 0 && result == 0) continue

            result = result * 10 + rem
        }

        return result
    }
}
