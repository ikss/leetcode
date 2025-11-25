package medium

/**
 * You are given a string s.
 *
 * You can perform the following process on s any number of times:
 * * Choose an index i in the string such that there is at least one character to the left of index i that is equal to
 * `s[i]`, and at least one character to the right that is also equal to `s[i]`.
 * * Delete the closest character to the left of index i that is equal to `s[i]`.
 * * Delete the closest character to the right of index i that is equal to `s[i]`.
 *
 * Return the minimum length of the final string s that you can achieve.
 *
 * [URL](https://leetcode.com/problems/break-a-palindrome/)
 */
object MinimumLengthOfStringAfterOperations {
    fun minimumLength(s: String): Int {
        val chars = IntArray(26)

        for (i in s.indices) {
            val c = s[i]
            chars[c - 'a']++
        }

        var result = 0
        for (count in chars) {
            if (count == 0) continue
            result += if (count % 2 == 0) 2 else 1
        }
        return result
    }
}
