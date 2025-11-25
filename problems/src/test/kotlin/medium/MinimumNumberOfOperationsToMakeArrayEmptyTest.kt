package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MinimumNumberOfOperationsToMakeArrayEmptyTest {
    @Test
    fun test1() {
        val nums = intArrayOf(2, 3, 3, 2, 2, 4, 2, 3, 4)
        val expected = 4

        assertEquals(expected, MinimumNumberOfOperationsToMakeArrayEmpty.minOperations(nums))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(2, 1, 2, 2, 3, 3)
        val expected = -1

        assertEquals(expected, MinimumNumberOfOperationsToMakeArrayEmpty.minOperations(nums))
    }
}