package arrays.medium

import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class SumOfEvenNumbersAfterQueriesTest {
    @Test
    fun test1() {
        val nums = intArrayOf(1, 2, 3, 4)
        val queries = arrayOf(intArrayOf(1, 0), intArrayOf(-3, 1), intArrayOf(-4, 0), intArrayOf(2, 3))
        val expected = intArrayOf(8, 6, 2, 4)

        assertTrue(expected.contentEquals(SumOfEvenNumbersAfterQueries.sumEvenAfterQueries(nums, queries)))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(1)
        val queries = arrayOf(intArrayOf(4, 0))
        val expected = intArrayOf(0)

        assertTrue(expected.contentEquals(SumOfEvenNumbersAfterQueries.sumEvenAfterQueries(nums, queries)))
    }
}