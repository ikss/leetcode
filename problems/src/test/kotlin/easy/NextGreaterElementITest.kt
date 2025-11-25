package easy

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class NextGreaterElementITest {
    @Test
    fun test1() {
        val nums1 = intArrayOf(4, 1, 2)
        val nums2 = intArrayOf(1, 3, 4, 2)
        val expected = intArrayOf(-1, 3, -1)

        assertArrayEquals(expected, NextGreaterElementI.nextGreaterElement(nums1, nums2))
    }

    @Test
    fun test2() {
        val nums1 = intArrayOf(2, 4)
        val nums2 = intArrayOf(1, 2, 3, 4)
        val expected = intArrayOf(3, -1)

        assertArrayEquals(expected, NextGreaterElementI.nextGreaterElement(nums1, nums2))
    }
}