package hard

/**
 * We define the lcp matrix of any 0-indexed string word of n lowercase English letters as an n x n grid such that:
 * * `lcp[i][j]` is equal to the length of the longest common prefix between the substrings `word[i,n-1]` and `word[j,n-1]`.
 *
 * Given an n x n matrix lcp, return the alphabetically smallest string word that corresponds to lcp.
 * If there is no such string, return an empty string.
 *
 * A string a is lexicographically smaller than a string b (of the same length) if in the first position
 * where a and b differ, string a has a letter that appears earlier in the alphabet than the corresponding letter in b.
 * For example, "aabd" is lexicographically smaller than "aaca" because the first position they differ is at the third
 * letter, and 'b' comes before 'c'.
 *
 * [URL](https://leetcode.com/problems/find-the-string-with-lcp/)
 */
object FindTheStringWithLCP {

    fun findTheString(lcp: Array<IntArray>): String {
        val n = lcp.size
        val word = CharArray(n)
        var current = 'a'

        // construct the string starting from 'a' to 'z' sequentially
        for (i in 0..<n) {
            if (word[i].code == 0) {
                if (current > 'z') {
                    return ""
                }
                word[i] = current
                for (j in i + 1..<n) {
                    if (lcp[i][j] > 0) {
                        word[j] = word[i]
                    }
                }
                current++
            }
        }

        // verify if the constructed string meets the LCP matrix requirements
        for (i in n - 1 downTo 0) {
            for (j in n - 1 downTo 0) {
                if (word[i] != word[j]) {
                    if (lcp[i][j] != 0) {
                        return ""
                    }
                } else if (i == n - 1 || j == n - 1) {
                    if (lcp[i][j] != 1) {
                        return ""
                    }
                } else if (lcp[i][j] != lcp[i + 1][j + 1] + 1) {
                    return ""
                }
            }
        }

        return String(word)
    }
}
