package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class LexicographicallySmallestPermutationGreaterThanTargetTest {
    @Test
    fun test1() {
        val s = "abc"
        val target = "bba"
        val expected = "bca"

        assertEquals(expected, LexicographicallySmallestPermutationGreaterThanTarget.lexGreaterPermutation(s, target))
    }

    @Test
    fun test2() {
        val s = "leet"
        val target = "code"
        val expected = "eelt"

        assertEquals(expected, LexicographicallySmallestPermutationGreaterThanTarget.lexGreaterPermutation(s, target))
    }

    @Test
    fun test3() {
        val s = "baba"
        val target = "bbaa"
        val expected = ""

        assertEquals(expected, LexicographicallySmallestPermutationGreaterThanTarget.lexGreaterPermutation(s, target))
    }
}