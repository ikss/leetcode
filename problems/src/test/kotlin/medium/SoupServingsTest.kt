package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SoupServingsTest {
    @Test
    fun test1() {
        val n = 50
        val expected = 0.625

        assertEquals(expected, SoupServings.soupServings(n), 0.00001)
    }

    @Test
    fun test2() {
        val n = 100
        val expected = 0.71875

        assertEquals(expected, SoupServings.soupServings(n), 0.00001)
    }
}