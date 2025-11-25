package medium

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class SumOfAbsoluteDifferencesInSortedArrayTest {
    @Test
    fun test1() {
        val nums = intArrayOf(2, 3, 5)
        val expected = intArrayOf(4, 3, 5)

        assertArrayEquals(expected, SumOfAbsoluteDifferencesInSortedArray.getSumAbsoluteDifferences(nums))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(1, 4, 6, 8, 10)
        val expected = intArrayOf(24, 15, 13, 15, 21)

        assertArrayEquals(expected, SumOfAbsoluteDifferencesInSortedArray.getSumAbsoluteDifferences(nums))
    }
}