package strings.easy

/**
 * You are given a string s, where every two consecutive vertical bars '|' are grouped into a pair. In other words,
 * the 1st and 2nd '|' make a pair, the 3rd and 4th '|' make a pair, and so forth.
 *
 * Return the number of '*' in s, excluding the '*' between each pair of '|'.
 *
 * Note that each '|' will belong to exactly one pair.
 *
 * [URL](https://leetcode.com/problems/count-asterisks/)
 */
object CountAsterisks {
    fun countAsterisks(s: String): Int {
        var start = false
        var result = 0

        for (c in s) {
            if (c == '|') {
                start = !start
                continue
            }

            if (c == '*' && !start) {
                result++
            }
        }
        return result
    }
}