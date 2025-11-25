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
object GetEqualSubstringWithBudget {
    fun equalSubstring(s: String, t: String, maxCost: Int): Int {
        val costs = IntArray(s.length)
        for (i in s.indices) {
            costs[i] = Math.abs(s[i] - t[i])
        }
        val totalCost = costs.sum()
        if (totalCost <= maxCost) return s.length

        var result = 0
        var start = 0
        var end = 0
        var rollingCost = 0

        while (start < s.length) {
            if (rollingCost > maxCost) {
                rollingCost -= costs[start++]
            } else {
                rollingCost += costs[end++]
            }

            if (rollingCost <= maxCost) {
                result = maxOf(result, end - start)
                if (end == s.length) break
            }
        }
        return result
    }
}
