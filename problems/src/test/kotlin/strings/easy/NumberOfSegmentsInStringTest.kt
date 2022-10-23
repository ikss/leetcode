package strings.easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class NumberOfSegmentsInStringTest {

    @Test
    fun test1() {
        val s = "Hello, my name is John"
        val expected = 5

        assertEquals(expected, NumberOfSegmentsInString.countSegments(s))
    }

    @Test
    fun test2() {
        val s = "Hello"
        val expected = 1

        assertEquals(expected, NumberOfSegmentsInString.countSegments(s))
    }

    @Test
    fun test3() {
        val s = ""
        val expected = 0

        assertEquals(expected, NumberOfSegmentsInString.countSegments(s))
    }

    @Test
    fun test4() {
        val s = "        "
        val expected = 0

        assertEquals(expected, NumberOfSegmentsInString.countSegments(s))
    }
}
