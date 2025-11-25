package medium

/**
 * Given two positive integers left and right, find the two integers num1 and num2 such that:
 * * left <= num1 < num2 <= right .
 * * Both num1 and num2 are prime numbers.
 * * num2 - num1 is the minimum amongst all other pairs satisfying the above conditions.
 *
 * Return the positive integer array ans = [num1, num2]. If there are multiple pairs satisfying these conditions,
 * return the one with the smallest num1 value. If no such numbers exist, return `[-1, -1]`.
 *
 * [URL](https://leetcode.com/problems/closest-prime-numbers-in-range/)
 */
object ClosestPrimeNumbersInRange {
    fun closestPrimes(left: Int, right: Int): IntArray {
        var first = -1
        var second = -1

        var diff = Int.MAX_VALUE
        val result = intArrayOf(first, second)
        for (n in left..right) {
            if (checkIfPrime(n)) {
                first = second
                second = n
                if (first == -1 || second == -1) continue
                if (diff > second - first) {
                    result[0] = first
                    result[1] = second
                    diff = second - first
                }
                if (diff < 3) {
                    return result
                }
            }
        }
        return result
    }

    private fun checkIfPrime(num: Int): Boolean {
        if (num < 2) return false
        if (num < 4) return true
        if (num % 2 == 0) return false
        val upper = Math.sqrt(num.toDouble()).toInt()
        for (i in 3 .. upper step 2) {
            if (num % i == 0) return false
        }
        return true
    }
}
