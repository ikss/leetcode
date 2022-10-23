package strings.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class DeleteOperationOfTwoStringsTest {

    @Test
    fun test1Dp() {
        val word1 = "sea"
        val word2 = "eat"
        val expected = 2

        assertEquals(expected, DeleteOperationOfTwoStrings.minDistanceDp(word1, word2))
    }

    @Test
    fun test2Dp() {
        val word1 = "sea"
        val word2 = "eat"
        val expected = 2

        assertEquals(expected, DeleteOperationOfTwoStrings.minDistanceDp(word1, word2))
    }

    @Test
    fun test3Dp() {
        val word1 = "a"
        val word2 = "b"
        val expected = 2

        assertEquals(expected, DeleteOperationOfTwoStrings.minDistanceDp(word1, word2))
    }

    @Test
    fun test1Dp1D() {
        val word1 = "sea"
        val word2 = "eat"
        val expected = 2

        assertEquals(expected, DeleteOperationOfTwoStrings.minDistanceDp1D(word1, word2))
    }

    @Test
    fun test2Dp1D() {
        val word1 = "sea"
        val word2 = "eat"
        val expected = 2

        assertEquals(expected, DeleteOperationOfTwoStrings.minDistanceDp1D(word1, word2))
    }

    @Test
    fun test3Dp1D() {
        val word1 = "a"
        val word2 = "b"
        val expected = 2

        assertEquals(expected, DeleteOperationOfTwoStrings.minDistanceDp1D(word1, word2))
    }
}
