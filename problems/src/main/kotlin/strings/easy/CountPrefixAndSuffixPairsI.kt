package strings.easy

/**
 * You are given a 0-indexed string array words.
 *
 * Let's define a boolean function isPrefixAndSuffix that takes two strings, str1 and str2:
 * * isPrefixAndSuffix(str1, str2) returns true if str1 is both a prefix and a suffix of str2, and false otherwise.
 *
 * For example, isPrefixAndSuffix("aba", "ababa") is true because "aba" is a prefix of "ababa" and also a suffix,
 * but isPrefixAndSuffix("abc", "abcd") is false.
 *
 * Return an integer denoting the number of index pairs (i, j) such that i < j,
 * and `isPrefixAndSuffix(words[i], words[j])` is true.
 *
 * [URL](https://leetcode.com/problems/check-if-the-sentence-is-pangram/)
 */
object CountPrefixAndSuffixPairsI {
    fun countPrefixSuffixPairs(words: Array<String>): Int {
        var result = 0
        
        for (i in 0 until words.size - 1) {
            val str1 = words[i]
            for (j in i + 1 until words.size) {
                val str2 = words[j]
                if (str2.startsWith(str1) && str2.endsWith(str1)) {
                    result++
                }
            }
        }
        return result
    }
}