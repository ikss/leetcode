package strings.medium

/**
 * A string is considered beautiful if it satisfies the following conditions:
 * * Each of the 5 English vowels ('a', 'e', 'i', 'o', 'u') must appear at least once in it.
 * * The letters must be sorted in alphabetical order (i.e. all 'a's before 'e's, all 'e's before 'i's, etc.).
 *
 * For example, strings "aeiou" and "aaaaaaeiiiioou" are considered beautiful, but "uaeio", "aeoiu",
 * and "aaaeeeooo" are not beautiful.
 *
 * Given a string word consisting of English vowels, return the length of the longest beautiful substring of word.
 * If no such substring exists, return 0.
 *
 * A substring is a contiguous sequence of characters in a string.
 *
 * [URL](https://leetcode.com/problems/longest-substring-of-all-vowels-in-order/)
 */
object LongestSubstringOfAllVowelsInOrder {
    fun longestBeautifulSubstring(word: String): Int {
        var result = 0
        var currentLength = 0
        var vowelCount = 0
        for (i in word.indices) {
            if (i != 0 && word[i] < word[i - 1]) {
                vowelCount = 0
                currentLength = 0
            }
            currentLength++
            if (i == 0 || word[i] != word[i - 1]) vowelCount++
            if (vowelCount == 5) result = maxOf(result, currentLength)
        }
        return result
    }
}