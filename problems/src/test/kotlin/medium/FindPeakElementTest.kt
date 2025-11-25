package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FindPeakElementTest {
    @Test
    fun test1LinearScan() {
        val nums = intArrayOf(1, 2, 3, 1)
        val expected = 2

        assertEquals(expected, FindPeakElement.findPeakElementLinearScan(nums))
    }

    @Test
    fun test2LinearScan() {
        val nums = intArrayOf(1, 2, 1, 3, 5, 6, 4)
        val expected = 1

        assertEquals(expected, FindPeakElement.findPeakElementLinearScan(nums))
    }

    @Test
    fun test3LinearScan() {
        val nums = intArrayOf(1, 2)
        val expected = 1

        assertEquals(expected, FindPeakElement.findPeakElementLinearScan(nums))
    }

    @Test
    fun test1BinarySearch() {
        val nums = intArrayOf(1, 2, 3, 1)
        val expected = 2

        assertEquals(expected, FindPeakElement.findPeakElementBinarySearch(nums))
    }

    @Test
    fun test2BinarySearch() {
        val nums = intArrayOf(1, 2, 1, 3, 5, 6, 4)
        // The peak element is 5 at index 4, because we can return any peak and this is closest to mid
        val expected = 5

        assertEquals(expected, FindPeakElement.findPeakElementBinarySearch(nums))
    }

    @Test
    fun test3BinarySearch() {
        val nums = intArrayOf(1, 2)
        val expected = 1

        assertEquals(expected, FindPeakElement.findPeakElementBinarySearch(nums))
    }
}
