package arrays.hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class FirstMissingPositiveTest {

    @Test
    fun test1naive() {
        val nums = intArrayOf(1, 2, 0)
        val expected = 3

        assertEquals(expected, FirstMissingPositive.firstMissingPositiveNaive(nums))
    }

    @Test
    fun test2naive() {
        val nums = intArrayOf(3, 4, -1, 1)
        val expected = 2

        assertEquals(expected, FirstMissingPositive.firstMissingPositiveNaive(nums))
    }

    @Test
    fun test3naive() {
        val nums = intArrayOf(7, 8, 9, 11, 12)
        val expected = 1

        assertEquals(expected, FirstMissingPositive.firstMissingPositiveNaive(nums))
    }

    @Test
    fun test1optimized() {
        val nums = intArrayOf(1, 2, 0)
        val expected = 3

        assertEquals(expected, FirstMissingPositive.firstMissingPositiveOptimized(nums))
    }

    @Test
    fun test2optimized() {
        val nums = intArrayOf(3, 4, -1, 1)
        val expected = 2

        assertEquals(expected, FirstMissingPositive.firstMissingPositiveOptimized(nums))
    }

    @Test
    fun test3optimized() {
        val nums = intArrayOf(7, 8, 9, 11, 12)
        val expected = 1

        assertEquals(expected, FirstMissingPositive.firstMissingPositiveOptimized(nums))
    }
}
