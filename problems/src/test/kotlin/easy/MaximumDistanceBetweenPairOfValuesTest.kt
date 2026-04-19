package easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MaximumDistanceBetweenPairOfValuesTest {
    @Test
    fun test1() {
        val nums1 = intArrayOf(55, 30, 5, 4, 2)
        val nums2 = intArrayOf(100, 20, 10, 10, 5)
        val expected = 2

        assertEquals(expected, MaximumDistanceBetweenPairOfValues.maxDistance(nums1, nums2))
    }

    @Test
    fun test2() {
        val nums1 = intArrayOf(2, 2, 2)
        val nums2 = intArrayOf(10, 10, 1)
        val expected = 1

        assertEquals(expected, MaximumDistanceBetweenPairOfValues.maxDistance(nums1, nums2))
    }

    @Test
    fun test3() {
        val nums1 = intArrayOf(30, 29, 19, 5)
        val nums2 = intArrayOf(25, 25, 25, 25, 25)
        val expected = 2

        assertEquals(expected, MaximumDistanceBetweenPairOfValues.maxDistance(nums1, nums2))
    }
}