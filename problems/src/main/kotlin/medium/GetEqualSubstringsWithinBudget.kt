package medium

/**
 * You are given two strings s and t of the same length and an integer maxCost.
 *
 * You want to change s to t. Changing the ith character of s to ith character of t costs `|s[i] - t[i]|`
 * (i.e., the absolute difference between the ASCII values of the characters).
 *
 * Return the maximum length of a substring of s that can be changed to be the same as the corresponding substring of t
 * with a cost less than or equal to maxCost. If there is no substring from s that can be changed to its corresponding
 * substring from t, return 0.
 *
 * [URL](https://leetcode.com/problems/get-equal-substrings-within-budget/)
 */
object GetEqualSubstringsWithinBudget {
    fun equalSubstring(s: String, t: String, maxCost: Int): Int {
        var result = 0
        var start = 0
        var currCost = 0
        for (i in s.indices) {
            val diff = Math.abs(s[i] - t[i])

            if (diff > 0) {
                currCost += diff
                while (currCost > maxCost) {
                    currCost -= Math.abs(s[start] - t[start])
                    start++
                }
            }
            result = maxOf(result, i - start + 1)
        }

        return result
    }
}