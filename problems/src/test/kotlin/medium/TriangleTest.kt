package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class TriangleTest {

    @Test
    fun test1dfs() {
        val triangle = listOf(listOf(2), listOf(3, 4), listOf(6, 5, 7), listOf(4, 1, 8, 3))
        val expected = 11

        assertEquals(expected, Triangle.minimumTotalDfs(triangle))
    }

    @Test
    fun test2dfs() {
        val triangle = listOf(listOf(-11))
        val expected = -11

        assertEquals(expected, Triangle.minimumTotalDfs(triangle))
    }

    @Test
    fun test1dp() {
        val triangle = listOf(listOf(2), listOf(3, 4), listOf(6, 5, 7), listOf(4, 1, 8, 3))
        val expected = 11

        assertEquals(expected, Triangle.minimumTotalDp(triangle))
    }

    @Test
    fun test2dp() {
        val triangle = listOf(listOf(-11))
        val expected = -11

        assertEquals(expected, Triangle.minimumTotalDp(triangle))
    }
}
