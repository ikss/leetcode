package strings.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ShortestWayToFormStringTest {
    @Test
    fun test1() {
        val source = "abc"
        val target = "abcbc"
        val expected = 2

        assertEquals(expected, ShortestWayToFormString.shortestWay(source, target))
    }

    @Test
    fun test2() {
        val source = "ab"
        val target = "bzaa"
        val expected = -1

        assertEquals(expected, ShortestWayToFormString.shortestWay(source, target))
    }

    @Test
    fun test3() {
        val source = "xyz"
        val target = "xzyxz"
        val expected = 3

        assertEquals(expected, ShortestWayToFormString.shortestWay(source, target))
    }
}