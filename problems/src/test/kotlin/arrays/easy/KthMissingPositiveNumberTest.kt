package arrays.easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class KthMissingPositiveNumberTest {
    @Test
    fun test1naive() {
        val arr = intArrayOf(2, 3, 4, 7, 11)
        val k = 5
        val expected = 9

        assertEquals(expected, KthMissingPositiveNumber.findKthPositiveNaive(arr, k))
    }

    @Test
    fun test2naive() {
        val arr = intArrayOf(1, 2, 3, 4)
        val k = 2
        val expected = 6

        assertEquals(expected, KthMissingPositiveNumber.findKthPositiveNaive(arr, k))
    }
    @Test
    fun test1binarySearch() {
        val arr = intArrayOf(2, 3, 4, 7, 11)
        val k = 5
        val expected = 9

        assertEquals(expected, KthMissingPositiveNumber.findKthPositiveBinarySearch(arr, k))
    }

    @Test
    fun test2binarySearch() {
        val arr = intArrayOf(1, 2, 3, 4)
        val k = 2
        val expected = 6

        assertEquals(expected, KthMissingPositiveNumber.findKthPositiveBinarySearch(arr, k))
    }
}