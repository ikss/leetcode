package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SplitStringIntoTheMaxNumberOfUniqueSubstringsTest {
    @Test
    fun test1() {
        val s = "ababccc"
        val expected = 5

        assertEquals(expected, SplitStringIntoTheMaxNumberOfUniqueSubstrings.maxUniqueSplit(s))
    }

    @Test
    fun test2() {
        val s = "aba"
        val expected = 2

        assertEquals(expected, SplitStringIntoTheMaxNumberOfUniqueSubstrings.maxUniqueSplit(s))
    }

    @Test
    fun test3() {
        val s = "wwwzfvedwfvhsww"
        val expected = 11

        assertEquals(expected, SplitStringIntoTheMaxNumberOfUniqueSubstrings.maxUniqueSplit(s))
    }
}