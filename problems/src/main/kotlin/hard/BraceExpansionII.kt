package hard

import java.util.*

/**
 * Under the grammar given below, strings can represent a set of lowercase words. Let R(expr) denote the set
 * of words the expression represents.
 *
 * The grammar can best be understood through simple examples:
 *
 * * Single letters represent a singleton set containing that word.
 * * * R("a") = {"a"}
 * * * R("w") = {"w"}
 * * When we take a comma-delimited list of two or more expressions, we take the union of possibilities.
 * * * R("{a,b,c}") = {"a","b","c"}
 * * * R("{{a,b},{b,c}}") = {"a","b","c"} (notice the final set only contains each word at most once)
 * * When we concatenate two expressions, we take the set of possible concatenations between two words where the first
 * word comes from the first expression and the second word comes from the second expression.
 * * * R("{a,b}{c,d}") = {"ac","ad","bc","bd"}
 * * * R("a{b,c}{d,e}f{g,h}") = {"abdfg", "abdfh", "abefg", "abefh", "acdfg", "acdfh", "acefg", "acefh"}
 *
 * Formally, the three rules for our grammar:
 * * For every lowercase letter x, we have R(x) = {x}.
 * * For expressions e1, e2, ... , ek with k >= 2, we have R({e1, e2, ...}) = R(e1) ∪ R(e2) ∪ ...
 * * For expressions e1 and e2, we have R(e1 + e2) = {a + b for (a, b) in R(e1) × R(e2)}, where + denotes concatenation,
 * and × denotes the cartesian product.
 *
 * Given an expression representing a set of words under the given grammar, return the sorted list of words that
 * the expression represents.
 *
 * [URL](https://leetcode.com/problems/brace-expansion-ii/)
 */
object BraceExpansionII {

    fun braceExpansionII(expression: String): List<String> {
        val op = ArrayDeque<Char>()
        val stk = Stack<HashSet<String>>()

        for ((i, element) in expression.withIndex()) {
            when (element) {
                ',' -> {
                    // Keep popping operators from the top of the stack until the stack is empty or its top is not a multiplication sign
                    while (!op.isEmpty() && op.peek() == '*') {
                        ope(op, stk)
                    }
                    op.push('+')
                }

                '{' -> {
                    // First determine whether a multiplication sign needs to be added, then push { onto the operator stack
                    if (i > 0 && (expression[i - 1] == '}' || Character.isLetter(expression[i - 1]))) {
                        op.push('*')
                    }
                    op.push('{')
                }

                '}' -> {
                    // Keep popping operators from the top of the stack until its top is {
                    while (!op.isEmpty() && op.peek() != '{') {
                        ope(op, stk)
                    }
                    op.pop()
                }

                else -> {
                    // First determine whether a multiplication sign needs to be added, then push the newly constructed set onto the set stack
                    if (i > 0 && (expression[i - 1] == '}' || Character.isLetter(expression[i - 1]))) {
                        op.push('*')
                    }
                    val sb = StringBuilder()
                    sb.append(element)
                    stk.add(hashSetOf(sb.toString()))
                }
            }
        }

        while (!op.isEmpty()) {
            ope(op, stk)
        }
        return stk.pop().sorted()
    }

    // Pop the operator at the top of the stack and perform the calculation
    fun ope(op: Deque<Char>, stk: Stack<HashSet<String>>) {
        val operator = op.pop()
        val r = stk.pop()
        val l = stk.pop()
        if (operator == '+') {
            stk.push(l.apply { addAll(r) })
        } else {
            val tmp = HashSet<String>()
            for (left in l) {
                for (right in r) {
                    tmp.add(left + right)
                }
            }
            stk.push(tmp)
        }
    }
}
