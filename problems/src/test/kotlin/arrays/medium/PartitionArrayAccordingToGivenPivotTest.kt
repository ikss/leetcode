package arrays.medium

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class PartitionArrayAccordingToGivenPivotTest {
    @Test
    fun test1() {
        val nums = intArrayOf(9, 12, 5, 10, 14, 3, 10)
        val pivot = 10
        val expected = intArrayOf(9, 5, 3, 10, 10, 12, 14)

        assertArrayEquals(expected, PartitionArrayAccordingToGivenPivot.pivotArray(nums, pivot))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(-3, 4, 3, 2)
        val pivot = 2
        val expected = intArrayOf(-3, 2, 4, 3)

        assertArrayEquals(expected, PartitionArrayAccordingToGivenPivot.pivotArray(nums, pivot))
    }
}