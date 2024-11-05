package strings.medium


/**
 * You are given a 0-indexed binary string s having an even length.
 *
 * A string is beautiful if it's possible to partition it into one or more substrings such that:
 *
 * Each substring has an even length.
 * Each substring contains only 1's or only 0's.
 * You can change any character in s to 0 or 1.
 *
 * Return the minimum number of changes required to make the string s beautiful.
 *
 * [URL](https://leetcode.com/problems/minimum-number-of-changes-to-make-binary-string-beautiful/)
 */
object MinimumNumberOfChangesToMakeBinaryStringBeautiful {
    fun minChanges(s: String): Int {
        var result = 0

        for (i in s.indices step 2){
            if (s[i] != s[i + 1]) {
                result++
            }
        }

        return result
    }
}