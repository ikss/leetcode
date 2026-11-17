package hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MinimumChangesToMakeKSemiPalindromesTest {
    @Test
    fun test1() {
        val s = "abcac"
        val k = 2
        val expected = 1

        assertEquals(expected, MinimumChangesToMakeKSemiPalindromes.minimumChanges(s, k))
    }

    @Test
    fun test2() {
        val s = "abcdef"
        val k = 2
        val expected = 2

        assertEquals(expected, MinimumChangesToMakeKSemiPalindromes.minimumChanges(s, k))
    }

    @Test
    fun test3() {
        val s = "aabbaa"
        val k = 3
        val expected = 0

        assertEquals(expected, MinimumChangesToMakeKSemiPalindromes.minimumChanges(s, k))
    }

}