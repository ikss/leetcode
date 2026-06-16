package medium

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class ProcessStringWithSpecialOperationsITest {
    @Test
    fun test1() {
        val s = "a#b%*"
        val expected = "ba"

        assertEquals(expected, ProcessStringWithSpecialOperationsI.processStr(s))
    }

    @Test
    fun test2() {
        val s = "z*#"
        val expected = ""

        assertEquals(expected, ProcessStringWithSpecialOperationsI.processStr(s))
    }

    @Test
    fun test3() {
        val s = "*%"
        val expected = ""

        assertEquals(expected, ProcessStringWithSpecialOperationsI.processStr(s))
    }
}