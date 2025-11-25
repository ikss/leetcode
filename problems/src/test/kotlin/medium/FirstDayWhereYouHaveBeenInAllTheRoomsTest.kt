package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FirstDayWhereYouHaveBeenInAllTheRoomsTest {

    @Test
    fun test1() {
        val nextVisit = intArrayOf(0, 0)
        val expected = 2

        assertEquals(expected, FirstDayWhereYouHaveBeenInAllTheRooms.firstDayBeenInAllRooms(nextVisit))
    }

    @Test
    fun test2() {
        val nextVisit = intArrayOf(0, 0, 2)
        val expected = 6

        assertEquals(expected, FirstDayWhereYouHaveBeenInAllTheRooms.firstDayBeenInAllRooms(nextVisit))
    }

    @Test
    fun test3() {
        val nextVisit = intArrayOf(0, 1, 2, 0)
        val expected = 6

        assertEquals(expected, FirstDayWhereYouHaveBeenInAllTheRooms.firstDayBeenInAllRooms(nextVisit))
    }
}