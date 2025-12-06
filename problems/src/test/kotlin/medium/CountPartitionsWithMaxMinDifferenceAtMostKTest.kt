package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CountPartitionsWithMaxMinDifferenceAtMostKTest {
    @Test
    fun test1() {
        val nums = intArrayOf(9, 4, 1, 3, 7)
        val k = 4
        val expected = 6

        assertEquals(expected, CountPartitionsWithMaxMinDifferenceAtMostK.countPartitions(nums, k))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(3, 3, 4)
        val k = 0
        val expected = 2

        assertEquals(expected, CountPartitionsWithMaxMinDifferenceAtMostK.countPartitions(nums, k))
    }
}