package arrays.easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SearchInsertPositionTest {

    @Test
    fun test1() {
        val nums = intArrayOf(1, 3, 5, 6)
        val target = 5
        val expected = 2

        assertEquals(expected, SearchInsertPosition.searchInsert(nums, target))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(1, 3, 5, 6)
        val target = 2
        val expected = 1

        assertEquals(expected, SearchInsertPosition.searchInsert(nums, target))
    }

    @Test
    fun test3() {
        val nums = intArrayOf(1, 3, 5, 6)
        val target = 7
        val expected = 4

        assertEquals(expected, SearchInsertPosition.searchInsert(nums, target))
    }
}
