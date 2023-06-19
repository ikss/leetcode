package arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SearchInRotatedSortedArrayTest {
    @Test
    fun test1() {
        val nums = intArrayOf(4, 5, 6, 7, 0, 1, 2)
        val target = 0
        val expected = 4

        assertEquals(expected, SearchInRotatedSortedArray.search(nums, target))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(4, 5, 6, 7, 0, 1, 2)
        val target = 3
        val expected = -1

        assertEquals(expected, SearchInRotatedSortedArray.search(nums, target))
    }

    @Test
    fun test3() {
        val nums = intArrayOf(1)
        val target = 0
        val expected = -1

        assertEquals(expected, SearchInRotatedSortedArray.search(nums, target))
    }
}