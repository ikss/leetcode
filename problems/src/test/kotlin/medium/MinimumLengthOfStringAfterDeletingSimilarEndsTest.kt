package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MinimumLengthOfStringAfterDeletingSimilarEndsTest {
    @Test
    fun test1() {
        val s = "ca"
        val expected = 2

        assertEquals(expected, MinimumLengthOfStringAfterDeletingSimilarEnds.minimumLength(s))
    }

    @Test
    fun test2() {
        val s = "cabaabac"
        val expected = 0

        assertEquals(expected, MinimumLengthOfStringAfterDeletingSimilarEnds.minimumLength(s))
    }

    @Test
    fun test3() {
        val s = "bbbbbbbbbbbbbbbbbbbbbbbbbbbabbbbbbbbbbbbbbbccbcbcbccbbabbb"
        val expected = 1

        assertEquals(expected, MinimumLengthOfStringAfterDeletingSimilarEnds.minimumLength(s))
    }

    @Test
    fun test4() {
        val s = "bbbbbbbbbbbbbbbbbbb"
        val expected = 0

        assertEquals(expected, MinimumLengthOfStringAfterDeletingSimilarEnds.minimumLength(s))
    }
}