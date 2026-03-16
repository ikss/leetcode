package medium

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class GetBiggestThreeRhombusSumsInGridTest {
    @Test
    fun test1() {
        val grid = arrayOf(
            intArrayOf(3, 4, 5, 1, 3),
            intArrayOf(3, 3, 4, 2, 3),
            intArrayOf(20, 30, 200, 40, 10),
            intArrayOf(1, 5, 5, 4, 1),
            intArrayOf(4, 3, 2, 2, 5),
        )
        val expected = intArrayOf(228, 216, 211)

        assertArrayEquals(expected, GetBiggestThreeRhombusSumsInGrid.getBiggestThree(grid))
    }

    @Test
    fun test2() {
        val grid = arrayOf(
            intArrayOf(1, 2, 3),
            intArrayOf(4, 5, 6),
            intArrayOf(7, 8, 9),
        )
        val expected = intArrayOf(20, 9, 8)

        assertArrayEquals(expected, GetBiggestThreeRhombusSumsInGrid.getBiggestThree(grid))
    }

    @Test
    fun test3() {
        val grid = arrayOf(
            intArrayOf(7, 7, 7),
        )
        val expected = intArrayOf(7)

        assertArrayEquals(expected, GetBiggestThreeRhombusSumsInGrid.getBiggestThree(grid))
    }
}