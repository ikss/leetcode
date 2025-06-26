package arrays.hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class KEmptySlotsTest {
    @Test
    fun test1() {
        val bulbs = intArrayOf(1, 3, 2)
        val k = 1
        val expected = 2

        assertEquals(expected, KEmptySlots.kEmptySlots(bulbs, k))
    }

    @Test
    fun test2() {
        val bulbs = intArrayOf(1, 2, 3)
        val k = 1
        val expected = -1

        assertEquals(expected, KEmptySlots.kEmptySlots(bulbs, k))
    }
}