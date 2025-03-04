package numbers.medium

/**
 * Given an integer n, return true if it is possible to represent n as the sum of distinct powers of three.
 * Otherwise, return false.
 *
 * An integer y is a power of three if there exists an integer x such that y == 3x.
 *
 * [URL](https://leetcode.com/problems/check-if-number-is-a-sum-of-powers-of-three/)
 */
object CheckIfNumberIsSumOfPowersOfThree {
    fun checkPowersOfThree(n: Int): Boolean {
        var maxMul = getMaxMul(n)

        var n = n
        while (maxMul > 0 && n > 0) {
            if (maxMul <= n) {
                n -= maxMul
            }
            maxMul /= 3
        }
        return n == 0
    }

    private fun getMaxMul(n: Int): Int {
        var mul = 1

        while (mul * 3 <= n) {
            mul *= 3
        }

        return mul
    }
}