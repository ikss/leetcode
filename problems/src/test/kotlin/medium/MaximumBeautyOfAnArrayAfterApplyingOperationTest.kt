package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MaximumBeautyOfAnArrayAfterApplyingOperationTest {
    @Test
    fun test1() {
        val nums = intArrayOf(4, 6, 1, 2)
        val k = 2
        val expected = 3

        assertEquals(expected, MaximumBeautyOfAnArrayAfterApplyingOperation.maximumBeauty(nums, k))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(1, 1, 1, 1)
        val k = 10
        val expected = 4

        assertEquals(expected, MaximumBeautyOfAnArrayAfterApplyingOperation.maximumBeauty(nums, k))
    }
}