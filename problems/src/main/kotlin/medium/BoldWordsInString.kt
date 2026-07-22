package medium

/**
 * Given an array of keywords words and a string s, make all appearances of all keywords `words[i]` in s bold.
 * Any letters between <b> and </b> tags become bold.
 *
 * Return s after adding the bold tags. The returned string should use the least number of tags possible,
 * and the tags should form a valid combination.
 *
 * [URL](https://leetcode.com/problems/bold-words-in-string/)
 */
object BoldWordsInString {
    fun boldWords(words: Array<String>, s: String): String {
        val n = s.length
        val mask = BooleanArray(n)
        for (i in 0..<n) {
            search@for (word in words) {
                for (k in 0..<word.length) {
                    if (k + i >= s.length || s[k + i] != word[k]) {
                        continue@search
                    }
                }

                for (j in i..<i + word.length) {
                    mask[j] = true
                }
            }
        }
        println(mask.contentToString())
        val ans = StringBuilder()
        for (i in 0..<n) {
            if (mask[i] && (i == 0 || !mask[i - 1])) {
                ans.append("<b>")
            }
            ans.append(s[i])
            if (mask[i] && (i == n - 1 || !mask[i + 1])) {
                ans.append("</b>")
            }
        }
        return ans.toString()
    }

    fun match(s: String, i: Int, j: Int, t: String): Boolean {
        for (k in i..<j) {
            if (k >= s.length || s[k] != t[k - i]) {
                return false
            }
        }
        return true
    }
}
