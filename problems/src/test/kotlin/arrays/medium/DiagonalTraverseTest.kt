package arrays.medium

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class DiagonalTraverseTest {
    @Test
    fun test1() {
        val mat = arrayOf(intArrayOf(1, 2, 3), intArrayOf(4, 5, 6), intArrayOf(7, 8, 9))
        val expected = intArrayOf(1, 2, 4, 7, 5, 3, 6, 8, 9)

        assertArrayEquals(expected, DiagonalTraverse.findDiagonalOrder(mat))
    }

    @Test
    fun test2() {
        val mat = arrayOf(intArrayOf(1, 2), intArrayOf(3, 4))
        val expected = intArrayOf(1, 2, 3, 4)

        assertArrayEquals(expected, DiagonalTraverse.findDiagonalOrder(mat))
    }
}