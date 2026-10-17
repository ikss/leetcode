package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MinimumSwapsToSortByDigitSumTest {
    @Test
    fun test1() {
        val nums = intArrayOf(37, 100)
        val expected = 1

        assertEquals(expected, MinimumSwapsToSortByDigitSum.minSwaps(nums))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(22, 14, 33, 7)
        val expected = 0

        assertEquals(expected, MinimumSwapsToSortByDigitSum.minSwaps(nums))
    }
}