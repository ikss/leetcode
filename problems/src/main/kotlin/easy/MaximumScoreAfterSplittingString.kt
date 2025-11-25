package easy

/**
 * Given a string s of zeros and ones, return the maximum score after splitting the string into
 * two non-empty substrings (i.e. left substring and right substring).
 *
 * The score after splitting a string is the number of zeros in the left substring plus
 * the number of ones in the right substring.
 *
 * Return the decoded message.
 *
 * [URL](https://leetcode.com/problems/maximum-score-after-splitting-a-string/)
 */
object MaximumScoreAfterSplittingString {
    fun maxScore(s: String): Int {
        var ones = 0
        var zeros = 0
        var best = Int.MIN_VALUE

        for (i in 0 until s.length - 1) {
            if (s[i] == '1') {
                ones++
            } else {
                zeros++
            }

            best = maxOf(best, zeros - ones)
        }

        if (s[s.length - 1] == '1') {
            ones++
        }

        return best + ones
    }
}
