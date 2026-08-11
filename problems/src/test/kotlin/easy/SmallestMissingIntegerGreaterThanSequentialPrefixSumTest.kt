package easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SmallestMissingIntegerGreaterThanSequentialPrefixSumTest {
    @Test
    fun test1() {
        val nums = intArrayOf(1, 2, 3, 2, 5)
        val expected = 6

        assertEquals(expected, SmallestMissingIntegerGreaterThanSequentialPrefixSum.missingInteger(nums))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(3, 4, 5, 1, 12, 14, 13)
        val expected = 15

        assertEquals(expected, SmallestMissingIntegerGreaterThanSequentialPrefixSum.missingInteger(nums))
    }
}