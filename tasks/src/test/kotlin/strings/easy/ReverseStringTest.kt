package strings.easy

import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class ReverseStringTest {

    @Test
    fun test1() {
        val s = "USA".toCharArray()
        val expected = "ASU".toCharArray()
        ReverseString.reverseString(s)
        assertTrue(expected.contentEquals(s))
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

    @Test
    fun test4() {
        val s = "".toCharArray()
        val expected = "".toCharArray()
        ReverseString.reverseString(s)
        assertTrue(expected.contentEquals(s))
    }
}
