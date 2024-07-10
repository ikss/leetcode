package strings.medium

/**
 * Given an encoded string, return its decoded string.
 *
 * The encoding rule is: `k[encoded_string]`, where the encoded_string inside the square brackets is being repeated
 * exactly k times. Note that k is guaranteed to be a positive integer.
 *
 * You may assume that the input string is always valid; there are no extra white spaces, square brackets are
 * well-formed, etc. Furthermore, you may assume that the original data does not contain any digits and that digits are
 * only for those repeat numbers, k. For example, there will not be input like 3a or 2[4].
 *
 * The test cases are generated so that the length of the output will never exceed 105.
 *
 * [URL](https://leetcode.com/problems/decode-string/)
 */
object DecodeString {
    private var index: Int = 0

    fun decodeString(s: String): String {
        index = 0
        return decodeRecursive(s)
    }

    private fun decodeRecursive(s: String): String {
        val result = StringBuilder()
        while (index < s.length && s[index] != ']') {
            if (s[index].isDigit()) {
                var k = 0
                while (index < s.length && s[index].isDigit()) {
                    k = k * 10 + (s[index++] - '0')
                }
                index++
                val decodedString = decodeRecursive(s)
                index++
                while (k-- > 0) {
                    result.append(decodedString)
                }
            } else {
                result.append(s[index++])
            }
        }
        return result.toString()
    }
}