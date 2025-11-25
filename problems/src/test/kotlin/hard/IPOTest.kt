package hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class IPOTest {

    @Test
    fun test1() {
        val k = 2
        val w = 0
        val profits = intArrayOf(1, 2, 3)
        val capital = intArrayOf(0, 1, 1)
        val expected = 4

        assertEquals(expected, IPO.findMaximizedCapital(k, w, profits, capital))
    }

    @Test
    fun test2() {
        val k = 3
        val w = 0
        val profits = intArrayOf(1, 2, 3)
        val capital = intArrayOf(0, 1, 2)
        val expected = 6

        assertEquals(expected, IPO.findMaximizedCapital(k, w, profits, capital))
    }

    @Test
    fun test3() {
        val k = 10
        val w = 0
        val profits = intArrayOf(1, 2, 3)
        val capital = intArrayOf(0, 1, 2)
        val expected = 6

        assertEquals(expected, IPO.findMaximizedCapital(k, w, profits, capital))
    }

    @Test
    fun test4() {
        val k = 11
        val w = 11
        val profits = intArrayOf(1, 2, 3)
        val capital = intArrayOf(11, 12, 13)
        val expected = 17

        assertEquals(expected, IPO.findMaximizedCapital(k, w, profits, capital))
    }
}