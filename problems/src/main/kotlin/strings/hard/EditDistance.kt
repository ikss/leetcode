package strings.hard

/**
 * Given two strings word1 and word2, return the minimum number of operations required to convert word1 to word2.
 *
 * You have the following three operations permitted on a word:
 * * Insert a character
 * * Delete a character
 * * Replace a character
 *
 * [URL](https://leetcode.com/problems/edit-distance/)
 */
object EditDistance {
    fun minDistanceDp(word1: String, word2: String): Int {
        val l1 = word1.length
        val l2 = word2.length
        val dp = Array(word1.length + 1) { IntArray(word2.length + 1) }

        for (i in 0..l1) {
            for (j in 0..l2) {
                if (i == 0 || j == 0) {
                    dp[i][j] = maxOf(i, j)
                    continue
                }
                if (word1[i - 1] == word2[j - 1]) {
                    dp[i][j] = dp[i - 1][j - 1]
                } else {
                    dp[i][j] = minOf(dp[i - 1][j], dp[i][j - 1], dp[i - 1][j - 1]) + 1
                }
            }
        }

        return dp[l1][l2]
    }

    fun minDistanceDpMemOptimized(word1: String, word2: String): Int {
        val l1 = word1.length
        val l2 = word2.length
        var prev = IntArray(word2.length + 1) { it }
        println(prev.contentToString())
        for (i in 1..l1) {
            val curr = IntArray(word2.length + 1)
            curr[0] = i
            for (j in 1..l2) {
                if (word1[i - 1] == word2[j - 1]) {
                    curr[j] = prev[j - 1]
                } else {
                    curr[j] = minOf(prev[j], curr[j - 1], prev[j - 1]) + 1
                }
            }
            prev = curr
            println(prev.contentToString())
        }

        return prev[l2]
    }
}

fun main() {
    println(EditDistance.minDistanceDpMemOptimized("a", ""))
}
