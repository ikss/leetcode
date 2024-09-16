package arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MinimumTimeDifferenceTest {
    @Test
    fun test1Sort() {
        val timePoints = listOf("23:59", "00:00")
        val expected = 1

        assertEquals(expected, MinimumTimeDifference.findMinDifferenceSort(timePoints))
    }

    @Test
    fun test2Sort() {
        val timePoints = listOf("00:00", "23:59", "00:00")
        val expected = 0

        assertEquals(expected, MinimumTimeDifference.findMinDifferenceSort(timePoints))
    }

    @Test
    fun test3Sort() {
        val timePoints = listOf("16:28", "10:33", "19:36", "11:30", "12:04")
        val expected = 34

        assertEquals(expected, MinimumTimeDifference.findMinDifferenceSort(timePoints))
    }

    @Test
    fun test1BucketSort() {
        val timePoints = listOf("23:59", "00:00")
        val expected = 1

        assertEquals(expected, MinimumTimeDifference.findMinDifferenceBucketSort(timePoints))
    }

    @Test
    fun test2BucketSort() {
        val timePoints = listOf("00:00", "23:59", "00:00")
        val expected = 0

        assertEquals(expected, MinimumTimeDifference.findMinDifferenceBucketSort(timePoints))
    }

    @Test
    fun test3BucketSort() {
        val timePoints = listOf("16:28", "10:33", "19:36", "11:30", "12:04")
        val expected = 34

        assertEquals(expected, MinimumTimeDifference.findMinDifferenceBucketSort(timePoints))
    }
}