package collections.arrays.easy

import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class MergeSortedArrayTest {
    @Test
    fun test1() {
        val nums1 = intArrayOf(1, 2, 3, 0, 0, 0)
        val m = 3
        val nums2 = intArrayOf(2, 5, 6)
        val n = 3

        MergeSortedArray.merge(nums1, m, nums2, n)
        val expected = intArrayOf(1, 2, 2, 3, 5, 6)
        assertTrue(expected.contentEquals(nums1))
    }

    @Test
    fun test2() {
        val nums1 = intArrayOf(1)
        val m = 1
        val nums2 = intArrayOf()
        val n = 0

        MergeSortedArray.merge(nums1, m, nums2, n)
        val expected = intArrayOf(1)
        assertTrue(expected.contentEquals(nums1))
    }

    @Test
    fun test3() {
        val nums1 = intArrayOf(0)
        val m = 0
        val nums2 = intArrayOf(1)
        val n = 1

        MergeSortedArray.merge(nums1, m, nums2, n)
        val expected = intArrayOf(1)
        assertTrue(expected.contentEquals(nums1))
    }
}
