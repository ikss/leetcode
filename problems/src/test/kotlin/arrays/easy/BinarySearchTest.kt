package arrays.easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class BinarySearchTest {

    @Test
    fun test1() {
        val nums = intArrayOf(-1, 0, 3, 5, 9, 12)
        val target = 9
        val expected = 4

        assertEquals(expected, BinarySearch.search(nums, target))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(-1, 0, 3, 5, 9, 12)
        val target = 2
        val expected = -1

        assertEquals(expected, BinarySearch.search(nums, target))
    }
}
