package medium

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
    fun longestPalindromeOld(words: Array<String>): Int {
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

    fun longestPalindromeSimpleMap(words: Array<String>): Int {
        val wordsMap = HashMap<Pair<Char, Char>, Int>()

        var result = 0
        for (w in words) {
            val pair = w[0] to w[1]
            wordsMap[pair] = wordsMap.getOrDefault(pair, 0) + 1
        }

        var hasSame = false
        for ((k, v) in wordsMap) {
            var variable = v
            if (v % 2 != 0 && k.first == k.second) {
                hasSame = true
                variable--
            }
            result += minOf(variable, wordsMap.getOrDefault(k.second to k.first, 0)) * 2
        }
        if (hasSame) {
            result += 2
        }
        return result
    }
}