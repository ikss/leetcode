package medium

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class PathExistenceQueriesInAGraphITest {
    @Test
    fun test1() {
        val n = 2
        val nums = intArrayOf(1, 3)
        val maxDiff = 1
        val queries = arrayOf(intArrayOf(0, 0), intArrayOf(0, 1))
        val expected = booleanArrayOf(true, false)

        assertArrayEquals(expected, PathExistenceQueriesInAGraphI.pathExistenceQueries(n, nums, maxDiff, queries))
    }

    @Test
    fun test2() {
        val n = 4
        val nums = intArrayOf(2, 5, 6, 8)
        val maxDiff = 2
        val queries = arrayOf(intArrayOf(0, 1), intArrayOf(0, 2), intArrayOf(1, 3), intArrayOf(2, 3))
        val expected = booleanArrayOf(false, false, true, true)

        assertArrayEquals(expected, PathExistenceQueriesInAGraphI.pathExistenceQueries(n, nums, maxDiff, queries))
    }
}