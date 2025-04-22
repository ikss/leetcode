package arrays.hard

/**
 * You are given two integers n and maxValue, which are used to describe an ideal array.
 *
 * A 0-indexed integer array arr of length n is considered ideal if the following conditions hold:
 *
 * Every `arr[i]` is a value from 1 to maxValue, for 0 <= i < n.
 * Every `arr[i]` is divisible by `arr[i - 1]`, for 0 < i < n.
 * Return the number of distinct ideal arrays of length n. Since the answer may be very large, return it modulo 10^9 + 7.
 *
 * [URL](https://leetcode.com/problems/count-the-number-of-ideal-arrays/)
 */
object CountTheNumberOfIdealArrays {
    private val mod = 1e9.toInt() + 7

    fun idealArraysMemoryLimitExceeded(n: Int, maxValue: Int): Int {
        val cache = Array(n + 1) { IntArray(maxValue + 1) { -1 } }

        var result = 0

        for (curr in 1..maxValue) {
            result += calculate(0, curr, n, maxValue, cache)
            result %= mod
        }

        return result
    }

    private fun calculate(currPos: Int, currNum: Int, n: Int, maxValue: Int, cache: Array<IntArray>): Int {
        if (currPos == n - 1) {
            return 1
        }

        if (cache[currPos][currNum] != -1) {
            return cache[currPos][currNum]
        }

        var result = 0

        val maxMul = maxValue / currNum
        for (mul in 1..maxMul) {
            result += calculate(currPos + 1, currNum * mul, n, maxValue, cache)
            result %= mod
        }
        cache[currPos][currNum] = result
        return result
    }

    fun idealArraysCombinatorics(n: Int, maxValue: Int): Int {
        val MOD = 1e9.toInt() + 7
        val MAX_N = 10010
        val MAX_P = 15 // There are up to 15 prime factors
        val c = Array(MAX_N + MAX_P) { IntArray(MAX_P + 1) }
        val sieve = IntArray(MAX_N) // Minimum prime factor
        val ps = Array<ArrayList<Int>>(MAX_N) { ArrayList() } // List of prime factor counts

        for (i in 2..<MAX_N) {
            if (sieve[i] == 0) {
                var j = i
                while (j < MAX_N) {
                    if (sieve[j] == 0) {
                        sieve[j] = i
                    }
                    j += i
                }
            }
        }

        for (i in 2..<MAX_N) {
            var x = i
            while (x > 1) {
                val p = sieve[x]
                var cnt = 0
                while (x % p == 0) {
                    x /= p
                    cnt++
                }
                ps[i].add(cnt)
            }
        }

        c[0][0] = 1
        for (i in 1..<MAX_N + MAX_P) {
            c[i][0] = 1
            for (j in 1..minOf(i, MAX_P)) {
                c[i][j] = (c[i - 1][j] + c[i - 1][j - 1]) % MOD
            }
        }

        var ans = 0L
        for (x in 1..maxValue) {
            var mul = 1L
            for (p in ps[x]) {
                mul = (mul * c[n + p - 1][p]) % MOD
            }
            ans = (ans + mul) % MOD
        }
        return ans.toInt()
    }

}
