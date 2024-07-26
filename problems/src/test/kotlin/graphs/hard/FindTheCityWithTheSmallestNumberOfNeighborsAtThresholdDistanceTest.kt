package graphs.hard

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class FindTheCityWithTheSmallestNumberOfNeighborsAtThresholdDistanceTest {
    @Test
    fun test1() {
        val n = 4
        val edges = arrayOf(
            intArrayOf(0, 1, 3),
            intArrayOf(1, 2, 1),
            intArrayOf(1, 3, 4),
            intArrayOf(2, 3, 1),
        )
        val distanceThreshold = 4
        val expected = 3
        val actual =FindTheCityWithTheSmallestNumberOfNeighborsAtThresholdDistance.findTheCity(n, edges, distanceThreshold)
        
        assertEquals(expected, actual)
    }
    
    @Test
    fun test2() {
        val n = 5
        val edges = arrayOf(
            intArrayOf(0, 1, 2),
            intArrayOf(0, 4, 8),
            intArrayOf(1, 2, 3),
            intArrayOf(1, 4, 2),
            intArrayOf(2, 3, 1),
            intArrayOf(3, 4, 1),
        )
        val distanceThreshold = 2
        val expected = 0
        val actual =FindTheCityWithTheSmallestNumberOfNeighborsAtThresholdDistance.findTheCity(n, edges, distanceThreshold)

        assertEquals(expected, actual)
    }
}