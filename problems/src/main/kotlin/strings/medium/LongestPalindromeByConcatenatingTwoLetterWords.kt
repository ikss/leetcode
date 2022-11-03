package strings.medium

/**
 * You are given an array of strings words. Each element of words consists of two lowercase English letters.
 *
 * Create the longest possible palindrome by selecting some elements from words and concatenating them in any order.
 * Each element can be selected at most once.
 *
 * Return the length of the longest palindrome that you can create. If it is impossible to create any palindrome,
 * return 0.
 *
 * A palindrome is a string that reads the same forward and backward.
 *
 * [URL](https://leetcode.com/problems/longest-palindrome-by-concatenating-two-letter-words/)
 */
object LongestPalindromeByConcatenatingTwoLetterWords {
    fun longestPalindrome(words: Array<String>): Int {
        val map = hashMapOf<String, Int>()

        var result = 0
        for (w in words) {
            val i = map[w]
            if (i != null) {
                result += 4
                if (i == 1) {
                    map.remove(w)
                } else {
                    map[w] = i - 1
                }
            } else {
                map.merge(w.reversed(), 1, Integer::sum)
            }
        }
        for ((w, c) in map) {
            if (c == 1 && w[0] == w[1]) {
                result += 2
                break
            }
        }
        return result
    }
}