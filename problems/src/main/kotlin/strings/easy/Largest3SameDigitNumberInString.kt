package strings.easy

/**
 * You are given a string num representing a large integer. An integer is good if it meets the following conditions:
 * * It is a substring of num with length 3.
 * * It consists of only one unique digit.
 * 
 * Return the maximum good integer as a string or an empty string "" if no such integer exists.
 *
 * Note:
 * * A substring is a contiguous sequence of characters within a string.
 * * There may be leading zeroes in num or a good integer.
 *
 * [URL](https://leetcode.com/problems/check-if-the-sentence-is-pangram/)
 */
object Largest3SameDigitNumberInString {
    fun largestGoodInteger(num: String): String {
        var max = Int.MIN_VALUE

        for (i in 2 until num.length) {
            if (num[i - 2] == num[i - 1] && num[i - 1] == num[i]) {
                val n = num[i] - '0'
                if (n > max) {
                    max = n
                }
            }
        }

        return if (max == Int.MIN_VALUE) "" else "$max$max$max"
    }
}