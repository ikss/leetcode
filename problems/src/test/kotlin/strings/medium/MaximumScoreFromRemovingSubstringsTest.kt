package strings.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MaximumScoreFromRemovingSubstringsTest {
    @Test
    fun test1() {
        val s = "cdbcbbaaabab"
        val x = 4
        val y = 5
        val expected = 19
        
        assertEquals(expected, MaximumScoreFromRemovingSubstrings.maximumGain(s, x, y))
    }
    
    @Test
    fun test2() {
        val s = "aabbaaxybbaabb"
        val x = 5
        val y = 4
        val expected = 20
        
        assertEquals(expected, MaximumScoreFromRemovingSubstrings.maximumGain(s, x, y))
    }
}