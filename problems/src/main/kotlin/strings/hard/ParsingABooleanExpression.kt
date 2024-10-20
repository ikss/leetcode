package strings.hard

import java.util.*

/**
 * A boolean expression is an expression that evaluates to either true or false. It can be in one of the following shapes:
 * * 't' that evaluates to true.
 * * 'f' that evaluates to false.
 * * '!(subExpr)' that evaluates to the logical NOT of the inner expression subExpr.
 * * '&(subExpr1, subExpr2, ..., subExprn)' that evaluates to the logical AND of the inner expressions subExpr1,
 * subExpr2, ..., subExprn where n >= 1.
 * * '|(subExpr1, subExpr2, ..., subExprn)' that evaluates to the logical OR of the inner expressions subExpr1,
 * subExpr2, ..., subExprn where n >= 1.
 *
 * Given a string expression that represents a boolean expression, return the evaluation of that expression.
 *
 * It is guaranteed that the given expression is valid and follows the given rules.
 *
 * [URL](https://leetcode.com/problems/parsing-a-boolean-expression/)
 */
object ParsingABooleanExpression {
    fun parseBoolExpr(expression: String): Boolean {
        val stack = Stack<Char>()

        for (c in expression) {
            when (c) {
                '(', '|', '&', 't', 'f', '!' -> {
                    stack.push(c)
                    continue
                }

                ',' -> {
                    continue
                }
            }
            val processed = process(stack)
            stack.push(processed)
        }
        return stack.peek() == 't'
    }

    private fun process(stack: Stack<Char>): Char {
        val operands = ArrayList<Char>()
        while (stack.isNotEmpty()) {
            val c = stack.pop()
            if (c == '(') {
                break
            }
            operands.add(c)
        }
        val operator = stack.pop()

        return operate(operator, operands)
    }

    private fun operate(operator: Char, operands: List<Char>): Char {
        if (operator == '!') {
            return if (operands[0] == 't') 'f' else 't'
        }
        return when (operator) {
            '&' -> if (operands.contains('f')) 'f' else 't'
            '|' -> if (operands.contains('t')) 't' else 'f'
            else -> 'f'
        }
    }
}