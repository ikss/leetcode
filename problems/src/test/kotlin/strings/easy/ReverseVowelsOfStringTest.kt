package strings.easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class ReverseVowelsOfStringTest {

    @Test
    fun test1() {
        val s = "hello"
        val expected = "holle"

        assertEquals(expected, ReverseVowelsOfString.reverseVowels(s))
    }

    @Test
    fun test2() {
        val s = "FLaG".toCharArray()
        val expected = "GaLF".toCharArray()
        ReverseString.reverseString(s)

        assertTrue(expected.contentEquals(s))
    }

    @Test
    fun test3() {
        val s = "A".toCharArray()
        val expected = "A".toCharArray()
        ReverseString.reverseString(s)

        assertTrue(expected.contentEquals(s))
    }
}