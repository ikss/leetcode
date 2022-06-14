package strings.medium


/**
 * Given an array of strings strs, group the anagrams together. You can return the answer in any order.
 *
 * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
 * typically using all the original letters exactly once.
 *
 * [URL](https://leetcode.com/problems/group-anagrams/
 */
object DeleteOperationOfTwoStrings {
    fun minDistanceDp(word1: String, word2: String): Int {
        val dp = Array(word1.length + 1) { IntArray(word2.length + 1) }
        for (i in 0..word1.length) {
            for (j in 0..word2.length) {
                if (i == 0 || j == 0) {
                    dp[i][j] = i + j
                } else if (word1[i - 1] == word2[j - 1]) {
                    dp[i][j] = dp[i - 1][j - 1]
                } else {
                    dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - 1]) + 1
                }
            }
        }
        return dp[word1.length][word2.length]
    }

    fun minDistanceDp1D(word1: String, word2: String): Int {
        var dp = IntArray(word2.length + 1)
        for (i in 0..word1.length) {
            val temp = IntArray(word2.length + 1)
            for (j in 0..word2.length) {
                if (i == 0 || j == 0) {
                    temp[j] = i + j
                } else if (word1[i - 1] == word2[j - 1]) {
                    temp[j] = dp[j - 1]
                } else {
                    temp[j] = Math.min(dp[j], temp[j - 1]) + 1
                }
            }
            dp = temp
        }
        return dp[word2.length]
    }
}
