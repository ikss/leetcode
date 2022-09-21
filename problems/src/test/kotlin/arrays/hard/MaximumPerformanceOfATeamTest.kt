package arrays.hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MaximumPerformanceOfATeamTest {

    @Test
    fun test1() {
        val n = 6
        val speed = intArrayOf(2, 10, 3, 1, 5, 8)
        val efficiency = intArrayOf(5, 4, 3, 9, 7, 2)
        val k = 2
        val expected = 60

        assertEquals(expected, MaximumPerformanceOfATeam.maxPerformance(n, speed, efficiency, k))
    }

    @Test
    fun test2() {
        val n = 6
        val speed = intArrayOf(2, 10, 3, 1, 5, 8)
        val efficiency = intArrayOf(5, 4, 3, 9, 7, 2)
        val k = 3
        val expected = 68

        assertEquals(expected, MaximumPerformanceOfATeam.maxPerformance(n, speed, efficiency, k))
    }

    @Test
    fun test3() {
        val n = 6
        val speed = intArrayOf(2, 10, 3, 1, 5, 8)
        val efficiency = intArrayOf(5, 4, 3, 9, 7, 2)
        val k = 4
        val expected = 72

        assertEquals(expected, MaximumPerformanceOfATeam.maxPerformance(n, speed, efficiency, k))
    }
}