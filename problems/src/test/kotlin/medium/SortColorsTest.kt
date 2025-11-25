package medium

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class SortColorsTest {
    @Test
    fun test1() {
        val nums = intArrayOf(2, 0, 2, 1, 1, 0)
        val expected = intArrayOf(0, 0, 1, 1, 2, 2)
        SortColors.sortColors(nums)

        assertArrayEquals(expected, nums)
    }

    @Test
    fun test2() {
        val nums = intArrayOf(2, 0, 1)
        val expected = intArrayOf(0, 1, 2)
        SortColors.sortColors(nums)

        assertArrayEquals(expected, nums)
    }
}
