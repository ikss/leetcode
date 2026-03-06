package easy

/**
 * Given a binary string s without leading zeros, return true if s contains at most one contiguous segment of ones.
 * Otherwise, return false.
 *
 * [URL](https://leetcode.com/problems/check-if-binary-string-has-at-most-one-segment-of-ones/)
 */
object CheckIfBinaryStringHasAtMostOneSegmentOfOnes {
    fun checkOnesSegment(s: String): Boolean {
        var segmentEnds = false
        for (i in 1 until s.length) {
            if (s[i] == '1' && segmentEnds) {
                return false
            }
            if (s[i] == '0') {
                segmentEnds = true
            }
        }
        return true
    }
}
