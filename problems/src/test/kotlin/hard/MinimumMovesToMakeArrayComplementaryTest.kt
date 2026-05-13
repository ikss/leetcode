package hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MinimumMovesToMakeArrayComplementaryTest {
    @Test
    fun test1() {
        val nums = intArrayOf(1, 2, 4, 3)
        val limit = 4
        val expected = 1

        assertEquals(expected, MinimumMovesToMakeArrayComplementary.minMoves(nums, limit))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(1, 2, 2, 1)
        val limit = 2
        val expected = 2

        assertEquals(expected, MinimumMovesToMakeArrayComplementary.minMoves(nums, limit))
    }

    @Test
    fun test3() {
        val nums = intArrayOf(1, 2, 1, 2)
        val limit = 2
        val expected = 0

        assertEquals(expected, MinimumMovesToMakeArrayComplementary.minMoves(nums, limit))
    }
}