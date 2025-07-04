package strings.easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FindTheOriginalTypedStringITest {
    @Test
    fun test1() {
        val word = "abbcccc"
        val expected = 5

        assertEquals(expected, FindTheOriginalTypedStringI.possibleStringCount(word))
    }

    @Test
    fun test2() {
        val word = "abcd"
        val expected = 1

        assertEquals(expected, FindTheOriginalTypedStringI.possibleStringCount(word))
    }

    @Test
    fun test3() {
        val word = "aaaa"
        val expected = 4

        assertEquals(expected, FindTheOriginalTypedStringI.possibleStringCount(word))
    }

    @Test
    fun test4() {
        val word = "ede"
        val expected = 1

        assertEquals(expected, FindTheOriginalTypedStringI.possibleStringCount(word))
    }
}