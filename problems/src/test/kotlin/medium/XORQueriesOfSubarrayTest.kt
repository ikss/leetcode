package medium

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class XORQueriesOfSubarrayTest {
    @Test
    fun test1() {
        val arr = intArrayOf(1, 3, 4, 8)
        val queries = arrayOf(intArrayOf(0, 1), intArrayOf(1, 2), intArrayOf(0, 3), intArrayOf(3, 3))
        val expected = intArrayOf(2, 7, 14, 8)

        assertArrayEquals(expected, XORQueriesOfSubarray.xorQueries(arr, queries))
    }

    @Test
    fun test2() {
        val arr = intArrayOf(4, 8, 2, 10)
        val queries = arrayOf(intArrayOf(2, 3), intArrayOf(1, 3), intArrayOf(0, 0), intArrayOf(0, 3))
        val expected = intArrayOf(8, 0, 4, 4)

        assertArrayEquals(expected, XORQueriesOfSubarray.xorQueries(arr, queries))
    }
}