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
}