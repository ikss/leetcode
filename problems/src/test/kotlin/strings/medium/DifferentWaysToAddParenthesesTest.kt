package strings.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class DifferentWaysToAddParenthesesTest {
    @Test
    fun test1() {
        val input = "2-1-1"
        val expected = listOf(2, 0)
        
        assertEquals(expected, DifferentWaysToAddParentheses.diffWaysToCompute(input))
    }
    
    @Test
    fun test2() {
        val input = "2*3-4*5"
        val expected = listOf(-34, -10, -14, -10, 10)
        
        assertEquals(expected, DifferentWaysToAddParentheses.diffWaysToCompute(input))
    }
}