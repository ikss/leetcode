package easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CheckIfAllAsAppearsBeforeAllBsTest {
    @Test
    fun test1() {
        val s = "aaabbb"
        val expected = true

        assertEquals(expected, CheckIfAllAsAppearsBeforeAllBs.checkString(s))
    }

    @Test
    fun test2() {
        val s = "abab"
        val expected = false

        assertEquals(expected, CheckIfAllAsAppearsBeforeAllBs.checkString(s))
    }

    @Test
    fun test3() {
        val s = "bbb"
        val expected = true

        assertEquals(expected, CheckIfAllAsAppearsBeforeAllBs.checkString(s))
    }
}