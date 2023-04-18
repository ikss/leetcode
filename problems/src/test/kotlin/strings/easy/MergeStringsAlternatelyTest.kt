package strings.easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MergeStringsAlternatelyTest {
    @Test
    fun test1() {
        val word1 = "abc"
        val word2 = "pqr"
        val expected = "apbqcr"

        assertEquals(expected, MergeStringsAlternately.mergeAlternately(word1, word2))
    }

    @Test
    fun test2() {
        val word1 = "ab"
        val word2 = "pqrs"
        val expected = "apbqrs"

        assertEquals(expected, MergeStringsAlternately.mergeAlternately(word1, word2))
    }

    @Test
    fun test3() {
        val word1 = "abcd"
        val word2 = "pq"
        val expected = "apbqcd"

        assertEquals(expected, MergeStringsAlternately.mergeAlternately(word1, word2))
    }

    @Test
    fun test4() {
        val word1 = "cf"
        val word2 = "eee"
        val expected = "cefee"

        assertEquals(expected, MergeStringsAlternately.mergeAlternately(word1, word2))
    }
}