package easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MinimumMovesToEqualArrayElementsIIITest {
    @Test
    fun test1() {
        val nums = intArrayOf(2, 1, 3)
        val expected = 3

        assertEquals(expected, MinimumMovesToEqualArrayElementsIII.minMoves(nums))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(4, 4, 5)
        val expected = 2

        assertEquals(expected, MinimumMovesToEqualArrayElementsIII.minMoves(nums))
    }
}