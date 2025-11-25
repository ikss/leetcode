package easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SmallestMissingNonNegativeIntegerAfterOperationsTest {
    @Test
    fun test1() {
        val nums = intArrayOf(1, -10, 7, 13, 6, 8)
        val value = 5
        val expected = 4

        assertEquals(expected, SmallestMissingNonNegativeIntegerAfterOperations.findSmallestInteger(nums, value))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(1, -10, 7, 13, 6, 8)
        val value = 7
        val expected = 2

        assertEquals(expected, SmallestMissingNonNegativeIntegerAfterOperations.findSmallestInteger(nums, value))
    }
}