package arrays.medium

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class FindTheNumberOfDistinctColorsAmongTheBallsTest {
    @Test
    fun test1() {
        val limit = 4
        val queries = arrayOf(intArrayOf(1, 4), intArrayOf(2, 5), intArrayOf(1, 3), intArrayOf(3, 4))
        val expected = intArrayOf(1, 2, 2, 3)

        assertArrayEquals(expected, FindTheNumberOfDistinctColorsAmongTheBalls.queryResults(limit, queries))
    }

    @Test
    fun test2() {
        val limit = 4
        val queries = arrayOf(intArrayOf(0, 1), intArrayOf(1, 2), intArrayOf(2, 2), intArrayOf(3, 4), intArrayOf(4, 5))
        val expected = intArrayOf(1, 2, 2, 3, 4)

        assertArrayEquals(expected, FindTheNumberOfDistinctColorsAmongTheBalls.queryResults(limit, queries))
    }
}