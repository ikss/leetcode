package easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class IsomorphicStringsTest {

    @Test
    fun test1() {
        val s = "egg"
        val t = "add"
        val expected = true

        assertEquals(expected, IsomorphicStrings.isIsomorphic(s, t))
    }

    @Test
    fun test2() {
        val s = "foo"
        val t = "bar"
        val expected = false

        assertEquals(expected, IsomorphicStrings.isIsomorphic(s, t))
    }

    @Test
    fun test3() {
        val s = "paper"
        val t = "title"
        val expected = true

        assertEquals(expected, IsomorphicStrings.isIsomorphic(s, t))
    }
}