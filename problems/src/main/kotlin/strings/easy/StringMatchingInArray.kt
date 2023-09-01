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
}