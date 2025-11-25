package medium

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class FindMissingAndRepeatedValuesTest {
    @Test
    fun test1Array() {
        val grid = arrayOf(intArrayOf(1, 3), intArrayOf(2, 2))
        val expected = intArrayOf(2, 4)

        assertArrayEquals(expected, FindMissingAndRepeatedValues.findMissingAndRepeatedValuesArray(grid))
    }

    @Test
    fun test2Array() {
        val grid = arrayOf(intArrayOf(9, 1, 7), intArrayOf(8, 9, 2), intArrayOf(3, 4, 6))
        val expected = intArrayOf(9, 5)

        assertArrayEquals(expected, FindMissingAndRepeatedValues.findMissingAndRepeatedValuesArray(grid))
    }

    @Test
    fun test1Math() {
        val grid = arrayOf(intArrayOf(1, 3), intArrayOf(2, 2))
        val expected = intArrayOf(2, 4)

        assertArrayEquals(expected, FindMissingAndRepeatedValues.findMissingAndRepeatedValuesMath(grid))
    }

    @Test
    fun test2Math() {
        val grid = arrayOf(intArrayOf(9, 1, 7), intArrayOf(8, 9, 2), intArrayOf(3, 4, 6))
        val expected = intArrayOf(9, 5)

        assertArrayEquals(expected, FindMissingAndRepeatedValues.findMissingAndRepeatedValuesMath(grid))
    }
}