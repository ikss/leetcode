package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class DecodeStringTest {
    @Test
    fun test1() {
        val s = "3[a]2[bc]"
        val expected = "aaabcbc"
        
        assertEquals(expected, DecodeString.decodeString(s))
    }
    
    @Test
    fun test2() {
        val s = "3[a2[c]]"
        val expected = "accaccacc"
        
        assertEquals(expected, DecodeString.decodeString(s))
    }
}