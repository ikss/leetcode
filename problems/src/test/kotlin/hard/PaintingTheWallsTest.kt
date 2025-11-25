package hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class PaintingTheWallsTest {
    @Test
    fun test1() {
        val cost = intArrayOf(1, 2, 3, 2)
        val time = intArrayOf(1, 2, 3, 2)
        val expected = 3

        assertEquals(expected, PaintingTheWalls.paintWalls(cost, time))
    }

    @Test
    fun test2() {
        val cost = intArrayOf(2, 3, 4, 2)
        val time = intArrayOf(1, 1, 1, 1)
        val expected = 4

        assertEquals(expected, PaintingTheWalls.paintWalls(cost, time))
    }
}