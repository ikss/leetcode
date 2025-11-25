package medium

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class `2SumSortedTest` {
    @Test
    fun test1() {
        val nums = intArrayOf(2, 7, 11, 15)
        val target = 9
        val expected = intArrayOf(1, 2)

        assertArrayEquals(expected, `2SumSorted`.twoSum(nums, target))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(2, 3, 4)
        val target = 6
        val expected = intArrayOf(1, 3)

        assertArrayEquals(expected, `2SumSorted`.twoSum(nums, target))
    }

    @Test
    fun test3() {
        val nums = intArrayOf(-1, 0)
        val target = -1
        val expected = intArrayOf(1, 2)

        assertArrayEquals(expected, `2SumSorted`.twoSum(nums, target))
    }
}
