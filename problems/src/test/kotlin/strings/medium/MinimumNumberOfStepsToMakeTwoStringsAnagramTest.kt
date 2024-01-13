package strings.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MinimumNumberOfStepsToMakeTwoStringsAnagramTest {
    @Test
    fun test1() {
        val s = "bab"
        val t = "aba"
        val expected = 1

        assertEquals(expected, MinimumNumberOfStepsToMakeTwoStringsAnagram.minSteps(s, t))
    }

    @Test
    fun test2() {
        val s = "leetcode"
        val t = "practice"
        val expected = 5

        assertEquals(expected, MinimumNumberOfStepsToMakeTwoStringsAnagram.minSteps(s, t))
    }

    @Test
    fun test3() {
        val s = "anagram"
        val t = "mangaar"
        val expected = 0

        assertEquals(expected, MinimumNumberOfStepsToMakeTwoStringsAnagram.minSteps(s, t))
    }
}