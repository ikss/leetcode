package easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ElementAppearingMoreThanQuarterInSortedArrayTest {
    @Test
    fun test1() {
        val arr = intArrayOf(1, 2, 2, 6, 6, 6, 6, 7, 10)
        val expected = 6

        assertEquals(expected, ElementAppearingMoreThanQuarterInSortedArray.findSpecialInteger(arr))
    }

    @Test
    fun test2() {
        val arr = intArrayOf(1, 1)
        val expected = 1

        assertEquals(expected, ElementAppearingMoreThanQuarterInSortedArray.findSpecialInteger(arr))
    }
}