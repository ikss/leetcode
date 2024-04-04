package strings.easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MaximumNestingDepthOfParenthesesTest {
    @Test
    fun test1() {
        val s = "(1+(2*3)+((8)/4))+1"
        val expected = 3

        assertEquals(expected, MaximumNestingDepthOfParentheses.maxDepth(s))
    }

    @Test
    fun test2() {
        val s = "(1)+((2))+(((3)))"
        val expected = 3

        assertEquals(expected, MaximumNestingDepthOfParentheses.maxDepth(s))
    }
}