package arrays.easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class DivideArrayIntoEqualPairsTest {
    @Test
    fun test1() {
        val nums = intArrayOf(3, 2, 3, 2, 2, 2)
        val expected = true

        assertEquals(expected, DivideArrayIntoEqualPairs.divideArray(nums))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(1, 2, 3, 4)
        val expected = false

        assertEquals(expected, DivideArrayIntoEqualPairs.divideArray(nums))
    }
}