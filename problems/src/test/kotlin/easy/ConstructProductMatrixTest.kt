package easy

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class ConstructProductMatrixTest {
    @Test
    fun test1() {
        val grid = arrayOf(intArrayOf(1, 2), intArrayOf(3, 4))
        val expected = arrayOf(intArrayOf(24, 12), intArrayOf(8, 6))

        assertArrayEquals(expected, ConstructProductMatrix.constructProductMatrix(grid))
    }

    @Test
    fun test2() {
        val grid = arrayOf(intArrayOf(12345), intArrayOf(2), intArrayOf(1))
        val expected = arrayOf(intArrayOf(2), intArrayOf(0), intArrayOf(0))

        assertArrayEquals(expected, ConstructProductMatrix.constructProductMatrix(grid))
    }
}