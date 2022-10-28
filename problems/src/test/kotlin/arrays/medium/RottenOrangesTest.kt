package arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class RottenOrangesTest {
    @Test
    fun test1() {
        val matrix = arrayOf(
            intArrayOf(2, 1, 1),
            intArrayOf(1, 1, 0),
            intArrayOf(0, 1, 1),
        )
        val expected = 4

        assertEquals(expected, RottenOranges.orangesRotting(matrix))
    }

    @Test
    fun test2() {
        val matrix = arrayOf(
            intArrayOf(2, 1, 1),
            intArrayOf(0, 1, 1),
            intArrayOf(1, 0, 1),
        )
        val expected = -1

        assertEquals(expected, RottenOranges.orangesRotting(matrix))
    }

    @Test
    fun test3() {
        val matrix = arrayOf(
            intArrayOf(0, 2),
        )
        val expected = 0

        assertEquals(expected, RottenOranges.orangesRotting(matrix))
    }

}
