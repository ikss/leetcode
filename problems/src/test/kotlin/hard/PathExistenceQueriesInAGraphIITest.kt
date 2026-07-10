package hard

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class PathExistenceQueriesInAGraphIITest {
    @Test
    fun test1() {
        val n = 5
        val nums = intArrayOf(1, 8, 3, 4, 2)
        val maxDiff = 3
        val queries = arrayOf(intArrayOf(0, 3), intArrayOf(2, 4))
        val expected = intArrayOf(1, 1)

        assertArrayEquals(expected, PathExistenceQueriesInAGraphII.pathExistenceQueries(n, nums, maxDiff, queries))
    }

    @Test
    fun test2() {
        val n = 5
        val nums = intArrayOf(5, 3, 1, 9, 10)
        val maxDiff = 2
        val queries = arrayOf(intArrayOf(0, 1), intArrayOf(0, 2), intArrayOf(2, 3), intArrayOf(4, 3))
        val expected = intArrayOf(1, 2, -1, 1)

        assertArrayEquals(expected, PathExistenceQueriesInAGraphII.pathExistenceQueries(n, nums, maxDiff, queries))
    }

    @Test
    fun test3() {
        val n = 3
        val nums = intArrayOf(7, 4, 7)
        val maxDiff = 0
        val queries = arrayOf(intArrayOf(2, 0), intArrayOf(1, 1), intArrayOf(2, 1), intArrayOf(2, 2))
        val expected = intArrayOf(1, 0, -1, 0)

        assertArrayEquals(expected, PathExistenceQueriesInAGraphII.pathExistenceQueries(n, nums, maxDiff, queries))
    }

    @Test
    fun test4() {
        val n = 6
        val nums = intArrayOf(91, 92, 182, 179, 127, 173)
        val maxDiff = 51
        val queries = arrayOf(
            intArrayOf(2, 3),
            intArrayOf(5, 0),
            intArrayOf(0, 0),
            intArrayOf(2, 0),
            intArrayOf(0, 2),
            intArrayOf(1, 1),
            intArrayOf(0, 4),
            intArrayOf(0, 4),
            intArrayOf(2, 5),
        )
        val expected = intArrayOf(1, 2, 0, 3, 3, 0, 1, 1, 1)

        assertArrayEquals(expected, PathExistenceQueriesInAGraphII.pathExistenceQueries(n, nums, maxDiff, queries))
    }
}