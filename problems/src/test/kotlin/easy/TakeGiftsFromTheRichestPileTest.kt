package easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class TakeGiftsFromTheRichestPileTest {
    @Test
    fun test1() {
        val gifts = intArrayOf(25, 64, 9, 4, 100)
        val k = 4
        val expected = 29L

        assertEquals(expected, TakeGiftsFromTheRichestPile.pickGifts(gifts, k))
    }

    @Test
    fun test2() {
        val gifts = intArrayOf(1, 1, 1, 1)
        val k = 4
        val expected = 4L

        assertEquals(expected, TakeGiftsFromTheRichestPile.pickGifts(gifts, k))
    }
}