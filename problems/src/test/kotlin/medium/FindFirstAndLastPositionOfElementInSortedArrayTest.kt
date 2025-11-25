package medium

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class FindFirstAndLastPositionOfElementInSortedArrayTest {
    @Test
    fun test1() {
        val nums = intArrayOf(5, 7, 7, 8, 8, 10)
        val target = 8
        val expected = intArrayOf(3, 4)

        assertArrayEquals(expected, FindFirstAndLastPositionOfElementInSortedArray.searchRange(nums, target))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(5, 7, 7, 8, 8, 10)
        val target = 6
        val expected = intArrayOf(-1, -1)

        assertArrayEquals(expected, FindFirstAndLastPositionOfElementInSortedArray.searchRange(nums, target))
    }

    @Test
    fun test3() {
        val nums = intArrayOf()
        val target = 0
        val expected = intArrayOf(-1, -1)

        assertArrayEquals(expected, FindFirstAndLastPositionOfElementInSortedArray.searchRange(nums, target))
    }

    @Test
    fun test4() {
        val nums = intArrayOf(1)
        val target = 1
        val expected = intArrayOf(0, 0)

        assertArrayEquals(expected, FindFirstAndLastPositionOfElementInSortedArray.searchRange(nums, target))
    }

    @Test
    fun test5() {
        val nums = intArrayOf(2, 2)
        val target = 2
        val expected = intArrayOf(0, 1)

        assertArrayEquals(expected, FindFirstAndLastPositionOfElementInSortedArray.searchRange(nums, target))
    }
}