package arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MinimumScoreTriangulationOfPolygonTest {
    @Test
    fun test1() {
        val values = intArrayOf(1, 2, 3)
        val expected = 6

        assertEquals(expected, MinimumScoreTriangulationOfPolygon.minScoreTriangulation(values))
    }

    @Test
    fun test2() {
        val values = intArrayOf(3, 7, 4, 5)
        val expected = 144

        assertEquals(expected, MinimumScoreTriangulationOfPolygon.minScoreTriangulation(values))
    }

    @Test
    fun test3() {
        val values = intArrayOf(1, 3, 1, 4, 1, 5)
        val expected = 13

        assertEquals(expected, MinimumScoreTriangulationOfPolygon.minScoreTriangulation(values))
    }
}