package strings.easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MinimumStringLengthAfterRemovingSubstringsTest {
    @Test
    fun test1StringBuilder() {
        val s = "ABFCACDB"
        val expected = 2
        
        assertEquals(expected, MinimumStringLengthAfterRemovingSubstrings.minLengthStringBuilder(s))
    }
    
    @Test
    fun test2StringBuilder() {
        val s = "ACBBD"
        val expected = 5
        
        assertEquals(expected, MinimumStringLengthAfterRemovingSubstrings.minLengthStringBuilder(s))
    }
    @Test
    fun test1Stack() {
        val s = "ABFCACDB"
        val expected = 2

        assertEquals(expected, MinimumStringLengthAfterRemovingSubstrings.minLengthStack(s))
    }

    @Test
    fun test2Stack() {
        val s = "ACBBD"
        val expected = 5

        assertEquals(expected, MinimumStringLengthAfterRemovingSubstrings.minLengthStack(s))
    }
}