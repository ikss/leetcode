package strings.easy

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class ClearDigitsTest {
    @Test
    fun test1() {
        val s = "abc"
        val expected = "abc"
        
        assertEquals(expected, ClearDigits.clearDigits(s))
    }
    
    @Test
    fun test2() {
        val s = "cb34"
        val expected = ""
        
        assertEquals(expected, ClearDigits.clearDigits(s))
    }
}