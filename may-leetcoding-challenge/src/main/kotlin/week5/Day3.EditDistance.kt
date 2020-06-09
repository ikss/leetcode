package week5

object EditDistance {

    /**
     * Min distance (Levenshtein) implementation with O(m*n) space and O (m*n) time complexity
     */
    fun minDistance(word1: String, word2: String): Int {
        val l1 = word1.length
        val l2 = word2.length
        if (l1 == 0) return l2
        if (l2 == 0) return l1

        val dp = Array(l1 + 1) { IntArray(l2 + 1) }
        for (i in 0..l1) {
            for (j in 0..l2) {
                when {
                    i == 0 -> dp[i][j] = j
                    j == 0 -> dp[i][j] = i
                    word1[i - 1] == word2[j - 1] -> dp[i][j] = dp[i - 1][j - 1]
                    // min of insert, remove, and replace operations
                    else -> dp[i][j] = 1 + minOf(dp[i][j - 1], dp[i - 1][j], dp[i - 1][j - 1])
                }
            }
        }
        return dp[l1][l2]
    }

    /**
     * Min distance (Levenshtein) implementation with O(n) space and O (m*n) time complexity
     */
    fun minDistanceOneArray(word1: String, word2: String): Int {
        val l1 = word1.length
        val l2 = word2.length
        if (l1 == 0) return l2
        if (l2 == 0) return l1

        val dp = IntArray(l2 + 1) { it }
        for (i in 1..l1) {
            var prev = i
            for (j in 1..l2) {
                val cur = if (word1[i - 1] == word2[j - 1]) {
                    dp[j - 1]
                } else {
                    minOf(dp[j - 1], prev, dp[j]) + 1
                }
                dp[j - 1] = prev
                prev = cur
            }
            dp[l2] = prev
        }
        return dp[l2]
    }
}
