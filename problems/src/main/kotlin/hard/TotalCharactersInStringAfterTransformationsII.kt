package hard

/**
 * You are given a string s consisting of lowercase English letters, an integer t representing the number of transformations to perform, and an array nums of size 26. In one transformation, every character in s is replaced according to the following rules:
 *
 * * Replace `s[i]` with the next `nums[s[i] - 'a']` consecutive characters in the alphabet. For example,
 * if `s[i] = 'a'` and nums[0] = 3, the character 'a' transforms into the next 3 consecutive characters ahead of it,
 * which results in "bcd".
 * * The transformation wraps around the alphabet if it exceeds 'z'. For example, if `s[i] = 'y'` and `nums[24] = 3`,
 * the character 'y' transforms into the next 3 consecutive characters ahead of it, which results in "zab".
 *
 * Return the length of the resulting string after exactly t transformations.
 *
 * Since the answer may be very large, return it modulo 10^9 + 7.
 *
 * [URL](https://leetcode.com/problems/total-characters-in-string-after-transformations-ii/)
 */
object TotalCharactersInStringAfterTransformationsII {
    private val MOD: Int = 1e9.toInt() + 7
    private val L: Int = 26

    private class Mat {
        var a: Array<IntArray> = Array(L) { IntArray(L) }

        constructor()

        constructor(copyFrom: Mat) {
            for (i in 0..<L) {
                System.arraycopy(copyFrom.a[i], 0, this.a[i], 0, L)
            }
        }

        fun mul(other: Mat): Mat {
            val result = Mat()
            for (i in 0..<L) {
                for (j in 0..<L) {
                    for (k in 0..<L) {
                        result.a[i][j] = ((result.a[i][j] + a[i][k].toLong() * other.a[k][j]) % MOD).toInt()
                    }
                }
            }
            return result
        }
    }

    /* identity matrix */
    private fun I(): Mat {
        val m = Mat()
        for (i in 0..<L) {
            m.a[i][i] = 1
        }
        return m
    }

    /* matrix exponentiation by squaring */
    private fun quickmul(x: Mat, y: Int): Mat {
        var y = y
        var ans = I()
        var cur = Mat(x)
        while (y > 0) {
            if ((y and 1) == 1) {
                ans = ans.mul(cur)
            }
            cur = cur.mul(cur)
            y = y shr 1
        }
        return ans
    }

    fun lengthAfterTransformations(s: String, t: Int, nums: List<Int>): Int {
        val T = Mat()
        for (i in 0..<L) {
            for (j in 1..nums[i]) {
                T.a[(i + j) % L][i] = 1
            }
        }

        val res = quickmul(T, t)
        val f = IntArray(L)
        for (ch in s.toCharArray()) {
            f[ch.code - 'a'.code]++
        }
        var ans = 0
        for (i in 0..<L) {
            for (j in 0..<L) {
                ans = ((ans + res.a[i][j].toLong() * f[j]) % MOD).toInt()
            }
        }
        return ans
    }
}
