package arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CheckIfArrayPairsAreDivisibleByKTest {
    @Test
    fun test1() {
        val arr = intArrayOf(1, 2, 3, 4, 5, 10, 6, 7, 8, 9)
        val k = 5
        val expected = true

        assertEquals(expected, CheckIfArrayPairsAreDivisibleByK.canArrange(arr, k))
    }

    @Test
    fun test2() {
        val arr = intArrayOf(1, 2, 3, 4, 5, 6)
        val k = 7
        val expected = true

        assertEquals(expected, CheckIfArrayPairsAreDivisibleByK.canArrange(arr, k))
    }
    
    @Test
    fun test3() {
        val arr = intArrayOf(1, 2, 3, 4, 5, 6)
        val k = 10
        val expected = false

        assertEquals(expected, CheckIfArrayPairsAreDivisibleByK.canArrange(arr, k))
    }
}