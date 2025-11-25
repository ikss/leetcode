package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MinimumLengthOfAnagramConcatenationTest {
    @Test
    fun test1() {
        val s = "abba"
        val expected = 2

        assertEquals(expected, MinimumLengthOfAnagramConcatenation.minAnagramLength(s))
    }

    @Test
    fun test2() {
        val s = "cdef"
        val expected = 4

        assertEquals(expected, MinimumLengthOfAnagramConcatenation.minAnagramLength(s))
    }

    @Test
    fun test3() {
        val s = "aabb"
        val expected = 4

        assertEquals(expected, MinimumLengthOfAnagramConcatenation.minAnagramLength(s))
    }
}