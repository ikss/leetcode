package easy

/**
 * Given a parentheses string s containing only the characters '(' and ')'. A parentheses string is balanced if:
 *
 * * Any left parenthesis '(' must have a corresponding two consecutive right parenthesis '))'.
 * * Left parenthesis '(' must go before the corresponding two consecutive right parenthesis '))'.
 *
 * In other words, we treat '(' as an opening parenthesis and '))' as a closing parenthesis.
 *
 * * For example, "())", "())(())))" and "(())())))" are balanced, ")()", "()))" and "(()))" are not balanced.
 *
 * You can insert the characters '(' and ')' at any position of the string to balance it if needed.
 *
 * Return the minimum number of insertions needed to make s balanced.
 *
 * [URL](https://leetcode.com/problems/minimum-insertions-to-balance-a-parentheses-string/)
 */
object MinimumInsertionsToBalanceAParenthesesString {
    fun minInsertions(s: String): Int {
        var leftCount = 0
        var index = 0
        var result = 0
        while (index < s.length) {
            val c = s[index]
            if (c == '(') {
                leftCount++
                index++
            } else {
                if (leftCount > 0) {
                    leftCount--
                } else {
                    result++
                }
                if (index < s.length - 1 && s[index + 1] == ')') {
                    index += 2
                } else {
                    result++
                    index++
                }
            }
        }
        result += leftCount * 2

        return result
    }
}