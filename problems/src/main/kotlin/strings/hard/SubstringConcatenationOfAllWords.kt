package strings.hard


/**
 * You are given a string s and an array of strings words of the same length.Return all starting indices of substring(s)
 * in s that is a concatenation of each word in words exactly once, in any order, and without any intervening characters.
 *
 * You can return the answer in any order.
 *
 * [URL](https://leetcode.com/problems/substring-with-concatenation-of-all-words/)
 */
object SubstringConcatenationOfAllWords {
    private val wordCount = HashMap<String, Int>()
    private var n = 0
    private var wordLength = 0
    private var substringSize = 0
    private var k = 0

    private fun slidingWindow(left: Int, s: String, answer: MutableList<Int>) {
        var left = left
        val wordsFound: HashMap<String, Int> = HashMap()
        var wordsUsed = 0
        var excessWord = false

        // Do the same iteration pattern as the previous approach - iterate
        // word_length at a time, and at each iteration we focus on one word
        var right = left
        while (right <= n - wordLength) {
            val sub = s.substring(right, right + wordLength)
            if (!wordCount.containsKey(sub)) {
                // Mismatched word - reset the window
                wordsFound.clear()
                wordsUsed = 0
                excessWord = false
                left = right + wordLength
            } else {
                // If we reached max window size or have an excess word
                while (right - left == substringSize || excessWord) {
                    val leftmostWord = s.substring(left, left + wordLength)
                    left += wordLength
                    wordsFound[leftmostWord] = wordsFound[leftmostWord]!! - 1
                    if (wordsFound[leftmostWord]!! >= wordCount[leftmostWord]!!) {
                        // This word was an excess word
                        excessWord = false
                    } else {
                        // Otherwise we actually needed it
                        wordsUsed--
                    }
                }

                // Keep track of how many times this word occurs in the window
                wordsFound[sub] = wordsFound.getOrDefault(sub, 0) + 1
                if (wordsFound[sub]!! <= wordCount[sub]!!) {
                    wordsUsed++
                } else {
                    // Found too many instances already
                    excessWord = true
                }
                if (wordsUsed == k && !excessWord) {
                    // Found a valid substring
                    answer.add(left)
                }
            }
            right += wordLength
        }
    }

    fun findSubstring(s: String, words: Array<String>): List<Int>? {
        wordCount.clear()
        n = s.length
        k = words.size
        wordLength = words[0].length
        substringSize = wordLength * k
        for (word in words) {
            wordCount[word] = wordCount.getOrDefault(word, 0) + 1
        }
        val answer = mutableListOf<Int>()
        for (i in 0 until wordLength) {
            slidingWindow(i, s, answer)
        }
        return answer
    }
}
