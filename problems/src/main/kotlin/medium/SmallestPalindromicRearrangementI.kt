package medium

/**
 * You are given a palindromic string s.
 *
 * Return the lexicographically smallest palindromic permutation of s.
 *
 * [URL](https://leetcode.com/problems/smallest-palindromic-rearrangement-i/)
 */
object SmallestPalindromicRearrangementI {
    fun smallestPalindrome(s: String): String {
        val counts = IntArray(26)

        for (c in s) {
            counts[c - 'a']++
        }
        val n = s.length
        val result = StringBuilder(s)
        var placed = 0
        for (i in counts.indices) {
            var count = counts[i]
            if (count == 0) continue

            val char = 'a' + i
            while (count > 0) {
                if (count == 1) {
                    result[n / 2] = char
                    count--
                } else {
                    result[placed] = char
                    result[n - placed - 1] = char
                    placed++
                    count -= 2
                }
            }
        }

        return result.toString()
    }
}
