package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ChampagneTowerTest {
    @Test
    fun test1() {
        val poured = 1
        val query_row = 1
        val query_glass = 1
        val expected = 0.0

        assertEquals(expected, ChampagneTower.champagneTower(poured, query_row, query_glass), 0.0001)
    }

    @Test
    fun test2() {
        val poured = 2
        val query_row = 1
        val query_glass = 1
        val expected = 0.5

        assertEquals(expected, ChampagneTower.champagneTower(poured, query_row, query_glass), 0.0001)
    }

    @Test
    fun test3() {
        val poured = 100000009
        val query_row = 33
        val query_glass = 17
        val expected = 1.0

        assertEquals(expected, ChampagneTower.champagneTower(poured, query_row, query_glass), 0.0001)
    }
}