package data_structures.arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class TriangleTest {

    @Test
    fun testDfs1() {
        val triangle = listOf(listOf(2), listOf(3, 4), listOf(6, 5, 7), listOf(4, 1, 8, 3))
        val expected = 11

        assertEquals(expected, Triangle.minimumTotalDfs(triangle))
    }

    @Test
    fun testDfs2() {
        val triangle = listOf(listOf(-11))
        val expected = -11

        assertEquals(expected, Triangle.minimumTotalDfs(triangle))
    }

    @Test
    fun testDp1() {
        val triangle = listOf(listOf(2), listOf(3, 4), listOf(6, 5, 7), listOf(4, 1, 8, 3))
        val expected = 11

        assertEquals(expected, Triangle.minimumTotalDp(triangle))
    }

    @Test
    fun testDp2() {
        val triangle = listOf(listOf(-11))
        val expected = -11

        assertEquals(expected, Triangle.minimumTotalDp(triangle))
    }
}
