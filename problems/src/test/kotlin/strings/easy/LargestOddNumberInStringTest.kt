package strings.easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class LargestOddNumberInStringTest {
    @Test
    fun test1() {
        val s = "52"
        val expected = "5"

        assertEquals(expected, LargestOddNumberInString.largestOddNumber(s))
    }

    @Test
    fun test2() {
        val s = "4206"
        val expected = ""

        assertEquals(expected, LargestOddNumberInString.largestOddNumber(s))
    }

    @Test
    fun test3() {
        val s = "35427"
        val expected = "35427"

        assertEquals(expected, LargestOddNumberInString.largestOddNumber(s))
    }
}