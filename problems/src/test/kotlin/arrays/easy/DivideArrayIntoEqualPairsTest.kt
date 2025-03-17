package arrays.easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class DivideArrayIntoEqualPairsTest {
    @Test
    fun test1Sort() {
        val nums = intArrayOf(3, 2, 3, 2, 2, 2)
        val expected = true

        assertEquals(expected, DivideArrayIntoEqualPairs.divideArraySort(nums))
    }

    @Test
    fun test2Sort() {
        val nums = intArrayOf(1, 2, 3, 4)
        val expected = false

        assertEquals(expected, DivideArrayIntoEqualPairs.divideArraySort(nums))
    }

    @Test
    fun test1Count() {
        val nums = intArrayOf(3, 2, 3, 2, 2, 2)
        val expected = true

        assertEquals(expected, DivideArrayIntoEqualPairs.divideArrayCount(nums))
    }

    @Test
    fun test2Count() {
        val nums = intArrayOf(1, 2, 3, 4)
        val expected = false

        assertEquals(expected, DivideArrayIntoEqualPairs.divideArrayCount(nums))
    }
}