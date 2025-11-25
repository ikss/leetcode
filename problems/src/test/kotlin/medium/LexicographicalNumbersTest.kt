package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class LexicographicalNumbersTest {
    @Test
    fun test1Iterative() {
        val n = 13
        val expected = listOf(1, 10, 11, 12, 13, 2, 3, 4, 5, 6, 7, 8, 9)

        assertEquals(expected, LexicographicalNumbers.lexicalOrderIterative(n))
    }

    @Test
    fun test2Iterative() {
        val n = 2
        val expected = listOf(1, 2)

        assertEquals(expected, LexicographicalNumbers.lexicalOrderIterative(n))
    }

    @Test
    fun test1Recursive() {
        val n = 13
        val expected = listOf(1, 10, 11, 12, 13, 2, 3, 4, 5, 6, 7, 8, 9)

        assertEquals(expected, LexicographicalNumbers.lexicalOrderRecursive(n))
    }

    @Test
    fun test2Recursive() {
        val n = 2
        val expected = listOf(1, 2)

        assertEquals(expected, LexicographicalNumbers.lexicalOrderRecursive(n))
    }
}