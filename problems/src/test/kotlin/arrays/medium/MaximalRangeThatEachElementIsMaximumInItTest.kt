package arrays.medium

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class MaximalRangeThatEachElementIsMaximumInItTest {
    @Test
    fun test1() {
        val nums = intArrayOf(1, 5, 4, 3, 6)
        val expected = intArrayOf(1, 4, 2, 1, 5)

        assertArrayEquals(expected, MaximalRangeThatEachElementIsMaximumInIt.maximumLengthOfRanges(nums))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(1, 2, 3, 4, 5)
        val expected = intArrayOf(1, 2, 3, 4, 5)

        assertArrayEquals(expected, MaximalRangeThatEachElementIsMaximumInIt.maximumLengthOfRanges(nums))
    }
}