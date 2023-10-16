package arrays.hard

/**
 * You have a pointer at index 0 in an array of size arrLen. At each step, you can move 1 position to the left,
 * 1 position to the right in the array, or stay in the same place
 * (The pointer should not be placed outside the array at any time).
 *
 * Given two integers steps and arrLen, return the number of ways such that your pointer is still at index 0
 * after exactly steps steps. Since the answer may be too large, return it modulo 10^9 + 7.
 *
 * [URL](https://leetcode.com/problems/number-of-ways-to-stay-in-the-same-place-after-some-steps/)
 */
object NumberOfWaysToStayInTheSamePlaceAfterSomeSteps {
    fun numWays(steps: Int, arrLen: Int): Int {
        val mod = 1_000_000_007
        val len = minOf(arrLen, steps)
        val dp = Array(len) { IntArray(steps + 1) }
        dp[0][0] = 1
        for (remain in 1..steps) {
            for (curr in len - 1 downTo 0) {
                var ans = dp[curr][remain - 1]
                if (curr > 0) {
                    ans = (ans + dp[curr - 1][remain - 1]) % mod
                }
                if (curr < len - 1) {
                    ans = (ans + dp[curr + 1][remain - 1]) % mod
                }
                dp[curr][remain] = ans
            }
        }
        return dp[0][steps]
    }
}
