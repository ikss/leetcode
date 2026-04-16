package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ClosestEqualElementQueriesTest {
    @Test
    fun test1() {
        val nums = intArrayOf(1, 3, 1, 4, 1, 3, 2)
        val queries = intArrayOf(0, 3, 5)
        val expected = listOf(2, -1, 3)

        assertEquals(expected, ClosestEqualElementQueries.solveQueries(nums, queries))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(1, 2, 3, 4)
        val queries = intArrayOf(0, 1, 2, 3)
        val expected = listOf(-1, -1, -1, -1)

        assertEquals(expected, ClosestEqualElementQueries.solveQueries(nums, queries))
    }
}