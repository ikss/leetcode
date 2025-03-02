package arrays.medium

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class MergeTwo2DArraysBySummingValuesTest {
    @Test
    fun test1() {
        val nums1 = arrayOf(
            intArrayOf(1, 2),
            intArrayOf(2, 3),
            intArrayOf(4, 5),
        )
        val nums2 = arrayOf(
            intArrayOf(1, 4),
            intArrayOf(3, 2),
            intArrayOf(4, 1),
        )
        val expected = arrayOf(
            intArrayOf(1, 6),
            intArrayOf(2, 3),
            intArrayOf(3, 2),
            intArrayOf(4, 6),
        )
        
        assertArrayEquals(expected, MergeTwo2DArraysBySummingValues.mergeArrays(nums1, nums2))
    }
    
    @Test
    fun test2() {
        val nums1 = arrayOf(
            intArrayOf(2, 4),
            intArrayOf(3, 6),
            intArrayOf(5, 5),
        )
        val nums2 = arrayOf(
            intArrayOf(1, 3),
            intArrayOf(4, 3),
        )
        val expected = arrayOf(
            intArrayOf(1, 3),
            intArrayOf(2, 4),
            intArrayOf(3, 6),
            intArrayOf(4, 3),
            intArrayOf(5, 5),
        )
        
        assertArrayEquals(expected, MergeTwo2DArraysBySummingValues.mergeArrays(nums1, nums2))
    }
}