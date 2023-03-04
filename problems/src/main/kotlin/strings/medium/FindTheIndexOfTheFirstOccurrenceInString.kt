package strings.medium

/**
 * Implement strStr().
 * Given two strings needle and haystack, return the index of the first occurrence of needle in haystack,
 * or -1 if needle is not part of haystack.
 *
 * [URL](https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/)
 */
object FindTheIndexOfTheFirstOccurrenceInString {
    fun strStr(haystack: String, needle: String): Int {
        for (i in 0..haystack.length - needle.length) {
            if (foundString(haystack, needle, i)) {
                return i
            }
        }

        return -1
    }

    private fun foundString(haystack: String, needle: String, startIndex: Int): Boolean {
        var i = startIndex
        for (c in needle) {
            if (c != haystack[i++]) {
                return false
            }
        }
        return true
    }
}