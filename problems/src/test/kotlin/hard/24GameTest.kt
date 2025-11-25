package hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class `24GameTest` {
    @Test
    fun test1() {
        val cards = intArrayOf(4, 1, 8, 7)
        val expected = true

        assertEquals(expected, `24Game`.judgePoint24(cards))
    }

    @Test
    fun test2() {
        val cards = intArrayOf(1, 2, 1, 2)
        val expected = false

        assertEquals(expected, `24Game`.judgePoint24(cards))
    }

    @Test
    fun test3() {
        val cards = intArrayOf(1, 4, 6, 1)
        val expected = true

        assertEquals(expected, `24Game`.judgePoint24(cards))
    }

    @Test
    fun test4() {
        val cards = intArrayOf(1, 9, 9, 1)
        val expected = false

        assertEquals(expected, `24Game`.judgePoint24(cards))
    }

}