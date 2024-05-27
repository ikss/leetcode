package arrays.easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SpecialArrayWithXElementsGreaterThanOrEqualXTest {
    @Test
    fun test1() {
        val nums = intArrayOf(3, 5)
        val expected = 2

        assertEquals(expected, SpecialArrayWithXElementsGreaterThanOrEqualX.specialArray(nums))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(0, 0)
        val expected = -1

        assertEquals(expected, SpecialArrayWithXElementsGreaterThanOrEqualX.specialArray(nums))
    }

    @Test
    fun test3() {
        val nums = intArrayOf(0, 4, 3, 0, 4)
        val expected = 3

        assertEquals(expected, SpecialArrayWithXElementsGreaterThanOrEqualX.specialArray(nums))
    }
    
    @Test
    fun test4() {
        val nums = intArrayOf(3, 6, 7, 7, 0)
        val expected = -1

        assertEquals(expected, SpecialArrayWithXElementsGreaterThanOrEqualX.specialArray(nums))
    }
}