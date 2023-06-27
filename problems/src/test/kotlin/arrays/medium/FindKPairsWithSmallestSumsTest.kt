package arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FindKPairsWithSmallestSumsTest {
    @Test
    fun test1() {
        val nums1 = intArrayOf(1, 7, 11)
        val nums2 = intArrayOf(2, 4, 6)
        val k = 3
        val expected = listOf(listOf(1, 2), listOf(1, 4), listOf(1, 6))

        assertEquals(expected, FindKPairsWithSmallestSums.kSmallestPairs(nums1, nums2, k))
    }

    @Test
    fun test2() {
        val nums1 = intArrayOf(1, 1, 2)
        val nums2 = intArrayOf(1, 2, 3)
        val k = 2
        val expected = listOf(listOf(1, 1), listOf(1, 1))

        assertEquals(expected, FindKPairsWithSmallestSums.kSmallestPairs(nums1, nums2, k))
    }

    @Test
    fun test3() {
        val nums1 = intArrayOf(1, 2)
        val nums2 = intArrayOf(3)
        val k = 3
        val expected = listOf(listOf(1, 3), listOf(2, 3))

        assertEquals(expected, FindKPairsWithSmallestSums.kSmallestPairs(nums1, nums2, k))
    }
}