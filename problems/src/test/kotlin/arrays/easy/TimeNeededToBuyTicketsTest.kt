package arrays.easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class TimeNeededToBuyTicketsTest {
    @Test
    fun test1simulation() {
        val days = intArrayOf(2, 3, 2)
        val k = 2
        val expected = 6

        assertEquals(expected, TimeNeededToBuyTickets.timeRequiredToBuySimulation(days, k))
    }

    @Test
    fun test2simulation() {
        val days = intArrayOf(5, 1, 1, 1)
        val k = 0
        val expected = 8

        assertEquals(expected, TimeNeededToBuyTickets.timeRequiredToBuySimulation(days, k))
    }

    @Test
    fun test1singlePass() {
        val days = intArrayOf(2, 3, 2)
        val k = 2
        val expected = 6

        assertEquals(expected, TimeNeededToBuyTickets.timeRequiredToBuySinglePass(days, k))
    }

    @Test
    fun test2singlePass() {
        val days = intArrayOf(5, 1, 1, 1)
        val k = 0
        val expected = 8

        assertEquals(expected, TimeNeededToBuyTickets.timeRequiredToBuySinglePass(days, k))
    }
}