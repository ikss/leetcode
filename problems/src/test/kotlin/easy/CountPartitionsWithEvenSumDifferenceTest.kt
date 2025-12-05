package easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CountPartitionsWithEvenSumDifferenceTest {
    @Test
    fun test1() {
        val nums = intArrayOf(10, 10, 3, 7, 6)
        val expected = 4

        assertEquals(expected, CountPartitionsWithEvenSumDifference.countPartitions(nums))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(1, 2, 2)
        val expected = 0

        assertEquals(expected, CountPartitionsWithEvenSumDifference.countPartitions(nums))
    }

    @Test
    fun test3() {
        val nums = intArrayOf(2, 4, 6, 8)
        val expected = 3

        assertEquals(expected, CountPartitionsWithEvenSumDifference.countPartitions(nums))
    }
}