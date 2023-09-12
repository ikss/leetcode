package arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MinimumDeletionsToMakeCharacterFrequenciesUniqueTest {
    @Test
    fun test1() {
        val s = "aab"
        val expected = 0

        assertEquals(expected, MinimumDeletionsToMakeCharacterFrequenciesUnique.minDeletions(s))
    }

    @Test
    fun test2() {
        val s = "aaabbbcc"
        val expected = 2

        assertEquals(expected, MinimumDeletionsToMakeCharacterFrequenciesUnique.minDeletions(s))
    }

    @Test
    fun test3() {
        val s = "ceabaacb"
        val expected = 2

        assertEquals(expected, MinimumDeletionsToMakeCharacterFrequenciesUnique.minDeletions(s))
    }

    @Test
    fun test4() {
        val s = "bbcebab"
        val expected = 2

        assertEquals(expected, MinimumDeletionsToMakeCharacterFrequenciesUnique.minDeletions(s))
    }
}