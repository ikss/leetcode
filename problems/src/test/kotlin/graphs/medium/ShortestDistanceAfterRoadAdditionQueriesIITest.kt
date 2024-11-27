package graphs.medium

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class ShortestDistanceAfterRoadAdditionQueriesIITest {
    @Test
    fun test1() {
        val n = 5
        val queries = arrayOf(intArrayOf(2, 4), intArrayOf(0, 2), intArrayOf(0, 4))
        val expected = intArrayOf(3, 2, 1)

        assertArrayEquals(expected, ShortestDistanceAfterRoadAdditionQueriesII.shortestDistanceAfterQueries(n, queries))
    }

    @Test
    fun test2() {
        val n = 4
        val queries = arrayOf(intArrayOf(0, 3), intArrayOf(0, 2))
        val expected = intArrayOf(1, 1)

        assertArrayEquals(expected, ShortestDistanceAfterRoadAdditionQueriesII.shortestDistanceAfterQueries(n, queries))
    }

}