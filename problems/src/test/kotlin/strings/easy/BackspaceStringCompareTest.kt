package strings.easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class BackspaceStringCompareTest {
    @Test
    fun test1() {
        val s = "ab#c"
        val t = "ad#c"
        val expected = true

        assertEquals(expected, BackspaceStringCompare.backspaceCompareStack(s, t))
    }

    @Test
    fun test2() {
        val s = "ab##"
        val t = "c#d#"
        val expected = true

        assertEquals(expected, BackspaceStringCompare.backspaceCompareStack(s, t))
    }

    @Test
    fun test3() {
        val s = "a##c"
        val t = "#a#c"
        val expected = true

        assertEquals(expected, BackspaceStringCompare.backspaceCompareStack(s, t))
    }
}