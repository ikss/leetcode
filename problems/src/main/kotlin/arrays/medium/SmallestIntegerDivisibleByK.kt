package arrays.medium

/**
 * Given a positive integer k, you need to find the length of the smallest positive integer n
 * such that n is divisible by k, and n only contains the digit 1.
 *
 * Return the length of n. If there is no such n, return -1.
 *
 * Note: n may not fit in a 64-bit signed integer.
 *
 * [URL](https://leetcode.com/problems/smallest-integer-divisible-by-k/)
 */
object SmallestIntegerDivisibleByK {
    fun smallestRepunitDivByK(k: Int): Int {
        var rem = 0
        for (len in 1..k) {
            rem = (rem * 10 + 1) % k
            if (rem == 0) {
                return len
            }
        }
        return -1
    }
}
