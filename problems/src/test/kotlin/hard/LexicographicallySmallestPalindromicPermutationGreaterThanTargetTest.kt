package hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class LexicographicallySmallestPalindromicPermutationGreaterThanTargetTest {
    @Test
    fun test1() {
        val s = "baba"
        val target = "abba"
        val expected = "baab"

        assertEquals(
            expected,
            LexicographicallySmallestPalindromicPermutationGreaterThanTarget.lexPalindromicPermutation(s, target)
        )
    }

    @Test
    fun test2() {
        val s = "baba"
        val target = "bbaa"
        val expected = ""

        assertEquals(
            expected,
            LexicographicallySmallestPalindromicPermutationGreaterThanTarget.lexPalindromicPermutation(s, target)
        )
    }

    @Test
    fun test3() {
        val s = "abc"
        val target = "abb"
        val expected = ""

        assertEquals(
            expected,
            LexicographicallySmallestPalindromicPermutationGreaterThanTarget.lexPalindromicPermutation(s, target)
        )
    }
}