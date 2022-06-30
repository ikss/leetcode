package data_structures.arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MinimumMovesToEqualArrayElementsIITest {

    @Test
    fun test1() {
        val nums = intArrayOf(1, 2, 3)
        val expected = 2

        assertEquals(expected, MinimumMovesToEqualArrayElementsII.minMoves2(nums))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(1, 10, 2, 9)
        val expected = 16

        assertEquals(expected, MinimumMovesToEqualArrayElementsII.minMoves2(nums))
    }

    @Test
    fun test3() {
        val nums = intArrayOf(1, 0, 0, 8, 6)
        val expected = 14

        assertEquals(expected, MinimumMovesToEqualArrayElementsII.minMoves2(nums))
    }
}
