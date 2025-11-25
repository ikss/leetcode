package medium

import java.util.regex.Pattern

/**
 * Given a string expression of numbers and operators, return all possible results from computing all the different
 * possible ways to group numbers and operators. You may return the answer in any order.
 *
 * The test cases are generated such that the output values fit in a 32-bit integer and the number
 * of different results does not exceed 10^4.
 *
 * [URL](https://leetcode.com/problems/different-ways-to-add-parentheses/)
 */
object DifferentWaysToAddParentheses {
    private sealed interface Element
    private data class Number(val value: Int) : Element
    private data class Operation(val value: Char) : Element

    private val regex = Pattern.compile("\\d+|[+\\-*/]")

    fun diffWaysToCompute(expression: String): List<Int> {
        val matcher = regex.matcher(expression)
        val elements = ArrayList<Element>()

        while (matcher.find()) {
            val element = matcher.group()
            if (element[0].isDigit()) {
                elements.add(Number(element.toInt()))
            } else {
                elements.add(Operation(element[0]))
            }
        }
        val cache = HashMap<Pair<Int, Int>, List<Int>>()

        return recursive(elements, 0, elements.size - 1, cache)
    }

    private fun recursive(
        elements: List<Element>,
        start: Int,
        end: Int,
        cache: HashMap<Pair<Int, Int>, List<Int>>,
    ): List<Int> {
        if (start == end) {
            return listOf((elements[start] as Number).value)
        }

        cache[start to end]?.let { return it }
        
        val results = ArrayList<Int>()
        
        for (i in start until end step 2) {
            val left = recursive(elements, start, i, cache)
            val right = recursive(elements, i + 2, end, cache)
            val operation = (elements[i + 1] as Operation).value

            for (l in left) {
                for (r in right) {
                    val result = when (operation) {
                        '+' -> l + r
                        '-' -> l - r
                        '*' -> l * r
                        '/' -> l / r
                        else -> throw IllegalStateException()
                    }
                    results.add(result)
                }
            }
        }
        
        cache[start to end] = results
        
        return results
    }
}