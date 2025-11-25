package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CheckIfStringCanBreakAnotherStringTest {
    @Test
    fun test1() {
        val s1 = "abc"
        val s2 = "xya"
        val expected = true

        assertEquals(expected, CheckIfStringCanBreakAnotherString.checkIfCanBreak(s1, s2))
    }

    @Test
    fun test2() {
        val s1 = "abe"
        val s2 = "acd"
        val expected = false

        assertEquals(expected, CheckIfStringCanBreakAnotherString.checkIfCanBreak(s1, s2))
    }

    @Test
    fun test3() {
        val s1 = "leetcodee"
        val s2 = "interview"
        val expected = true

        assertEquals(expected, CheckIfStringCanBreakAnotherString.checkIfCanBreak(s1, s2))
    }
}