package medium

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class DivideArrayIntoArraysWithMaxDifferenceTest {
    @Test
    fun test1() {
        val input = intArrayOf(1, 3, 4, 8, 7, 9, 3, 5, 1)
        val k = 2
        val expected = arrayOf(intArrayOf(1, 1, 3), intArrayOf(3, 4, 5), intArrayOf(7, 8, 9))

        assertArrayEquals(expected, DivideArrayIntoArraysWithMaxDifference.divideArray(input, k))
    }

    @Test
    fun test2() {
        val input = intArrayOf(1, 3, 3, 2, 7, 3)
        val k = 3
        val expected = emptyArray<IntArray>()

        assertArrayEquals(expected, DivideArrayIntoArraysWithMaxDifference.divideArray(input, k))
    }
}