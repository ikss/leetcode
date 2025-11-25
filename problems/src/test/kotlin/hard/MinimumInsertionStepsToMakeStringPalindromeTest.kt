package hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MinimumInsertionStepsToMakeStringPalindromeTest {

    @Test
    fun test1() {
        val s = "zzazz"
        val expected = 0

        assertEquals(expected, MinimumInsertionStepsToMakeStringPalindrome.minInsertions(s))
    }

    @Test
    fun test2() {
        val s = "mbadm"
        val expected = 2

        assertEquals(expected, MinimumInsertionStepsToMakeStringPalindrome.minInsertions(s))
    }

    @Test
    fun test3() {
        val s = "leetcode"
        val expected = 5

        assertEquals(expected, MinimumInsertionStepsToMakeStringPalindrome.minInsertions(s))
    }
}