package arrays.medium

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class IncrementSubmatricesByOneTest {
    @Test
    fun test1() {
        val n = 3
        val queries = arrayOf(intArrayOf(1, 1, 2, 2), intArrayOf(0, 0, 1, 1))
        val expected = arrayOf(
            intArrayOf(1, 1, 0),
            intArrayOf(1, 2, 1),
            intArrayOf(0, 1, 1),
        )

        assertArrayEquals(expected, IncrementSubmatricesByOne.rangeAddQueries(n, queries))
    }

    @Test
    fun test2() {
        val n = 2
        val queries = arrayOf(intArrayOf(0, 0, 1, 1))
        val expected = arrayOf(
            intArrayOf(1, 1),
            intArrayOf(1, 1),
        )

        assertArrayEquals(expected, IncrementSubmatricesByOne.rangeAddQueries(n, queries))
    }
}