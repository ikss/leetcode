package hard

/**
 * You are given two integers, m and k, and an integer array nums.
 *
 * A sequence of integers seq is called magical if:
 * * seq has a size of m.
 * * `0 <= seq[i] < nums.length`
 * * The binary representation of 2seq[0] + 2seq[1] + ... + 2seq[m - 1] has k set bits.
 *
 * The array product of this sequence is defined as prod(seq) = (nums[seq[0]] * nums[seq[1]] * ... * nums[seq[m - 1]]).
 *
 * Return the sum of the array products for all valid magical sequences.
 *
 * Since the answer may be large, return it modulo 10^9 + 7.
 *
 * A set bit refers to a bit in the binary representation of a number that has a value of 1.
 *
 * [URL](https://leetcode.com/problems/find-sum-of-array-product-of-magical-sequences/)
 */
object FindSumOfArrayProductOfMagicalSequences {
    fun quickmul(x: Long, y: Long, mod: Long): Long {
        var y = y
        var res = 1L
        var cur = x % mod
        while (y > 0) {
            if ((y and 1L) == 1L) {
                res = (res * cur) % mod
            }
            y = y shr 1
            cur = (cur * cur) % mod
        }
        return res
    }

    fun magicalSum(m: Int, k: Int, nums: IntArray): Int {
        val n = nums.size
        val mod = 1_000_000_007L
        val fac = LongArray(m + 1)
        fac[0] = 1
        for (i in 1..m) {
            fac[i] = (fac[i - 1] * i) % mod
        }
        val ifac = LongArray(m + 1)
        ifac[0] = 1
        ifac[1] = 1
        for (i in 2..m) {
            ifac[i] = quickmul(i.toLong(), mod - 2, mod)
        }
        for (i in 2..m) {
            ifac[i] = (ifac[i - 1] * ifac[i]) % mod
        }
        val numsPower = Array<LongArray>(n) { LongArray(m + 1) }
        for (i in 0..<n) {
            numsPower[i][0] = 1
            for (j in 1..m) {
                numsPower[i][j] = (numsPower[i][j - 1] * nums[i]) % mod
            }
        }
        val f = Array(n) {
            Array(m + 1) {
                Array(m * 2 + 1) {
                    LongArray(k + 1)
                }
            }
        }
        for (j in 0..m) {
            f[0][j][j][0] = (numsPower[0][j] * ifac[j]) % mod
        }
        var i = 0
        while (i + 1 < n) {
            for (j in 0..m) {
                for (p in 0..m * 2) {
                    for (q in 0..k) {
                        val q2 = (p % 2) + q
                        if (q2 > k) {
                            break
                        }
                        var r = 0
                        while (r + j <= m) {
                            val p2 = p / 2 + r
                            f[i + 1][j + r][p2][q2] += (((f[i][j][p][q] * numsPower[i + 1][r]) % mod) * ifac[r]) % mod
                            f[i + 1][j + r][p2][q2] %= mod
                            r++
                        }
                    }
                }
            }
            i++
        }
        var result = 0L
        for (p in 0..m * 2) {
            for (q in 0..k) {
                if (Integer.bitCount(p) + q == k) {
                    result = (result + ((f[n - 1][m][p][q] * fac[m]) % mod)) % mod
                }
            }
        }
        return result.toInt()
    }
}
