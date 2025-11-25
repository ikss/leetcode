package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MinimumOperationsToMakeBinaryArrayElementsEqualToOneITest {
    @Test
    fun test1() {
        val nums = intArrayOf(0, 1, 1, 1, 0, 0)
        val expected = 3

        assertEquals(expected, MinimumOperationsToMakeBinaryArrayElementsEqualToOneI.minOperations(nums))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(0, 1, 1, 1)
        val expected = -1

        assertEquals(expected, MinimumOperationsToMakeBinaryArrayElementsEqualToOneI.minOperations(nums))
    }
}