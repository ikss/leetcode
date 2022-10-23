package strings.easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class RemovePalindromicSubsequenceTest {

    @Test
    fun test1() {
        val s = "ababa"

        assertEquals(1, RemovePalindromicSubsequence.removePalindromeSub(s))
    }

    @Test
    fun test2() {
        val s = "abb"

        assertEquals(2, RemovePalindromicSubsequence.removePalindromeSub(s))
    }

    @Test
    fun test3() {
        val s = ""

        assertEquals(0, RemovePalindromicSubsequence.removePalindromeSub(s))
    }
}
