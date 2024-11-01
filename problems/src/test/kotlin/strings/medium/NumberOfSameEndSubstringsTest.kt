package strings.medium

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class NumberOfSameEndSubstringsTest {
    @Test
    fun test1() {
        val s = "abcaab"
        val queries = arrayOf(
            intArrayOf(0, 0),
            intArrayOf(1, 4),
            intArrayOf(2, 5),
            intArrayOf(0, 5),
        )
        val expected = intArrayOf(1, 5, 5, 10)

        assertArrayEquals(expected, NumberOfSameEndSubstrings.sameEndSubstringCount(s, queries))
    }

    @Test
    fun test2() {
        val s = "abcd"
        val queries = arrayOf(
            intArrayOf(0, 3),
        )
        val expected = intArrayOf(4)

        assertArrayEquals(expected, NumberOfSameEndSubstrings.sameEndSubstringCount(s, queries))
    }
}