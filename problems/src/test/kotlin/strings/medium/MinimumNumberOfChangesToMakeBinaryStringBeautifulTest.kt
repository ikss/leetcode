package strings.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MinimumNumberOfChangesToMakeBinaryStringBeautifulTest {
    @Test
    fun test1() {
        val s = "1001"
        val expected = 2

        assertEquals(expected, MinimumNumberOfChangesToMakeBinaryStringBeautiful.minChanges(s))
    }

    @Test
    fun test2() {
        val s = "10"
        val expected = 1

        assertEquals(expected, MinimumNumberOfChangesToMakeBinaryStringBeautiful.minChanges(s))
    }

    @Test
    fun test3() {
        val s = "0000"
        val expected = 0

        assertEquals(expected, MinimumNumberOfChangesToMakeBinaryStringBeautiful.minChanges(s))
    }

    @Test
    fun test4() {
        val s = "111111111110010001"
        val expected = 3

        assertEquals(expected, MinimumNumberOfChangesToMakeBinaryStringBeautiful.minChanges(s))
    }
}