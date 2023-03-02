package strings.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class StringCompressionTest {

    @Test
    fun test1naive() {
        val chars = charArrayOf('a', 'a', 'b', 'b', 'c', 'c', 'c')
        val expectedResult = 6
        val expectedChars = charArrayOf('a', '2', 'b', '2', 'c', '3')

        assertEquals(expectedResult, StringCompression.compressNaive(chars))
        assertTrue(expectedChars.contentEquals(chars.take(expectedResult).toCharArray()))
    }

    @Test
    fun test2naive() {
        val chars = charArrayOf('a')
        val expectedResult = 1
        val expectedChars = charArrayOf('a')

        assertEquals(expectedResult, StringCompression.compressNaive(chars))
        assertTrue(expectedChars.contentEquals(chars.take(expectedResult).toCharArray()))
    }

    @Test
    fun test3naive() {
        val chars = charArrayOf('a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b')
        val expectedResult = 4
        val expectedChars = charArrayOf('a', 'b', '1', '2')

        assertEquals(expectedResult, StringCompression.compressNaive(chars))
        assertTrue(expectedChars.contentEquals(chars.take(expectedResult).toCharArray()))
    }

    @Test
    fun test1optimized() {
        val chars = charArrayOf('a', 'a', 'b', 'b', 'c', 'c', 'c')
        val expectedResult = 6
        val expectedChars = charArrayOf('a', '2', 'b', '2', 'c', '3')

        assertEquals(expectedResult, StringCompression.compressOptimized(chars))
        assertTrue(expectedChars.contentEquals(chars.take(expectedResult).toCharArray()))
    }

    @Test
    fun test2optimized() {
        val chars = charArrayOf('a')
        val expectedResult = 1
        val expectedChars = charArrayOf('a')

        assertEquals(expectedResult, StringCompression.compressOptimized(chars))
        assertTrue(expectedChars.contentEquals(chars.take(expectedResult).toCharArray()))
    }

    @Test
    fun test3optimized() {
        val chars = charArrayOf('a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b')
        val expectedResult = 4
        val expectedChars = charArrayOf('a', 'b', '1', '2')

        assertEquals(expectedResult, StringCompression.compressOptimized(chars))
        assertTrue(expectedChars.contentEquals(chars.take(expectedResult).toCharArray()))
    }
}