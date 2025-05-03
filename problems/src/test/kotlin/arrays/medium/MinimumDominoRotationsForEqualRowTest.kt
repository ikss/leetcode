package arrays.medium

import arrays.medium.MinimumDominoRotationsForEqualRow.minDominoRotations
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MinimumDominoRotationsForEqualRowTest {
    @Test
    fun test1() {
        val tops = intArrayOf(2, 1, 2, 4, 2, 2)
        val bottoms = intArrayOf(5, 2, 6, 2, 3, 2)
        val expected = 2

        assertEquals(expected, minDominoRotations(tops, bottoms))
    }

    @Test
    fun test2() {
        val tops = intArrayOf(3, 5, 1, 2, 3)
        val bottoms = intArrayOf(3, 6, 3, 3, 4)
        val expected = -1

        assertEquals(expected, minDominoRotations(tops, bottoms))
    }
}