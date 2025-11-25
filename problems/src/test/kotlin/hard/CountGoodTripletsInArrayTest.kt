package hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CountGoodTripletsInArrayTest {
    @Test
    fun test1() {
        val nums1 = intArrayOf(0, 1, 2, 3)
        val nums2 = intArrayOf(1, 0, 2, 3)
        val expected = 2L

        assertEquals(expected, CountGoodTripletsInArray.goodTriplets(nums1, nums2))
    }

    @Test
    fun test2() {
        val nums1 = intArrayOf(4, 0, 1, 3, 2)
        val nums2 = intArrayOf(4, 1, 0, 2, 3)
        val expected = 4L

        assertEquals(expected, CountGoodTripletsInArray.goodTriplets(nums1, nums2))
    }
}