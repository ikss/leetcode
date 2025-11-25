package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MinimumRemoveToMakeValidParenthesesTest {
    @Test
    fun test1() {
        val s = "lee(t(c)o)de)"
        val expected = "lee(t(c)o)de"

        assertEquals(expected, MinimumRemoveToMakeValidParentheses.minRemoveToMakeValid(s))
    }
    
    @Test
    fun test2() {
        val s = "a)b(c)d"
        val expected = "ab(c)d"

        assertEquals(expected, MinimumRemoveToMakeValidParentheses.minRemoveToMakeValid(s))
    }
    
    @Test
    fun test3() {
        val s = "))(("
        val expected = ""

        assertEquals(expected, MinimumRemoveToMakeValidParentheses.minRemoveToMakeValid(s))
    }
}