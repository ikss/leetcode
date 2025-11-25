package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ReverseSubstringsBetweenEachPairOfParenthesesTest {
    @Test
    fun test1() {
        val s = "(abcd)"
        val expected = "dcba"

        assertEquals(expected, ReverseSubstringsBetweenEachPairOfParentheses.reverseParentheses(s))
    }

    @Test
    fun test2() {
        val s = "(u(love)i)"
        val expected = "iloveu"

        assertEquals(expected, ReverseSubstringsBetweenEachPairOfParentheses.reverseParentheses(s))
    }

    @Test
    fun test3() {
        val s = "(ed(et(oc))el)"
        val expected = "leetcode"

        assertEquals(expected, ReverseSubstringsBetweenEachPairOfParentheses.reverseParentheses(s))
    }
}