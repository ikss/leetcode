package hard

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class LongestSubstringOfOneRepeatingCharacterTest {
    @Test
    fun test1() {
        val s = "babacc"
        val queryCharacters = "bcb"
        val queryIndices = intArrayOf(1, 3, 3)
        val expected = intArrayOf(3, 3, 4)

        val actual = LongestSubstringOfOneRepeatingCharacter.longestRepeating(s, queryCharacters, queryIndices)
        assertArrayEquals(expected, actual)
    }

    @Test
    fun test2() {
        val s = "abyzz"
        val queryCharacters = "aa"
        val queryIndices = intArrayOf(2, 1)
        val expected = intArrayOf(2, 3)

        val actual = LongestSubstringOfOneRepeatingCharacter.longestRepeating(s, queryCharacters, queryIndices)
        assertArrayEquals(expected, actual)
    }
}