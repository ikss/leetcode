package medium

/**
 * Given a string s and a dictionary of strings wordDict, add spaces in s to construct a sentence where each word
 * is a valid dictionary word. Return all such possible sentences in any order.
 *
 * Note that the same word in the dictionary may be reused multiple times in the segmentation.
 *
 * [URL](https://leetcode.com/problems/word-break-ii/)
 */
object WordBreakII {
    fun wordBreakBacktrack(s: String, wordDict: List<String>): List<String> {
        val result = ArrayList<String>()
        backtrack(s, wordDict.toSet(), 0, ArrayList(), result)
        return result
    }

    private fun backtrack(
        s: String,
        wordDict: Set<String>,
        curr: Int,
        currList: ArrayList<String>,
        result: ArrayList<String>,
    ) {
        if (curr == s.length) {
            result.add(currList.joinToString(" "))
            return
        }

        for (i in curr + 1..s.length) {
            val str = s.substring(curr, i)
            if (str !in wordDict) continue

            currList.add(str)
            backtrack(s, wordDict, curr + str.length, currList, result)
            currList.removeLast()
        }
    }

    fun wordBreakDp(s: String, wordDict: List<String>): List<String> {
        val dp = Array<ArrayList<String>>(s.length + 1) { ArrayList() }
        dp[0] = arrayListOf("")
        for (i in s.indices) {
            for (word in wordDict) {
                if (i < word.length - 1) {
                    continue
                }
                if (dp[i - word.length + 1].isEmpty() && i - word.length > 0) continue

                if (s.substring(i - word.length + 1, i + 1) == word) {
                    val prev = dp[i - word.length + 1]
                    val list = prev.map { if (it.isEmpty()) word else "$it $word" }
                    dp[i + 1].addAll(list)
                }
            }
        }
        return dp[s.length]
    }
}