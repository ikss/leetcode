package arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MatchsticksToSquareTest {
    @Test
    fun test1() {
        val nums = intArrayOf(1, 1, 2, 2, 2)
        val expected = true

        assertEquals(expected, MatchsticksToSquare.makesquare(nums))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(3, 3, 3, 3, 4)
        val expected = false

        assertEquals(expected, MatchsticksToSquare.makesquare(nums))
    }

    @Test
    fun test3() {
        val nums = intArrayOf(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 70, 70, 101, 102, 103)
        val expected = false

        assertEquals(expected, MatchsticksToSquare.makesquare(nums))
    }

}
