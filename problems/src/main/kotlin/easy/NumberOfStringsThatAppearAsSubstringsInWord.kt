package easy

/**
 * Given an array of strings patterns and a string word,
 * return the number of strings in patterns that exist as a substring in word.
 *
 * A substring is a contiguous sequence of characters within a string.
 *
 * [URL](https://leetcode.com/problems/number-of-strings-that-appear-as-substrings-in-word/)
 */
object NumberOfStringsThatAppearAsSubstringsInWord {
    fun numOfStringsNaive(patterns: Array<String>, word: String): Int {
        return patterns.count { it in word }
    }

    fun numOfStringsKMP(patterns: Array<String>, word: String): Int {
        return patterns.count { check(it, word) }
    }


    fun numOfStrings(patterns: Array<String>, word: String): Int {
        var res = 0
        for (pattern in patterns) {
            if (check(pattern, word)) {
                res++
            }
        }
        return res
    }

    private fun check(pattern: String, word: String): Boolean {
        val m = pattern.length
        val n = word.length

        // generate the prefix array of the pattern
        val pi = IntArray(m)
        var i = 1
        var j = 0
        while (i < m) {
            while (j > 0 && pattern[i] != pattern[j]) {
                j = pi[j - 1]
            }
            if (pattern[i] == pattern[j]) {
                j++
            }
            pi[i] = j
            i++
        }

        // using prefix arrays for matching
        i = 0
        j = 0
        while (i < n) {
            while (j > 0 && word[i] != pattern[j]) {
                j = pi[j - 1]
            }
            if (word[i] == pattern[j]) {
                j++
            }
            if (j == m) {
                return true
            }
            i++
        }
        return false
    }
}