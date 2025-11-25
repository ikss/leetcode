package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CountSpecialSubsequencesTest {
    @Test
    fun test1() {
        val input = intArrayOf(1, 2, 3, 4, 3, 6, 1)
        val expected = 1L

        assertEquals(expected, CountSpecialSubsequences.numberOfSubsequences(input))
    }

    @Test
    fun test2() {
        val input = intArrayOf(3, 4, 3, 4, 3, 4, 3, 4)
        val expected = 3L

        assertEquals(expected, CountSpecialSubsequences.numberOfSubsequences(input))
    }

    @Test
    fun test3() {
        val input = intArrayOf(10, 4, 2, 10, 9, 3, 45)
        val expected = 1L

        assertEquals(expected, CountSpecialSubsequences.numberOfSubsequences(input))
    }
}