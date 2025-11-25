package easy

/**
 * Implement strStr().
 * Given two strings needle and haystack, return the index of the first occurrence of needle in haystack,
 * or -1 if needle is not part of haystack.
 *
 * [URL](https://leetcode.com/problems/implement-strstr/)
 */
object ImplementStrStr {

    fun strStr(haystack: String, needle: String): Int {
        if (needle.isEmpty()) return 0

        for (i in 0..haystack.length - needle.length) {
            if (foundString(haystack, needle, i)) {
                return i
            }
        }

        return -1
    }

    private fun foundString(haystack: String, needle: String, startIndex: Int): Boolean {
        var i = startIndex
        needle.forEach {
            if (it != haystack[i]) {
                return false
            }
            i++
        }
        return true
    }

}
