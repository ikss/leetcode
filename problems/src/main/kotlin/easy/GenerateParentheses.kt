package easy

/**
 * Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.
 *
 * [URL](https://leetcode.com/problems/generate-parentheses/)
 */
object GenerateParentheses {

    fun generateParenthesis(n: Int): List<String> {
        val result = mutableListOf<String>()
        backtrack(result, n, "", 0, 0)
        return result
    }

    private fun backtrack(result: MutableList<String>, n: Int, str: String, open: Int, closed: Int) {
        if (str.length == n * 2) {
            result.add(str)
            return
        }
        if (open < n) {
            backtrack(result, n, "$str(", open + 1, closed)
        }
        if (closed < open) {
            backtrack(result, n, "$str)", open, closed + 1)
        }
    }
}
