package strings.easy

import org.junit.jupiter.api.Test
import kotlin.test.assertTrue

class ReverseStringTest {

    @Test
    fun test1() {
        val s = "USA".toCharArray()
        val excepted = "ASU".toCharArray()
        ReverseString.reverseString(s)
        assertTrue(excepted.contentEquals(s))
    }

    @Test
    fun test2() {
        val s = "FLaG".toCharArray()
        val excepted = "GaLF".toCharArray()
        ReverseString.reverseString(s)
        assertTrue(excepted.contentEquals(s))
    }

    @Test
    fun test3() {
        val s = "A".toCharArray()
        val excepted = "A".toCharArray()
        ReverseString.reverseString(s)
        assertTrue(excepted.contentEquals(s))
    }

    @Test
    fun test4() {
        val s = "".toCharArray()
        val excepted = "".toCharArray()
        ReverseString.reverseString(s)
        assertTrue(excepted.contentEquals(s))
    }
}
