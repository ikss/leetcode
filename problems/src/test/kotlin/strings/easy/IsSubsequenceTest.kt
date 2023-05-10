package strings.easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class IsSubsequenceTest {

    @Test
    fun test1() {
        val s = "abc"
        val t = "ahbgdc"
        val expected = true

        assertEquals(expected, IsSubsequence.isSubsequence(s, t))
    }

    @Test
    fun test2() {
        val s = "axc"
        val t = "ahbgdc"
        val expected = false

        assertEquals(expected, IsSubsequence.isSubsequence(s, t))
    }

    @Test
    fun test3() {
        val s = ""
        val t = "title"
        val expected = true

        assertEquals(expected, IsSubsequence.isSubsequence(s, t))
    }
}