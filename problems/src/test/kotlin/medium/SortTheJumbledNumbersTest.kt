package medium

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class SortTheJumbledNumbersTest {
    @Test
    fun test1() {
        val mapping = intArrayOf(8, 9, 4, 0, 2, 1, 3, 5, 7, 6)
        val nums = intArrayOf(991, 338, 38)
        val expected = intArrayOf(338, 38, 991)

        assertArrayEquals(expected, SortTheJumbledNumbers.sortJumbled(mapping, nums))
    }

    @Test
    fun test2() {
        val mapping = intArrayOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)
        val nums = intArrayOf(789, 456, 123)
        val expected = intArrayOf(123, 456, 789)

        assertArrayEquals(expected, SortTheJumbledNumbers.sortJumbled(mapping, nums))
    }
}