package arrays.easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MaximumProductOfThreeNumbersTest {
    @Test
    fun test1Sort() {
        val nums = intArrayOf(1, 2, 3)
        val expected = 6

        assertEquals(expected, MaximumProductOfThreeNumbers.maximumProductSort(nums))
    }

    @Test
    fun test2Sort() {
        val nums = intArrayOf(1, 2, 3, 4)
        val expected = 24

        assertEquals(expected, MaximumProductOfThreeNumbers.maximumProductSort(nums))
    }

    @Test
    fun test3Sort() {
        val nums = intArrayOf(-1, -2, -3)
        val expected = -6

        assertEquals(expected, MaximumProductOfThreeNumbers.maximumProductSort(nums))
    }

    @Test
    fun test1MinMax() {
        val nums = intArrayOf(1, 2, 3)
        val expected = 6

        assertEquals(expected, MaximumProductOfThreeNumbers.maximumProductMinMax(nums))
    }

    @Test
    fun test2MinMax() {
        val nums = intArrayOf(1, 2, 3, 4)
        val expected = 24

        assertEquals(expected, MaximumProductOfThreeNumbers.maximumProductMinMax(nums))
    }

    @Test
    fun test3MinMax() {
        val nums = intArrayOf(-1, -2, -3)
        val expected = -6

        assertEquals(expected, MaximumProductOfThreeNumbers.maximumProductMinMax(nums))
    }
}