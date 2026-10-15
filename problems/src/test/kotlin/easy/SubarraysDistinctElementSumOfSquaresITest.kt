package easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SubarraysDistinctElementSumOfSquaresITest {
    @Test
    fun test1() {
        val nums = listOf(1, 2, 1)
        val expected = 15

        assertEquals(expected, SubarraysDistinctElementSumOfSquaresI.sumCounts(nums))
    }

    @Test
    fun test2() {
        val nums = listOf(1, 1)
        val expected = 3

        assertEquals(expected, SubarraysDistinctElementSumOfSquaresI.sumCounts(nums))
    }
}