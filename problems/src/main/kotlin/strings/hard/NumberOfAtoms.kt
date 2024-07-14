package strings.hard

import java.util.*

/**
 * Given a string formula representing a chemical formula, return the count of each atom.
 *
 * The atomic element always starts with an uppercase character, then zero or more lowercase letters, representing the name.
 *
 * One or more digits representing that element's count may follow if the count is greater than 1.
 * If the count is 1, no digits will follow.
 *
 * For example, "H2O" and "H2O2" are possible, but "H1O2" is impossible.
 * Two formulas are concatenated together to produce another formula.
 *
 * For example, "H2O2He3Mg4" is also a formula.
 * A formula placed in parentheses, and a count (optionally added) is also a formula.
 *
 * For example, "(H2O2)" and "(H2O2)3" are formulas.
 * Return the count of all elements as a string in the following form: the first name (in sorted order),
 * followed by its count (if that count is more than 1), followed by the second name (in sorted order),
 * followed by its count (if that count is more than 1), and so on.
 *
 * [URL](https://leetcode.com/problems/number-of-atoms/)
 */
object NumberOfAtoms {
    private val regex = Regex("([A-Z][a-z]*)(\\d*)|(\\()|(\\))(\\d*)")

    fun countOfAtoms(formula: String): String {
        val stack = Stack<MutableMap<String, Int>>()
        stack.push(TreeMap())
        for (match in regex.findAll(formula)) {
            val (atom, count, open, close, countClose) = match.destructured

            if (open.isNotEmpty()) {
                stack.push(HashMap())
            } else if (close.isNotEmpty()) {
                val top = stack.pop()
                val topCount = if (countClose.isEmpty()) 1 else countClose.toInt()
                val prev = stack.peek()
                for ((key, value) in top) {
                    prev.merge(key, value * topCount, Int::plus)
                }
            } else {
                val prev = stack.peek()
                val atomCount = if (count.isEmpty()) 1 else count.toInt()
                prev.merge(atom, atomCount, Int::plus)
            }
        }
        val result = StringBuilder()
        for ((k, v) in stack.pop()) {
            result.append(k)
            if (v > 1) result.append(v)
        }
        return result.toString()
    }
}
