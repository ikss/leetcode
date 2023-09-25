package strings.easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FindTheDifferenceTest {
    @Test
    fun test1() {
        val s = "abcd"
        val t = "abcde"
        val expected = 'e'

        assertEquals(expected, FindTheDifference.findTheDifference(s, t))
    }

    @Test
    fun test2() {
        val s = ""
        val t = "y"
        val expected = 'y'

        assertEquals(expected, FindTheDifference.findTheDifference(s, t))
    }
}