package strings.easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class RotateStringTest {
    @Test
    fun test1() {
        val s = "abcde"
        val goal = "cdeab"
        val expected = true

        assertEquals(expected, RotateString.rotateString(s, goal))
    }

    @Test
    fun test2() {
        val s = "abcde"
        val goal = "abced"
        val expected = false

        assertEquals(expected, RotateString.rotateString(s, goal))
    }
}