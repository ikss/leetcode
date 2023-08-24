package arrays.easy

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class DuplicateZerosTest {
    @Test
    fun test1() {
        val input = intArrayOf(1, 0, 2, 3, 0, 4, 5, 0)
        val expected = intArrayOf(1, 0, 0, 2, 3, 0, 0, 4)
        DuplicateZeros.duplicateZeros(input)

        assertArrayEquals(expected, input)
    }

    @Test
    fun test2() {
        val input = intArrayOf(1, 2, 3)
        val expected = intArrayOf(1, 2, 3)
        DuplicateZeros.duplicateZeros(input)

        assertArrayEquals(expected, input)
    }

    @Test
    fun test3() {
        val input = intArrayOf(0, 0, 0, 0, 0, 0, 0)
        val expected = intArrayOf(0, 0, 0, 0, 0, 0, 0)
        DuplicateZeros.duplicateZeros(input)

        assertArrayEquals(expected, input)
    }
}