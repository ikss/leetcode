package strings.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ValidParenthesisStringTest {
    @Test
    fun test1() {
        val s = "()"
        val expected = true
        
        assertEquals(expected, ValidParenthesisString.checkValidString(s))
    }
    
    @Test
    fun test2() {
        val s = "(*)"
        val expected = true
        
        assertEquals(expected, ValidParenthesisString.checkValidString(s))
    }
    
    @Test
    fun test3() {
        val s = "(*))"
        val expected = true
        
        assertEquals(expected, ValidParenthesisString.checkValidString(s))
    }
}