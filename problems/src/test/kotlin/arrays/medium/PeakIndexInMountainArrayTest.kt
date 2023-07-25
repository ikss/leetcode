package arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class PeakIndexInMountainArrayTest {
    @Test
    fun test1() {
        val input = intArrayOf(0, 1, 0)
        val expected = 1

        assertEquals(expected, PeakIndexInMountainArray.peakIndexInMountainArray(input))
    }

    @Test
    fun test2() {
        val input = intArrayOf(0, 2, 1, 0)
        val expected = 1

        assertEquals(expected, PeakIndexInMountainArray.peakIndexInMountainArray(input))
    }

    @Test
    fun test3() {
        val input = intArrayOf(0, 10, 5, 2)
        val expected = 1

        assertEquals(expected, PeakIndexInMountainArray.peakIndexInMountainArray(input))
    }
}