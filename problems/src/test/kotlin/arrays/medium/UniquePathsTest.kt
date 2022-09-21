package arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class UniquePathsTest {

    @Test
    fun test1() {
        val m = 3
        val n = 7
        val expected = 28

        assertEquals(expected, UniquePaths.uniquePaths(m, n))
    }

    @Test
    fun test2() {
        val m = 3
        val n = 2
        val expected = 3

        assertEquals(expected, UniquePaths.uniquePaths(m, n))
    }
}
