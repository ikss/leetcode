package graphs.hard

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class DistanceToCycleInUndirectedGraphTest {
    @Test
    fun test1() {
        val n = 7
        val edges = arrayOf(
            intArrayOf(1, 2),
            intArrayOf(2, 4),
            intArrayOf(4, 3),
            intArrayOf(3, 1),
            intArrayOf(0, 1),
            intArrayOf(5, 2),
            intArrayOf(6, 5),
        )
        val expected = intArrayOf(1, 0, 0, 0, 0, 1, 2)

        assertArrayEquals(expected, DistanceToCycleInUndirectedGraph.distanceToCycle(n, edges))
    }
    
    @Test
    fun test2() {
        val n = 9
        val edges = arrayOf(
            intArrayOf(0, 1),
            intArrayOf(1, 2),
            intArrayOf(0, 2),
            intArrayOf(2, 6),
            intArrayOf(6, 7),
            intArrayOf(6, 8),
            intArrayOf(0, 3),
            intArrayOf(3, 4),
            intArrayOf(3, 5),
        )
        val expected = intArrayOf(0,0,0,1,2,2,1,2,2)

        assertArrayEquals(expected, DistanceToCycleInUndirectedGraph.distanceToCycle(n, edges))
    }
}