package strings.easy

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class MinimumStringLengthAfterRemovingSubstringsTest {
    @Test
    fun test1() {
        val s = "ABFCACDB"
        val expected = 2
        
        assertEquals(expected, MinimumStringLengthAfterRemovingSubstrings.minLength(s))
    }
    
    @Test
    fun test2() {
        val s = "ACBBD"
        val expected = 5
        
        assertEquals(expected, MinimumStringLengthAfterRemovingSubstrings.minLength(s))
    }
}