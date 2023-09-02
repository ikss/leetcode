package strings.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ExtraCharactersInStringTest {
    @Test
    fun test1() {
        val s = "leetscode"
        val dictionary = arrayOf("leet", "code", "leetcode")
        val expected = 1

        assertEquals(expected, ExtraCharactersInString.minExtraChar(s, dictionary))
    }

    @Test
    fun test2() {
        val s = "sayhelloworld"
        val dictionary = arrayOf("hello", "world")
        val expected = 3

        assertEquals(expected, ExtraCharactersInString.minExtraChar(s, dictionary))
    }
}