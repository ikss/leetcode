package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class LexicographicallySmallestStringAfterApplyingOperationsTest {
    @Test
    fun test1() {
        val s = "5525"
        val a = 9
        val b = 2
        val expected = "2050"

        assertEquals(expected, LexicographicallySmallestStringAfterApplyingOperations.findLexSmallestString(s, a, b))
    }

    @Test
    fun test2() {
        val s = "74"
        val a = 5
        val b = 1
        val expected = "24"

        assertEquals(expected, LexicographicallySmallestStringAfterApplyingOperations.findLexSmallestString(s, a, b))
    }

    @Test
    fun test3() {
        val s = "0011"
        val a = 4
        val b = 2
        val expected = "0011"

        assertEquals(expected, LexicographicallySmallestStringAfterApplyingOperations.findLexSmallestString(s, a, b))
    }
}