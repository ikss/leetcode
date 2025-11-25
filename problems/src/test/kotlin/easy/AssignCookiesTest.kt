package easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class AssignCookiesTest {
    @Test
    fun test1() {
        val g = intArrayOf(1, 2, 3)
        val c = intArrayOf(1, 1)
        val expected = 1

        assertEquals(expected, AssignCookies.findContentChildren(g, c))
    }

    @Test
    fun test2() {
        val g = intArrayOf(1, 2)
        val c = intArrayOf(1, 2, 3)
        val expected = 2

        assertEquals(expected, AssignCookies.findContentChildren(g, c))
    }
}