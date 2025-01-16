package arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class BitwiseXOROfAllPairingsTest {
    @Test
    fun test1() {
        val nums1 = intArrayOf(2, 1, 3)
        val nums2 = intArrayOf(10, 2, 5, 0)
        val expected = 13

        assertEquals(expected, BitwiseXOROfAllPairings.xorAllNums(nums1, nums2))
    }

    @Test
    fun test2() {
        val nums1 = intArrayOf(1, 2)
        val nums2 = intArrayOf(3, 4)
        val expected = 0

        assertEquals(expected, BitwiseXOROfAllPairings.xorAllNums(nums1, nums2))
    }
}