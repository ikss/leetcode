package arrays.easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SpecialArrayFreqWithXElementsGreaterThanOrEqualXTest {
    @Test
    fun test1freq() {
        val nums = intArrayOf(3, 5)
        val expected = 2

        assertEquals(expected, SpecialArrayWithXElementsGreaterThanOrEqualX.specialArrayFreq(nums))
    }

    @Test
    fun test2freq() {
        val nums = intArrayOf(0, 0)
        val expected = -1

        assertEquals(expected, SpecialArrayWithXElementsGreaterThanOrEqualX.specialArrayFreq(nums))
    }

    @Test
    fun test3freq() {
        val nums = intArrayOf(0, 4, 3, 0, 4)
        val expected = 3

        assertEquals(expected, SpecialArrayWithXElementsGreaterThanOrEqualX.specialArrayFreq(nums))
    }

    @Test
    fun test4freq() {
        val nums = intArrayOf(3, 6, 7, 7, 0)
        val expected = -1

        assertEquals(expected, SpecialArrayWithXElementsGreaterThanOrEqualX.specialArrayFreq(nums))
    }

    @Test
    fun test1simplified() {
        val nums = intArrayOf(3, 5)
        val expected = 2

        assertEquals(expected, SpecialArrayWithXElementsGreaterThanOrEqualX.specialArraySimplified(nums))
    }

    @Test
    fun test2simplified() {
        val nums = intArrayOf(0, 0)
        val expected = -1

        assertEquals(expected, SpecialArrayWithXElementsGreaterThanOrEqualX.specialArraySimplified(nums))
    }

    @Test
    fun test3simplified() {
        val nums = intArrayOf(0, 4, 3, 0, 4)
        val expected = 3

        assertEquals(expected, SpecialArrayWithXElementsGreaterThanOrEqualX.specialArraySimplified(nums))
    }

    @Test
    fun test4simplified() {
        val nums = intArrayOf(3, 6, 7, 7, 0)
        val expected = -1

        assertEquals(expected, SpecialArrayWithXElementsGreaterThanOrEqualX.specialArraySimplified(nums))
    }
}