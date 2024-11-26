package arrays.hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MinimizeMaximumValueInGridTest {
    @Test
    fun test1() {
        val grid = arrayOf(
            intArrayOf(3, 1),
            intArrayOf(2, 5),
        )
        val expected = arrayOf(
            intArrayOf(2, 1),
            intArrayOf(1, 2),
        )
        
        assertEquals(expected, MinimizeMaximumValueInGrid.minScore(grid))
    }
    
    @Test
    fun test2() {
        val grid = arrayOf(
            intArrayOf(10),
        )
        val expected = arrayOf(
            intArrayOf(1),
        )
        
        assertEquals(expected, MinimizeMaximumValueInGrid.minScore(grid))
    }
}