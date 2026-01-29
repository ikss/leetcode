package medium

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class WallsAndGatesTest {
    @Test
    fun test1() {
        val rooms = arrayOf(
            intArrayOf(Int.MAX_VALUE, -1, 0, Int.MAX_VALUE),
            intArrayOf(Int.MAX_VALUE, Int.MAX_VALUE, Int.MAX_VALUE, -1),
            intArrayOf(Int.MAX_VALUE, -1, Int.MAX_VALUE, -1),
            intArrayOf(0, -1, Int.MAX_VALUE, Int.MAX_VALUE),
        )
        val expected = arrayOf(
            intArrayOf(3, -1, 0, 1),
            intArrayOf(2, 2, 1, -1),
            intArrayOf(1, -1, 2, -1),
            intArrayOf(0, -1, 3, 4),
        )

        WallsAndGates.wallsAndGates(rooms)

        assertArrayEquals(expected, rooms)
    }

    @Test
    fun test2() {
        val rooms = arrayOf(
            intArrayOf(-1),
        )
        val expected = arrayOf(
            intArrayOf(-1),
        )

        WallsAndGates.wallsAndGates(rooms)

        assertArrayEquals(expected, rooms)
    }
}