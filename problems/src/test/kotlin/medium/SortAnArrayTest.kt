package medium

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class SortAnArrayTest {
    @Test
    fun test1() {
        val nums = intArrayOf(5, 2, 3, 1)
        val expected = intArrayOf(1, 2, 3, 5)
        SortAnArray.sortArray(nums)

        assertArrayEquals(expected, nums)
    }

    @Test
    fun test2() {
        val nums = intArrayOf(5, 1, 1, 2, 0, 0)
        val expected = intArrayOf(0, 0, 1, 1, 2, 5)
        SortAnArray.sortArray(nums)

        assertArrayEquals(expected, nums)
    }
}