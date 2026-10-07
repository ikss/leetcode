package medium

/**
 * Given a string s that contains parentheses and letters, remove the minimum number of
 * invalid parentheses to make the input string valid.
 *
 * Return a list of unique strings that are valid with the minimum number of removals.
 * You may return the answer in any order.
 *
 * [URL](https://leetcode.com/problems/remove-invalid-parentheses/)
 */
object RemoveInvalidParentheses {
    private fun recurse(
        s: String,
        index: Int,
        leftCount: Int,
        rightCount: Int,
        leftRem: Int,
        rightRem: Int,
        expression: StringBuilder,
        result: HashSet<String>,
    ) {
        // If we reached the end of the string, just check if the resulting expression is
        // valid or not and also if we have removed the total number of left and right
        // parentheses that we should have removed.
        if (index == s.length) {
            if (leftRem == 0 && rightRem == 0) {
                result.add(expression.toString())
            }
            return
        }

        val character = s[index]
        // The discard case. Note that here we have our pruning condition.
        // We don't recurse if the remaining count for that parenthesis is == 0.
        if (character == '(' && leftRem > 0) {
            recurse(s, index + 1, leftCount, rightCount, leftRem - 1, rightRem, expression, result)
        } else if (character == ')' && rightRem > 0) {
            recurse(s, index + 1, leftCount, rightCount, leftRem - 0, rightRem - 1, expression, result)
        }

        expression.append(character)

        // Simply recurse one step further if the current character is not a parenthesis.
        if (character != '(' && character != ')') {
            recurse(s, index + 1, leftCount, rightCount, leftRem, rightRem, expression, result)
        } else if (character == '(') {
            // Consider an opening bracket.
            recurse(s, index + 1, leftCount + 1, rightCount, leftRem, rightRem, expression, result)
        } else if (rightCount < leftCount) {
            // Consider a closing bracket.
            recurse(s, index + 1, leftCount, rightCount + 1, leftRem, rightRem, expression, result)
        }

        // Delete for backtracking.
        expression.setLength(expression.length - 1)
    }

    fun removeInvalidParentheses(s: String): List<String> {
        var left = 0
        var right = 0

        // First, we find out the number of misplaced left and right parentheses.
        for (c in s) {
            if (c == '(') {
                left++
            } else if (c == ')') {
                if (left == 0) right++
                if (left > 0) left--
            }
        }

        val result = HashSet<String>()
        recurse(s, 0, 0, 0, left, right, StringBuilder(), result)

        return result.toList()
    }
}