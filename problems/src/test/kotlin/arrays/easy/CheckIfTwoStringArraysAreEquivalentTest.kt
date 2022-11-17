package arrays.easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CheckIfTwoStringArraysAreEquivalentTest {
    @Test
    fun test1indices() {
        val word1 = arrayOf("ab", "c")
        val word2 = arrayOf("a", "bc")
        val expected = true

        assertEquals(expected, CheckIfTwoStringArraysAreEquivalent.arrayStringsAreEqualIndices(word1, word2))
    }

    @Test
    fun test2indices() {
        val word1 = arrayOf("a", "cb")
        val word2 = arrayOf("a", "bc")
        val expected = false

        assertEquals(expected, CheckIfTwoStringArraysAreEquivalent.arrayStringsAreEqualIndices(word1, word2))
    }

    @Test
    fun test3indices() {
        val word1 = arrayOf("abc", "d", "defg")
        val word2 = arrayOf("abcddefg")
        val expected = true

        assertEquals(expected, CheckIfTwoStringArraysAreEquivalent.arrayStringsAreEqualIndices(word1, word2))
    }

    @Test
    fun test1join() {
        val word1 = arrayOf("ab", "c")
        val word2 = arrayOf("a", "bc")
        val expected = true

        assertEquals(expected, CheckIfTwoStringArraysAreEquivalent.arrayStringsAreEqualJoin(word1, word2))
    }

    @Test
    fun test2join() {
        val word1 = arrayOf("a", "cb")
        val word2 = arrayOf("a", "bc")
        val expected = false

        assertEquals(expected, CheckIfTwoStringArraysAreEquivalent.arrayStringsAreEqualJoin(word1, word2))
    }

    @Test
    fun test3join() {
        val word1 = arrayOf("abc", "d", "defg")
        val word2 = arrayOf("abcddefg")
        val expected = true

        assertEquals(expected, CheckIfTwoStringArraysAreEquivalent.arrayStringsAreEqualJoin(word1, word2))
    }
}