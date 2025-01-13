package strings.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MinimumLengthOfStringAfterOperationsTest {
    @Test
    fun test1() {
        val s = "abaacbcbb"
        val expected = 5
        
        assertEquals(expected, MinimumLengthOfStringAfterOperations.minimumLength(s))
    }
    
    @Test
    fun test2() {
        val s = "aa"
        val expected = 2
        
        assertEquals(expected, MinimumLengthOfStringAfterOperations.minimumLength(s))
    }
}