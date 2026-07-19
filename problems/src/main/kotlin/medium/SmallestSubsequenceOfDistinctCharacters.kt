package medium

/**
 * Given a string s, return the lexicographically smallest subsequence of
 * s that contains all the distinct characters of s exactly once.
 *
 * [URL](https://leetcode.com/problems/smallest-subsequence-of-distinct-characters/)
 */
object SmallestSubsequenceOfDistinctCharacters {
    fun smallestSubsequence(s: String): String {
        val vis = BooleanArray(26)
        val num = IntArray(26)

        for (c in s) {
            num[c - 'a']++
        }

        val sb = StringBuilder(s.length)

        for (i in s.indices) {
            val c = s[i]
            if (!vis[c - 'a']) {
                while (sb.isNotEmpty() && sb[sb.length - 1] > c) {
                    if (num[sb[sb.length - 1] - 'a'] > 0) {
                        vis[sb[sb.length - 1] - 'a'] = false
                        sb.deleteCharAt(sb.length - 1)
                    } else {
                        break
                    }
                }
                vis[c - 'a'] = true
                sb.append(c)
            }
            num[c - 'a'] -= 1
        }

        return sb.toString()
    }
}
