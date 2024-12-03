package strings.easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class AddingSpacesToStringTest {
    @Test
    fun test1() {
        val s = "LeetcodeHelpsMeLearn"
        val spaces = intArrayOf(8, 13, 15)
        val expected = "Leetcode Helps Me Learn"

        assertEquals(expected, AddingSpacesToString.addSpaces(s, spaces))
    }

    @Test
    fun test2() {
        val s = "icodeinpython"
        val spaces = intArrayOf(1, 5, 7, 9)
        val expected = "i code in py thon"

        assertEquals(expected, AddingSpacesToString.addSpaces(s, spaces))
    }

    @Test
    fun test3() {
        val s = "spacing"
        val spaces = intArrayOf(0, 1, 2, 3, 4, 5, 6)
        val expected = " s p a c i n g"

        assertEquals(expected, AddingSpacesToString.addSpaces(s, spaces))
    }
}