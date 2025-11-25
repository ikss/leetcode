package easy

/**
 * You are given a string s consisting only of the characters '0' and '1'.
 * In one operation, you can change any '0' to '1' or vice versa.
 *
 * The string is called alternating if no two adjacent characters are equal.
 * For example, the string "010" is alternating, while the string "0100" is not.
 *
 * Return the minimum number of operations needed to make s alternating.
 *
 * [URL](https://leetcode.com/problems/minimum-changes-to-make-alternating-binary-string/)
 */
object MinimumChangesToMakeAlternatingBinaryString {
    fun minOperations(s: String): Int {
        var ifStartWithOne = 0

        for (i in s.indices) {
            if (i % 2 == 0) {
                if (s[i] != '1') {
                    ifStartWithOne++
                }
            } else {
                if (s[i] == '1') {
                    ifStartWithOne++
                }
            }
        }

        return minOf(ifStartWithOne, s.length - ifStartWithOne)
    }
}
