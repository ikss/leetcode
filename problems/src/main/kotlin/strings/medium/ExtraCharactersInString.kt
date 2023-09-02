package strings.medium

/**
 * You are given a 0-indexed string s and a dictionary of words dictionary.
 * You have to break s into one or more non-overlapping substrings such that each substring is present in dictionary.
 * There may be some extra characters in s which are not present in any of the substrings.
 *
 * Return the minimum number of extra characters left over if you break up s optimally.
 *
 * [URL](https://leetcode.com/problems/extra-characters-in-a-string/)
 */
object ExtraCharactersInString {
    fun minExtraChar(s: String, dictionary: Array<String>): Int {
        val n = s.length
        val set = dictionary.toSet()
        val dp = IntArray(n + 1)

        for (start in n - 1 downTo 0) {
            dp[start] = dp[start + 1] + 1
            for (end in start until n) {
                val curr = s.substring(start, end + 1)
                if (set.contains(curr)) {
                    dp[start] = minOf(dp[start], dp[end + 1])
                }
            }
        }

        return dp[0]
    }
}
