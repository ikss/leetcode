package arrays.easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MinimumCommonValueTest {
    @Test
    fun test1() {
        val nums1 = intArrayOf(1, 2, 3)
        val nums2 = intArrayOf(2, 3, 4)
        val expected = 2

        assertEquals(expected, MinimumCommonValue.getCommon(nums1, nums2))
    }

    @Test
    fun test2() {
        val nums1 = intArrayOf(1, 2, 3)
        val nums2 = intArrayOf(4, 5, 6)
        val expected = -1

        assertEquals(expected, MinimumCommonValue.getCommon(nums1, nums2))
    }
}