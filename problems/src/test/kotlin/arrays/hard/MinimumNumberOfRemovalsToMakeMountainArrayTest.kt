package arrays.hard

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class MinimumNumberOfRemovalsToMakeMountainArrayTest {
    @Test
    fun test1() {
        val input = intArrayOf(1, 3, 1)
        val expected = 0
        
        assertEquals(expected, MinimumNumberOfRemovalsToMakeMountainArray.minimumMountainRemovals(input))
    }
    
    @Test
    fun test2() {
        val input = intArrayOf(2, 1, 1, 5, 6, 2, 3, 1)
        val expected = 3
        
        assertEquals(expected, MinimumNumberOfRemovalsToMakeMountainArray.minimumMountainRemovals(input))
    }
}