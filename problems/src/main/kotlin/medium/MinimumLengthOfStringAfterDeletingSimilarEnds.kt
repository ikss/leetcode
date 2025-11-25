package medium

/**
 * Given a string s consisting only of characters 'a', 'b', and 'c'. You are asked to apply the following algorithm on the string any number of times:
 * * Pick a non-empty prefix from the string s where all the characters in the prefix are equal.
 * * Pick a non-empty suffix from the string s where all the characters in this suffix are equal.
 * * The prefix and the suffix should not intersect at any index.
 * * The characters from the prefix and suffix must be the same.
 * * Delete both the prefix and the suffix.
 *
 * Return the minimum length of s after performing the above operation any number of times (possibly zero times).
 *
 * [URL](https://leetcode.com/problems/minimum-length-of-string-after-deleting-similar-ends/)
 */
object MinimumLengthOfStringAfterDeletingSimilarEnds {
    fun minimumLength(s: String): Int {
        var start = 0
        var end = s.length - 1

        while (start < end && s[start] == s[end]) {
            val c = s[start]

            while (start <= end && s[start] == c) {
                start++
            }
            while (start <= end && s[end] == c) {
                end--
            }
        }

        return end - start + 1
    }
}