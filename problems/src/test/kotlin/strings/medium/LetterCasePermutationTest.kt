package strings.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class LetterCasePermutationTest {
    @Test
    fun test1() {
        val s = "a1b2"
        val expected = listOf("a1b2", "a1B2", "A1b2", "A1B2")

        assertEquals(expected, LetterCasePermutation.letterCasePermutation(s))
    }

    @Test
    fun test2() {
        val s = "3z4"
        val expected = listOf("3z4", "3Z4")

        assertEquals(expected, LetterCasePermutation.letterCasePermutation(s))
    }
}
