package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SearchInRotatedSortedArrayIITest {
    @Test
    fun test1() {
        val nums = intArrayOf(2, 5, 6, 0, 0, 1, 2)
        val target = 0
        val expected = true

        assertEquals(expected, SearchInRotatedSortedArrayII.search(nums, target))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(2, 5, 6, 0, 0, 1, 2)
        val target = 3
        val expected = false

        assertEquals(expected, SearchInRotatedSortedArrayII.search(nums, target))
    }
}