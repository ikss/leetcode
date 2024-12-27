package arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class BestSightseeingPairTest {
    @Test
    fun test1() {
        val values = intArrayOf(8, 1, 5, 2, 6)
        val expected = 11
        
        assertEquals(expected, BestSightseeingPair.maxScoreSightseeingPair(values))
    }
    
    @Test
    fun test2() {
        val values = intArrayOf(1, 2)
        val expected = 2
        
        assertEquals(expected, BestSightseeingPair.maxScoreSightseeingPair(values))
    }
}