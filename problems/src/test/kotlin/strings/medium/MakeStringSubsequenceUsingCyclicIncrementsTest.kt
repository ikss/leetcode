package strings.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MakeStringSubsequenceUsingCyclicIncrementsTest {
    @Test
    fun test1() {
        val str1 = "abc"
        val str2 = "ad"
        val expected = true

        assertEquals(expected, MakeStringSubsequenceUsingCyclicIncrements.canMakeSubsequence(str1, str2))
    }

    @Test
    fun test2() {
        val str1 = "zc"
        val str2 = "ad"
        val expected = true

        assertEquals(expected, MakeStringSubsequenceUsingCyclicIncrements.canMakeSubsequence(str1, str2))
    }

    @Test
    fun test3() {
        val str1 = "ab"
        val str2 = "d"
        val expected = false

        assertEquals(expected, MakeStringSubsequenceUsingCyclicIncrements.canMakeSubsequence(str1, str2))
    }

}