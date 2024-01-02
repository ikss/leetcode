package arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ConvertAnArrayInto2DArrayWithConditionsTest {
    @Test
    fun test1map() {
        val nums = intArrayOf(1, 3, 4, 1, 2, 3, 1)
        val expected = listOf(listOf(1, 3, 4, 2), listOf(1, 3), listOf(1))

        assertEquals(expected, ConvertAnArrayInto2DArrayWithConditions.findMatrixArray(nums))
    }

    @Test
    fun test2map() {
        val nums = intArrayOf(1, 2, 3, 4)
        val expected = listOf(listOf(1, 2, 3, 4))

        assertEquals(expected, ConvertAnArrayInto2DArrayWithConditions.findMatrixArray(nums))
    }

    @Test
    fun test1array() {
        val nums = intArrayOf(1, 3, 4, 1, 2, 3, 1)
        val expected = listOf(listOf(1, 3, 4, 2), listOf(1, 3), listOf(1))

        assertEquals(expected, ConvertAnArrayInto2DArrayWithConditions.findMatrixArray(nums))
    }

    @Test
    fun test2array() {
        val nums = intArrayOf(1, 2, 3, 4)
        val expected = listOf(listOf(1, 2, 3, 4))

        assertEquals(expected, ConvertAnArrayInto2DArrayWithConditions.findMatrixArray(nums))
    }
}