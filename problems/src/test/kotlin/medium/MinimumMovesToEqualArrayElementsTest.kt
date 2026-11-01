package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MinimumMovesToEqualArrayElementsTest {
    @Test
    fun test1() {
        val nums = intArrayOf(1, 2, 3)
        val expected = 3

        assertEquals(expected, MinimumMovesToEqualArrayElements.minMoves(nums))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(1, 1, 1)
        val expected = 0

        assertEquals(expected, MinimumMovesToEqualArrayElements.minMoves(nums))
    }
}