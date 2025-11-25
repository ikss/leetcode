package easy

/**
 * You are given a string num, representing a large integer. Return the largest-valued odd integer (as a string) that
 * is a non-empty substring of num, or an empty string "" if no odd integer exists.
 *
 * A substring is a contiguous sequence of characters within a string.
 *
 * [URL](https://leetcode.com/problems/largest-odd-number-in-string/
 */
object LargestOddNumberInString {
    fun largestOddNumber(num: String): String {

        for (i in num.length - 1 downTo 0) {
            if ((num[i] - '0') % 2 != 0) {
                return num.substring(0, i + 1)
            }
        }

        return ""
    }
}