package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class PredictTheWinnerTest {
    @Test
    fun test1() {
        val nums = intArrayOf(1, 5, 2)
        val expected = false

        assertEquals(expected, PredictTheWinner.predictTheWinner(nums))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(1, 5, 233, 7)
        val expected = true

        assertEquals(expected, PredictTheWinner.predictTheWinner(nums))
    }
}