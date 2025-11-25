package medium

/**
 * A happy string is a string that:
 * * consists only of letters of the set ['a', 'b', 'c'].
 * * `s[i] != s[i + 1]` for all values of i from 1 to s.length - 1 (string is 1-indexed).
 *
 * For example, strings "abc", "ac", "b" and "abcbabcbcb" are all happy strings and strings "aa",
 * "baa" and "ababbc" are not happy strings.
 *
 * Given two integers n and k, consider a list of all happy strings of length n sorted in lexicographical order.
 *
 * Return the kth string of this list or return an empty string if there are less than k happy strings of length n.
 *
 * [URL](https://leetcode.com/problems/the-k-th-lexicographical-string-of-all-happy-strings-of-length-n/)
 */
object TheKthLexicographicalStringOfAllHappyStringsOfLengthN {
    fun getHappyString(n: Int, k: Int): String {
        val startString = getStartString(n)
        for (i in 1 until k) {
            if (!incString(startString)) {
                return ""
            }
        }

        return startString.toString()
    }

    private fun getStartString(n: Int): StringBuilder {
        val result = StringBuilder(n)

        for (i in 0 until n) {
            val c = if (i % 2 == 0) 'a' else 'b'
            result.append(c)
        }

        return result
    }

    private fun incString(string: StringBuilder): Boolean {
        var index = string.length - 1
        while (index >= 0) {
            if (string[index] == 'c') {
                string[index] = 'a'
                index--
                if (index < 0 && string[0] == 'c') return false
                continue
            }
            string[index] = string[index] + 1
            index = string.length - 1
            if (valid(string)) {
                return true
            }
        }
        return false
    }

    private fun valid(string: StringBuilder): Boolean {
        for (i in 0 until string.length - 1) {
            if (string[i] == string[i + 1]) {
                return false
            }
        }

        return true
    }
}