package math.hard

/**
 * You are given three integers n, m, k. A good array arr of size n is defined as follows:
 *
 * Each element in arr is in the inclusive range `[1, m]`.
 * Exactly k indices i (where 1 <= i < n) satisfy the condition `arr[i - 1] == arr[i]`.
 * Return the number of good arrays that can be formed.
 *
 * Since the answer may be very large, return it modulo 10^9 + 7.
 *
 * [URL](https://leetcode.com/problems/count-the-number-of-arrays-with-k-matching-adjacent-elements/)
 */
object CountTheNumberOfArraysWithKMatchingAdjacentElements {
    private const val MX = 100000
    private const val MOD = 1_000_000_007
    private var fact = LongArray(MX)
    private var invFact = LongArray(MX)

    fun qpow(x: Long, n: Int): Long {
        var x = x
        var n = n
        var res: Long = 1
        while (n > 0) {
            if ((n and 1) == 1) {
                res = (res * x) % MOD
            }
            x = (x * x) % MOD
            n = n shr 1
        }
        return res
    }

    init {
        fact[0] = 1;
        for (i in 1..<MX) {
            fact[i] = (fact[i - 1] * i) % MOD;
        }
        invFact[MX - 1] = qpow(fact[MX - 1], MOD - 2);
        for (i in MX - 1 downTo 1) {
            invFact[i - 1] = (invFact[i] * i) % MOD;
        }
    }

    fun comb(n: Int, m: Int): Long {
        return (((fact[n] * invFact[m]) % MOD) * invFact[n - m]) % MOD
    }

    fun countGoodArrays(n: Int, m: Int, k: Int): Int {
        return ((((comb(n - 1, k) * m) % MOD) * qpow((m - 1).toLong(), n - k - 1)) %
                MOD).toInt()
    }
}
