package strings.easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class BackspaceStringCompareTest {
    @Test
    fun test1stack() {
        val s = "ab#c"
        val t = "ad#c"
        val expected = true

        assertEquals(expected, BackspaceStringCompare.backspaceCompareStack(s, t))
    }

    @Test
    fun test2stack() {
        val s = "ab##"
        val t = "c#d#"
        val expected = true

        assertEquals(expected, BackspaceStringCompare.backspaceCompareStack(s, t))
    }

    @Test
    fun test3stack() {
        val s = "a##c"
        val t = "#a#c"
        val expected = true

        assertEquals(expected, BackspaceStringCompare.backspaceCompareStack(s, t))
    }

    @Test
    fun test1twoPointers() {
        val s = "ab#c"
        val t = "ad#c"
        val expected = true

        assertEquals(expected, BackspaceStringCompare.backspaceCompareTwoPointers(s, t))
    }

    @Test
    fun test2twoPointers() {
        val s = "ab##"
        val t = "c#d#"
        val expected = true

        assertEquals(expected, BackspaceStringCompare.backspaceCompareTwoPointers(s, t))
    }

    @Test
    fun test3twoPointers() {
        val s = "a##c"
        val t = "#a#c"
        val expected = true

        assertEquals(expected, BackspaceStringCompare.backspaceCompareTwoPointers(s, t))
    }
}