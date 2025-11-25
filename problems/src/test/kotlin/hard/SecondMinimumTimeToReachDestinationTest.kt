package hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SecondMinimumTimeToReachDestinationTest {
    @Test
    fun test1() {
        val n = 5
        val edges = arrayOf(
            intArrayOf(1, 2),
            intArrayOf(1, 3),
            intArrayOf(1, 4),
            intArrayOf(3, 4),
            intArrayOf(4, 5),
        )
        val time = 3
        val change = 5
        val expected = 13

        assertEquals(expected, SecondMinimumTimeToReachDestination.secondMinimum(n, edges, time, change))
    }
    
    @Test
    fun test2() {
        val n = 2
        val edges = arrayOf(
            intArrayOf(1, 2),
        )
        val time = 3
        val change = 2
        val expected = 11

        assertEquals(expected, SecondMinimumTimeToReachDestination.secondMinimum(n, edges, time, change))
    }
}