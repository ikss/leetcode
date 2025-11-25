package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MaximumErasureValueTest {
    @Test
    fun test1() {
        val nums = intArrayOf(4, 2, 4, 5, 6)
        val expected = 17

        assertEquals(expected, MaximumErasureValue.maximumUniqueSubarray(nums))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(5, 2, 1, 2, 5, 2, 1, 2, 5)
        val expected = 8

        assertEquals(expected, MaximumErasureValue.maximumUniqueSubarray(nums))
    }

    @Test
    fun test3() {
        val nums = intArrayOf(15)
        val expected = 15

        assertEquals(expected, MaximumErasureValue.maximumUniqueSubarray(nums))
    }

    @Test
    fun test1Map() {
        val nums = intArrayOf(4, 2, 4, 5, 6)
        val expected = 17

        assertEquals(expected, MaximumErasureValue.maximumUniqueSubarrayMap(nums))
    }

    @Test
    fun test2Map() {
        val nums = intArrayOf(5, 2, 1, 2, 5, 2, 1, 2, 5)
        val expected = 8

        assertEquals(expected, MaximumErasureValue.maximumUniqueSubarrayMap(nums))
    }

    @Test
    fun test3Map() {
        val nums = intArrayOf(15)
        val expected = 15

        assertEquals(expected, MaximumErasureValue.maximumUniqueSubarrayMap(nums))
    }
}
