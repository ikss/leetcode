package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ShiftingLettersIITest {
    @Test
    fun test1() {
        val s = "abc"
        val shifts = arrayOf(intArrayOf(0, 1, 0), intArrayOf(1, 2, 1), intArrayOf(0, 2, 1))

        val expected = "ace"
        assertEquals(expected, ShiftingLettersII.shiftingLetters(s, shifts))
    }

    @Test
    fun test2() {
        val s = "dztz"
        val shifts = arrayOf(intArrayOf(0, 0, 0), intArrayOf(1, 1, 1))

        val expected = "catz"
        assertEquals(expected, ShiftingLettersII.shiftingLetters(s, shifts))
    }
}