package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MinimumNumberOfDaysToMakeMBouquetsTest {
    @Test
    fun test1() {
        val bloomDay = intArrayOf(1, 10, 3, 10, 2)
        val m = 3
        val k = 1
        val expected = 3

        assertEquals(expected, MinimumNumberOfDaysToMakeMBouquets.minDays(bloomDay, m, k))
    }

    @Test
    fun test2() {
        val bloomDay = intArrayOf(1, 10, 3, 10, 2)
        val m = 3
        val k = 2
        val expected = -1

        assertEquals(expected, MinimumNumberOfDaysToMakeMBouquets.minDays(bloomDay, m, k))
    }
    
    @Test
    fun test3() {
        val bloomDay = intArrayOf(7, 7, 7, 7, 12, 7, 7)
        val m = 2
        val k = 3
        val expected = 12

        assertEquals(expected, MinimumNumberOfDaysToMakeMBouquets.minDays(bloomDay, m, k))
    }
}