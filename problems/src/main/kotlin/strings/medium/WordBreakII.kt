package strings.medium

/**
 * Given a string s and a dictionary of strings wordDict, add spaces in s to construct a sentence where each word
 * is a valid dictionary word. Return all such possible sentences in any order.
 *
 * Note that the same word in the dictionary may be reused multiple times in the segmentation.
 *
 * [URL](https://leetcode.com/problems/word-break-ii/)
 */
object WordBreakII {
    fun wordBreak(s: String, wordDict: List<String>): List<String> {
        val result = ArrayList<String>()
        backtrack(s, wordDict.toSet(), 0, ArrayList(), result)
        return result
    }

    private fun backtrack(s: String, wordDict: Set<String>, curr: Int, currList: ArrayList<String>, result: ArrayList<String>) {
        if (curr == s.length) {
            result.add(currList.joinToString(" "))
            return
        }

        for (i in curr + 1 .. s.length) {
            val str = s.substring(curr, i)
            if (str !in wordDict) continue

            currList.add(str)
            backtrack(s, wordDict, curr + str.length, currList, result)
            currList.removeLast()
        }
    }
}

fun main() {
    println(WordBreakII.wordBreak("catsanddog", listOf("cat", "cats", "and", "sand", "dog"))) // [cats and dog, cat sand dog]
}