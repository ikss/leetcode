package strings.easy

/**
 * Given a string s, return the number of segments in the string.
 *
 * A segment is defined to be a contiguous sequence of non-space characters.
 *
 * [URL](https://leetcode.com/problems/number-of-segments-in-a-string/)
 */
object NumberOfSegmentsInString {
    fun countSegments(s: String): Int {
        var wasSpace = true
        var result = 0
        for (c in s) {
            if (c == ' ' && !wasSpace) {
                result++
            }
            wasSpace = c == ' '
        }
        if (!wasSpace) result++
        return result
    }
}
