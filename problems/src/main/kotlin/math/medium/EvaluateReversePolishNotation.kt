package math.medium

import java.util.*

/**
 * Evaluate the value of an arithmetic expression in Reverse Polish Notation.
 *
 * Valid operators are +, -, *, and /. Each operand may be an integer or another expression.
 *
 * Note that division between two integers should truncate toward zero.
 *
 * It is guaranteed that the given RPN expression is always valid.
 * That means the expression would always evaluate to a result, and there will not be any division by zero operation.
 *
 * [URL](https://leetcode.com/problems/evaluate-reverse-polish-notation/)
 */
object EvaluateReversePolishNotation {
    fun evalRPN(tokens: Array<String>): Int {
        val stack = Stack<Int>()

        for (t in tokens) {
            when (t) {
                "+" -> {
                    stack.push(stack.pop() + stack.pop())
                }

                "-" -> {
                    val first = stack.pop()
                    stack.push(stack.pop() - first)
                }

                "*" -> {
                    stack.push(stack.pop() * stack.pop())
                }

                "/" -> {
                    val first = stack.pop()
                    stack.push(stack.pop() / first)
                }

                else -> stack.push(t.toInt())
            }
        }

        return stack.pop()
    }
}
