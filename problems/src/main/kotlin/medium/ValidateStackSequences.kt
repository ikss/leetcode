package medium

import java.util.*

/**
 * Given two integer arrays pushed and popped each with distinct values, return true if this could have been the result
 * of a sequence of push and pop operations on an initially empty stack, or false otherwise.
 *
 * [URL](https://leetcode.com/problems/validate-stack-sequences/)
 */
object ValidateStackSequences {
    fun validateStackSequences(pushed: IntArray, popped: IntArray): Boolean {
        val size = pushed.size
        val stack = Stack<Int>()

        var popIndex = 0

        for (x in pushed) {
            stack.push(x)
            while (stack.isNotEmpty() && popIndex < size && stack.peek() == popped[popIndex]) {
                stack.pop()
                popIndex++
            }
        }

        return popIndex == size
    }
}
