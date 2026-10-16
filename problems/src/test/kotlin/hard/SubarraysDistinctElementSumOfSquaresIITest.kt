package hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SubarraysDistinctElementSumOfSquaresIITest {
    @Test
    fun test1() {
        val nums = intArrayOf(1, 2, 1)
        val expected = 15

        assertEquals(expected, SubarraysDistinctElementSumOfSquaresII.sumCounts(nums))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(2, 2)
        val expected = 3

        assertEquals(expected, SubarraysDistinctElementSumOfSquaresII.sumCounts(nums))
    }
}