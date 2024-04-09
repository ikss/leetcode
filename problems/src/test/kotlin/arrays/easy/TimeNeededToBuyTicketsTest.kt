package arrays.easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class TimeNeededToBuyTicketsTest {
    @Test
    fun test1() {
        val days = intArrayOf(2, 3, 2)
        val k = 2
        val expected = 6

        assertEquals(expected, TimeNeededToBuyTickets.timeRequiredToBuy(days, k))
    }

    @Test
    fun test2() {
        val days = intArrayOf(5, 1, 1, 1)
        val k = 0
        val expected = 8

        assertEquals(expected, TimeNeededToBuyTickets.timeRequiredToBuy(days, k))
    }
}