package arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CountNumberOfBadPairsTest {
    @Test
    fun test1() {
        val nums = intArrayOf(4, 1, 3, 3)
        val expected = 5L

        assertEquals(expected, CountNumberOfBadPairs.countBadPairs(nums))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(1, 2, 3, 4, 5)
        val expected = 0L

        assertEquals(expected, CountNumberOfBadPairs.countBadPairs(nums))
    }
}