package hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MaxPointsOnLineTest {

    @Test
    fun test1() {
        val points = arrayOf(
            intArrayOf(1, 1),
            intArrayOf(2, 2),
            intArrayOf(3, 3),
        )
        val expected = 3

        assertEquals(expected, MaxPointsOnLine.maxPoints(points))
    }

    @Test
    fun test2() {
        val points = arrayOf(
            intArrayOf(1, 1),
            intArrayOf(3, 2),
            intArrayOf(5, 3),
            intArrayOf(4, 1),
            intArrayOf(2, 3),
            intArrayOf(1, 4),
        )
        val expected = 4

        assertEquals(expected, MaxPointsOnLine.maxPoints(points))
    }
}