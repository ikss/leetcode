package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MinimumNumberOfOperationsToMakeAllArrayElementsEqualTo1Test {
    @Test
    fun test1() {
        val nums = intArrayOf(2, 6, 3, 4)
        val expected = 4
        assertEquals(expected, MinimumNumberOfOperationsToMakeAllArrayElementsEqualTo1.minOperations(nums))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(2,10,6,14)
        val expected = -1
        assertEquals(expected, MinimumNumberOfOperationsToMakeAllArrayElementsEqualTo1.minOperations(nums))
    }
}