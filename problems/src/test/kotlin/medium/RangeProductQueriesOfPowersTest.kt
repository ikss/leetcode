package medium

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class RangeProductQueriesOfPowersTest {
    @Test
    fun test1() {
        val n = 15
        val queries = arrayOf(
            intArrayOf(0, 1),
            intArrayOf(2, 2),
            intArrayOf(0, 3),
        )
        val expected = intArrayOf(2, 4, 64)

        assertArrayEquals(expected, RangeProductQueriesOfPowers.productQueries(n, queries))
    }

    @Test
    fun test2() {
        val n = 2
        val queries = arrayOf(
            intArrayOf(0, 0),
        )
        val expected = intArrayOf(2)

        assertArrayEquals(expected, RangeProductQueriesOfPowers.productQueries(n, queries))
    }
}