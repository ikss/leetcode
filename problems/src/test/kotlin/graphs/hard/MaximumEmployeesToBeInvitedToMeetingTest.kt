package graphs.hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MaximumEmployeesToBeInvitedToMeetingTest {
    @Test
    fun test1() {
        val favorite = intArrayOf(2, 2, 1, 2)
        val expected = 3

        assertEquals(expected, MaximumEmployeesToBeInvitedToMeeting.maximumInvitations(favorite))
    }

    @Test
    fun test2() {
        val favorite = intArrayOf(1, 2, 0)
        val expected = 3

        assertEquals(expected, MaximumEmployeesToBeInvitedToMeeting.maximumInvitations(favorite))
    }

    @Test
    fun test3() {
        val favorite = intArrayOf(3, 0, 1, 4, 1)
        val expected = 4

        assertEquals(expected, MaximumEmployeesToBeInvitedToMeeting.maximumInvitations(favorite))
    }
}