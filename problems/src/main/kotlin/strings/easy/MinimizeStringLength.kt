package strings.easy

/**
 * Given a string s, you have two types of operation:
 * * Choose an index i in the string, and let c be the character in position i.
 * Delete the closest occurrence of c to the left of i (if exists).
 * * Choose an index i in the string, and let c be the character in position i.
 * Delete the closest occurrence of c to the right of i (if exists).
 *
 * Your task is to minimize the length of s by performing the above operations zero or more times.
 *
 * Return an integer denoting the length of the minimized string.
 *
 * [URL](https://leetcode.com/problems/minimize-string-length/)
 */
object MinimizeStringLength {
    fun minimizedStringLength(s: String): Int {
        val hash = IntArray(26)

        var result = 0

        for (c in s) {
            val i = c - 'a'
            hash[i]++
            if (hash[i] == 1) result++
        }
        return result
    }
}
