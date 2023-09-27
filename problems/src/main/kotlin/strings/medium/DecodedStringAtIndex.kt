package strings.medium

/**
 * The count-and-say sequence is a sequence of digit strings defined by the recursive formula:
 *
 * * countAndSay(1) = "1"
 * * countAndSay(n) is the way you would "say" the digit string from countAndSay(n-1),
 *  which is then converted into a different digit string.
 *
 * To determine how you "say" a digit string, split it into the minimal number of substrings such that
 * each substring contains exactly one unique digit. Then for each substring, say the number of digits,
 * then say the digit. Finally, concatenate every said digit.
 *
 * [URL](https://leetcode.com/problems/group-anagrams/)
 */
object DecodedStringAtIndex {
    fun decodeAtIndex(s: String, k: Int): String {
        var k = k
        var n = 0L
        var i = 0
        while (n < k) {
            n = if (s[i].isDigit()) n * (s[i] - '0') else n + 1
            i++
        }
        i--
        while (i > 0) {
            if (s[i].isDigit()) {
                n /= s[i] - '0'
                k %= n.toInt()
            } else {
                if (k % n == 0L) {
                    break
                }
                n--
            }
            i--
        }
        return s[i].toString()
    }
}