package easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ReverseDegreeOfaStringTest {
    @Test
    fun test1() {
        val s = "abc"
        val expected = 148

        assertEquals(expected, ReverseDegreeOfaString.reverseDegree(s))
    }

    @Test
    fun test2() {
        val s = "zaza"
        val expected = 160

        assertEquals(expected, ReverseDegreeOfaString.reverseDegree(s))
    }
}