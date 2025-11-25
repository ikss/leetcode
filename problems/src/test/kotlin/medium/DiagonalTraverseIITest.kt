package medium

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class DiagonalTraverseIITest {
    @Test
    fun test1() {
        val nums = listOf(
            listOf(1, 2, 3),
            listOf(4, 5, 6),
            listOf(7, 8, 9),
        )
        val expected = intArrayOf(1, 4, 2, 7, 5, 3, 8, 6, 9)

        assertArrayEquals(expected, DiagonalTraverseII.findDiagonalOrder(nums))
    }

    @Test
    fun test2() {
        val nums = listOf(
            listOf(1, 2, 3, 4, 5),
            listOf(6, 7),
            listOf(8),
            listOf(9, 10, 11),
            listOf(12, 13, 14, 15, 16),
        )
        val expected = intArrayOf(1, 6, 2, 8, 7, 3, 9, 4, 12, 10, 5, 13, 11, 14, 15, 16)

        assertArrayEquals(expected, DiagonalTraverseII.findDiagonalOrder(nums))
    }
}