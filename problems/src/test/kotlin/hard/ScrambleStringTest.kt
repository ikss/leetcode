package hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ScrambleStringTest {
    @Test
    fun test1() {
        val s1 = "great"
        val s2 = "rgeat"
        val expected = true

        assertEquals(expected, ScrambleString.isScramble(s1, s2))
    }

    @Test
    fun test2() {
        val s1 = "abcde"
        val s2 = "caebd"
        val expected = false

        assertEquals(expected, ScrambleString.isScramble(s1, s2))
    }

    @Test
    fun test3() {
        val s1 = "a"
        val s2 = "a"
        val expected = true

        assertEquals(expected, ScrambleString.isScramble(s1, s2))
    }
}