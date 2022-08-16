package monthly_challenge.may_2020.week4

object UncrossedLines {
    fun maxUncrossedLines(A: IntArray, B: IntArray): Int {
        val m = A.size
        val n = B.size
        val dp = Array(m + 1) { IntArray(n + 1) }
        for (i in 0 until m) {
            for (j in 0 until n) {
                if (A[i] == B[j]) {
                    dp[i + 1][j + 1] = dp[i][j] + 1
                } else {
                    dp[i + 1][j + 1] = maxOf(dp[i + 1][j], dp[i][j + 1])
                }
            }
        }
        return dp[m][n]
    }
}
