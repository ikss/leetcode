package easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ScoreOfStringTest {
    @Test
    fun test1() {
        val s = "hello"
        val expected = 13

        assertEquals(expected, ScoreOfString.scoreOfString(s))
    }

    @Test
    fun test2() {
        val s = "zaz"
        val expected = 50

        assertEquals(expected, ScoreOfString.scoreOfString(s))
    }
}