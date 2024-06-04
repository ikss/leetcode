package arrays.easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MeetingRoomsTest {
    @Test
    fun test1() {
        val meetings = arrayOf(
            intArrayOf(0, 30),
            intArrayOf(5, 10),
            intArrayOf(15, 20),
        )
        val expected = false

        assertEquals(expected, MeetingRooms.canAttendMeetings(meetings))
    }

    @Test
    fun test2() {
        val meetings = arrayOf(
            intArrayOf(7, 10),
            intArrayOf(2, 4),
        )
        val expected = true

        assertEquals(expected, MeetingRooms.canAttendMeetings(meetings))
    }
}