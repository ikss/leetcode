package hard

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class SortedGCDPairQueriesTest {
    @Test
    fun test1() {
        val nums = intArrayOf(2, 3, 4)
        val queries = longArrayOf(0, 2, 2)
        val expected = intArrayOf(1, 2, 2)

        assertArrayEquals(expected, SortedGCDPairQueries.gcdValues(nums, queries))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(4, 4, 2, 1)
        val queries = longArrayOf(5, 3, 1, 0)
        val expected = intArrayOf(4, 2, 1, 1)

        assertArrayEquals(expected, SortedGCDPairQueries.gcdValues(nums, queries))
    }

    @Test
    fun test3() {
        val nums = intArrayOf(2, 2)
        val queries = longArrayOf(0, 0)
        val expected = intArrayOf(2, 2)

        assertArrayEquals(expected, SortedGCDPairQueries.gcdValues(nums, queries))
    }
}