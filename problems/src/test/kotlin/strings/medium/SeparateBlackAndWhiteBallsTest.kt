package strings.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SeparateBlackAndWhiteBallsTest {
    @Test
    fun test1() {
        val s = "101"
        val expected = 1

        assertEquals(expected, SeparateBlackAndWhiteBalls.minimumSteps(s))
    }

    @Test
    fun test2() {
        val s = "100"
        val expected = 2

        assertEquals(expected, SeparateBlackAndWhiteBalls.minimumSteps(s))
    }

    @Test
    fun test3() {
        val s = "0111"
        val expected = 0

        assertEquals(expected, SeparateBlackAndWhiteBalls.minimumSteps(s))
    }
}