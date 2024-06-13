package arrays.easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MinimumNumberOfMovesToSeatEveryoneTest {
    @Test
    fun test1() {
        val seats = intArrayOf(3, 1, 5)
        val students = intArrayOf(2, 7, 4)
        val expected = 4

        assertEquals(expected, MinimumNumberOfMovesToSeatEveryone.minMovesToSeat(seats, students))
    }

    @Test
    fun test2() {
        val seats = intArrayOf(4, 1, 5, 9)
        val students = intArrayOf(1,3,2,6)
        val expected = 7

        assertEquals(expected, MinimumNumberOfMovesToSeatEveryone.minMovesToSeat(seats, students))
    }
}