package arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ZeroArrayTransformationIITest {
    @Test
    fun test1() {
        val input = intArrayOf(2, 0, 2)
        val queries = arrayOf(intArrayOf(0, 2, 1), intArrayOf(0, 2, 1), intArrayOf(1, 1, 3))
        val expected = 2

        assertEquals(expected, ZeroArrayTransformationII.minZeroArray(input, queries))
    }

    @Test
    fun test2() {
        val input = intArrayOf(4, 3, 2, 1)
        val queries = arrayOf(intArrayOf(1, 3, 2), intArrayOf(0, 2, 1))
        val expected = -1

        assertEquals(expected, ZeroArrayTransformationII.minZeroArray(input, queries))
    }

    @Test
    fun test3() {
        val input = intArrayOf(4, 3, 2, 1)
        val queries = arrayOf(intArrayOf(1, 3, 2), intArrayOf(0, 2, 1))
        val expected = -1

        assertEquals(expected, ZeroArrayTransformationII.minZeroArray(input, queries))
    }
}