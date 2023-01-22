package strings.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class PalindromePartitioningTest {

    @Test
    fun test1() {
        val s = "aab"
        val expected = mutableListOf(mutableListOf("a", "a", "b"), mutableListOf("aa", "b"))

        assertEquals(expected, PalindromePartitioning.partition(s))
    }

    @Test
    fun test2() {
        val s = "a"
        val expected = mutableListOf(mutableListOf("a"))

        assertEquals(expected, PalindromePartitioning.partition(s))
    }
}