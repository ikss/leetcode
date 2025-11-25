package hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MeetingRoomsIIITest {
    @Test
    fun test1() {
        val n = 2
        val meetings = arrayOf(
            intArrayOf(0, 10),
            intArrayOf(1, 5),
            intArrayOf(2, 7),
            intArrayOf(3, 4),
        )

        val expected = 0

        assertEquals(expected, MeetingRoomsIII.mostBooked(n, meetings))
    }

    @Test
    fun test2() {
        val n = 3
        val meetings = arrayOf(
            intArrayOf(1, 20),
            intArrayOf(2, 10),
            intArrayOf(3, 5),
            intArrayOf(4, 9),
            intArrayOf(6, 8),
        )
        val expected = 1

        assertEquals(expected, MeetingRoomsIII.mostBooked(n, meetings))
    }
}