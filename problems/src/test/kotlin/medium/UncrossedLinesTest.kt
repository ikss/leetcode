package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class UncrossedLinesTest {

    @Test
    fun test1() {
        val nums1 = intArrayOf(1, 4, 2)
        val nums2 = intArrayOf(1, 2, 4)
        val expected = 2

        assertEquals(expected, UncrossedLines.maxUncrossedLines(nums1, nums2))
    }

    @Test
    fun test2() {
        val nums1 = intArrayOf(2, 5, 1, 2, 5)
        val nums2 = intArrayOf(10, 5, 2, 1, 5, 2)
        val expected = 3

        assertEquals(expected, UncrossedLines.maxUncrossedLines(nums1, nums2))
    }

    @Test
    fun test3() {
        val nums1 = intArrayOf(1, 3, 7, 1, 7, 5)
        val nums2 = intArrayOf(1, 9, 2, 5, 1)
        val expected = 2

        assertEquals(expected, UncrossedLines.maxUncrossedLines(nums1, nums2))
    }
}