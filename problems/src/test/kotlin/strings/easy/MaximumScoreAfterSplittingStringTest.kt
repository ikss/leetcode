package strings.easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MaximumScoreAfterSplittingStringTest {
    @Test
    fun test1() {
        val s = "011101"
        val expected = 5

        assertEquals(expected, MaximumScoreAfterSplittingString.maxScore(s))
    }

    @Test
    fun test2() {
        val s = "00111"
        val expected = 5

        assertEquals(expected, MaximumScoreAfterSplittingString.maxScore(s))
    }

    @Test
    fun test3() {
        val s = "1111"
        val expected = 3

        assertEquals(expected, MaximumScoreAfterSplittingString.maxScore(s))
    }
}