package hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MaximumFrequencyOfElementAfterPerformingOperationsIITest {
    @Test
    fun test1() {
        val nums = intArrayOf(1, 4, 5)
        val k = 1
        val numOperations = 2
        val expected = 2

        assertEquals(
            expected,
            MaximumFrequencyOfElementAfterPerformingOperationsII.maxFrequency(nums, k, numOperations)
        )
    }

    @Test
    fun test2() {
        val nums = intArrayOf(5, 11, 20, 20)
        val k = 5
        val numOperations = 1
        val expected = 2

        assertEquals(
            expected,
            MaximumFrequencyOfElementAfterPerformingOperationsII.maxFrequency(nums, k, numOperations)
        )
    }

    @Test
    fun test3() {
        val nums = intArrayOf(66,37,40,40)
        val k = 77
        val numOperations = 2
        val expected = 4

        assertEquals(
            expected,
            MaximumFrequencyOfElementAfterPerformingOperationsII.maxFrequency(nums, k, numOperations)
        )
    }
}