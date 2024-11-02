package arrays.hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class PaintHousesIITest {
    @Test
    fun test1() {
        val costs = arrayOf(
            intArrayOf(1, 5, 3),
            intArrayOf(2, 9, 4),
        )
        val expected = 5
        
        assertEquals(expected, PaintHousesII.minCostII(costs))
    }
    
    @Test
    fun test2() {
        val costs = arrayOf(
            intArrayOf(1, 3),
            intArrayOf(2, 4),
        )
        val expected = 5
        
        assertEquals(expected, PaintHousesII.minCostII(costs))
    }
}