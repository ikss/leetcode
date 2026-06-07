package easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class RemovePalindromicSubsequencesTest {

    @Test
    fun test1() {
        val s = "ababa"

        assertEquals(1, RemovePalindromicSubsequences.removePalindromeSub(s))
    }

    @Test
    fun test2() {
        val s = "abb"

        assertEquals(2, RemovePalindromicSubsequences.removePalindromeSub(s))
    }

    @Test
    fun test3() {
        val s = ""

        assertEquals(0, RemovePalindromicSubsequences.removePalindromeSub(s))
    }
}
