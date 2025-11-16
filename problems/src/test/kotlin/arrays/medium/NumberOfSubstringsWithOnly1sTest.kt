package arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class NumberOfSubstringsWithOnly1sTest {
    @Test
    fun test1() {
        val s = "0110111"
        val expected = 9

        assertEquals(expected, NumberOfSubstringsWithOnly1s.numSub(s))
    }

    @Test
    fun test2() {
        val s = "101"
        val expected = 2

        assertEquals(expected, NumberOfSubstringsWithOnly1s.numSub(s))
    }

    @Test
    fun test3() {
        val s = "111111"
        val expected = 21

        assertEquals(expected, NumberOfSubstringsWithOnly1s.numSub(s))
    }
}