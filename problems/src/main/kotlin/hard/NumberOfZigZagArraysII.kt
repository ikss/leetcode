package hard

/**
 * You are given three integers n, l, and r.
 *
 * A ZigZag array of length n is defined as follows:
 * * Each element lies in the range `[l, r]`.
 * * No two adjacent elements are equal.
 * * No three consecutive elements form a strictly increasing or strictly decreasing sequence.
 *
 * Return the total number of valid ZigZag arrays.
 *
 * Since the answer may be large, return it modulo 10^9 + 7.
 *
 * A sequence is said to be strictly increasing if each element is strictly greater than its previous one (if exists).
 *
 * A sequence is said to be strictly decreasing if each element is strictly smaller than its previous one (if exists).
 *
 * [URL](https://leetcode.com/problems/number-of-zigzag-arrays-ii/)
 */
object NumberOfZigZagArraysII {
    private val MOD = 1_000_000_007
    class Matrix(var n: Int, var m: Int) {
        val data = LongArray(n * m)

        operator fun get(i: Int, j: Int): Long {
            return data[i * m + j]
        }

        operator fun set(i: Int, j: Int, `val`: Long) {
            data[i * m + j] = `val`
        }

        operator fun times(b: Matrix): Matrix {
            val res = Matrix(n, b.m)
            for (i in 0..<n) {
                for (k in 0..<m) {
                    val r = this[i, k]
                    if (r == 0L) {
                        continue
                    }

                    for (j in 0..<b.m) {
                        res[i, j] = (res[i, j] + r * b[k, j]) % MOD
                    }
                }
            }
            return res
        }

        fun pow(exp: Long, res: Matrix): Matrix {
            var exp = exp
            var res = res
            var base = Matrix(n, m)
            System.arraycopy(this.data, 0, base.data, 0, this.data.size)

            while (exp > 0) {
                if ((exp and 1L) == 1L) {
                    res *= base
                }
                base *= base
                exp = exp shr 1L.toInt()
            }
            return res
        }
    }

    fun zigZagArrays(n: Int, l: Int, r: Int): Int {
        val m = r - l + 1
        if (n == 1) {
            return m
        }

        val u = Matrix(2 * m, 2 * m)

        for (i in 0..<m) {
            for (j in 0..<i) {
                u[i, j + m] = 1L
            }
            for (j in i + 1..<m) {
                u[i + m, j] = 1L
            }
        }

        var dp = Matrix(1, 2 * m)
        for (i in 0..<2 * m) {
            dp[0, i] = 1L
        }

        dp = u.pow((n - 1).toLong(), dp)

        var result = 0L
        for (i in 0..<2 * m) {
            result = (result + dp[0, i]) % MOD
        }

        return result.toInt()
    }
}
