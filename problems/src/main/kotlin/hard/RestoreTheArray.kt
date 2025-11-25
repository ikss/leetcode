package hard

/**
 * A program was supposed to print an array of integers. The program forgot to print whitespaces and the array is
 * printed as a string of digits s and all we know is that all integers in the array were in the range `[1, k]`
 * and there are no leading zeros in the array.
 *
 * Given the string s and the integer k, return the number of the possible arrays that can be printed as s using
 * the mentioned program. Since the answer may be very large, return it modulo 10^9 + 7.
 *
 * [URL](https://leetcode.com/problems/restore-the-array/)
 */
object RestoreTheArray {
    fun numberOfArrays(s: String, k: Int): Int {
        val m = s.length
        val mod = 1_000_000_007

        val dp = IntArray(m + 1)
        dp[0] = 1

        for (start in 0 until m) {
            if (s[start] == '0') continue

            for (end in start until m) {
                val currNum = s.substring(start, end + 1)

                if (currNum.toLong() > k) break

                dp[end + 1] = (dp[end + 1] + dp[start]) % mod
            }
        }

        return dp[m]
    }
}
