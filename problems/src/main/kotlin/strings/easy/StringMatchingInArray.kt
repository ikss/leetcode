package strings.easy

/**
 * Given an array of string words, return all strings in words that is a substring of another word.
 * You can return the answer in any order.
 *
 * A substring is a contiguous sequence of characters within a string
 *
 * [URL](https://leetcode.com/problems/string-matching-in-an-array/)
 */
object StringMatchingInArray {
    fun stringMatching(words: Array<String>): List<String> {
        val result = ArrayList<String>()
        val joined = words.joinToString()

        for (w in words) {
            if (joined.indexOf(w) != joined.lastIndexOf(w)) {
                result.add(w)
            }
        }

        return result
    }

    fun stringMatchingKMP(words: Array<String>): List<String> {
        val matchingWords = ArrayList<String>()

        for (currentWordIndex in words.indices) {
            val currentWord = words[currentWordIndex]
            val lps = computeLPSArray(currentWord)
            
            for (otherWordIndex in words.indices) {
                if (currentWordIndex == otherWordIndex) continue

                if (isSubstringOf(currentWord, words[otherWordIndex], lps)) {
                    matchingWords.add(currentWord)
                    break
                }
            }
        }

        return matchingWords
    }

    // Function to compute the LPS (Longest Prefix Suffix) array for the substring 'sub'.
    private fun computeLPSArray(sub: String): IntArray {
        val lps = IntArray(sub.length)
        var currentIndex = 1
        var len = 0

        while (currentIndex < sub.length) {
            if (sub[currentIndex] == sub[len]) {
                len++
                lps[currentIndex] = len
                currentIndex++
            } else {
                if (len > 0) {
                    len = lps[len - 1] // Backtrack using LPS array to find a shorter match.
                } else {
                    currentIndex++
                }
            }
        }
        return lps
    }

    // Function to check if 'sub' is a substring of 'main' using the KMP algorithm.
    private fun isSubstringOf(sub: String, main: String, lps: IntArray): Boolean {
        var mainIndex = 0
        var subIndex = 0

        while (mainIndex < main.length) {
            if (main[mainIndex] == sub[subIndex]) {
                mainIndex++
                subIndex++
                if (subIndex == sub.length) return true // Found a match.
            } else {
                if (subIndex > 0) {
                    subIndex = lps[subIndex - 1] // Use the LPS to skip unnecessary comparisons.
                } else {
                    mainIndex++
                }
            }
        }
        return false // No match found.
    }
}