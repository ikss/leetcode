package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MeetingRoomsIITest {
    @Test
    fun test1() {
        val meetings = arrayOf(
            intArrayOf(0, 30),
            intArrayOf(5, 10),
            intArrayOf(15, 20),
        )
        val expected = 2

        assertEquals(expected, MeetingRoomsII.minMeetingRooms(meetings))
    }

    @Test
    fun test2() {
        val meetings = arrayOf(
            intArrayOf(7, 10),
            intArrayOf(2, 4),
        )
        val expected = 1

        assertEquals(expected, MeetingRoomsII.minMeetingRooms(meetings))
    }
}