package easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class DeleteCharactersToMakeFancyStringTest {
    @Test
    fun test1() {
        val s = "leeetcode"
        val expected = "leetcode"

        assertEquals(expected, DeleteCharactersToMakeFancyString.makeFancyString(s))
    }

    @Test
    fun test2() {
        val s = "aaabaaaa"
        val expected = "aabaa"

        assertEquals(expected, DeleteCharactersToMakeFancyString.makeFancyString(s))
    }

    @Test
    fun test3() {
        val s = "aab"
        val expected = "aab"

        assertEquals(expected, DeleteCharactersToMakeFancyString.makeFancyString(s))
    }

    @Test
    fun test1Count() {
        val s = "leeetcode"
        val expected = "leetcode"

        assertEquals(expected, DeleteCharactersToMakeFancyString.makeFancyStringCount(s))
    }

    @Test
    fun test2Count() {
        val s = "aaabaaaa"
        val expected = "aabaa"

        assertEquals(expected, DeleteCharactersToMakeFancyString.makeFancyStringCount(s))
    }

    @Test
    fun test3Count() {
        val s = "aab"
        val expected = "aab"

        assertEquals(expected, DeleteCharactersToMakeFancyString.makeFancyStringCount(s))
    }
}