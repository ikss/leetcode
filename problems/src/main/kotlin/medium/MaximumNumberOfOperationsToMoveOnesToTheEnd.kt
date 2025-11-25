package medium

/**
 * You are given a binary string s.
 *
 * You can perform the following operation on the string any number of times:
 *
 * * Choose any index i from the string where i + 1 < s.length such that `s[i] == '1'` and `s[i + 1] == '0'`.
 * * Move the character `s[i]` to the right until it reaches the end of the string or another '1'.
 * For example, for s = "010010", if we choose i = 1, the resulting string will be s = "000110".
 *
 * Return the maximum number of operations that you can perform.
 *
 * [URL](https://leetcode.com/problems/maximum-number-of-operations-to-move-ones-to-the-end/)
 */
object MaximumNumberOfOperationsToMoveOnesToTheEnd {
    fun maxOperations(s: String): Int {
        var result = 0

        var curr = 0
        var seenZero = false

        for (c in s) {
            if (c == '0') {
                if (!seenZero) result += curr
                seenZero = true
            } else {
                seenZero = false
                curr++
            }
        }

        return result
    }
}
