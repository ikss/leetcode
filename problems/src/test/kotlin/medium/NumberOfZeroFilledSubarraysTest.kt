package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class NumberOfZeroFilledSubarraysTest {
    @Test
    fun test1naive() {
        val nums = intArrayOf(1, 3, 0, 0, 2, 0, 0, 4)
        val expected = 6L

        assertEquals(expected, NumberOfZeroFilledSubarrays.zeroFilledSubarrayNaive(nums))
    }

    @Test
    fun test2naive() {
        val nums = intArrayOf(0, 0, 0, 2, 0, 0)
        val expected = 9L

        assertEquals(expected, NumberOfZeroFilledSubarrays.zeroFilledSubarrayNaive(nums))
    }

    @Test
    fun test1official() {
        val nums = intArrayOf(1, 3, 0, 0, 2, 0, 0, 4)
        val expected = 6L

        assertEquals(expected, NumberOfZeroFilledSubarrays.zeroFilledSubarrayNaiveOfficial(nums))
    }

    @Test
    fun test2official() {
        val nums = intArrayOf(0, 0, 0, 2, 0, 0)
        val expected = 9L

        assertEquals(expected, NumberOfZeroFilledSubarrays.zeroFilledSubarrayNaiveOfficial(nums))
    }
}