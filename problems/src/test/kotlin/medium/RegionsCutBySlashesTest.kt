package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class RegionsCutBySlashesTest {
    @Test
    fun test1() {
        val input = arrayOf(" /", "/ ")
        val expected = 2
        
        assertEquals(expected, RegionsCutBySlashes.regionsBySlashes(input))
    }
    
    @Test
    fun test2() {
        val input = arrayOf(" /", "  ")
        val expected = 1
        
        assertEquals(expected, RegionsCutBySlashes.regionsBySlashes(input))
    }
}