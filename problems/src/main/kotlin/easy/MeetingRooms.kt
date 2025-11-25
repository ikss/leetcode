package easy

/**
 * Given an array of meeting time intervals where `intervals[i] = [starti, endi]`,
 * determine if a person could attend all meetings.
 *
 * [URL](https://leetcode.com/problems/meeting-rooms/)
 */
object MeetingRooms {
    fun canAttendMeetings(intervals: Array<IntArray>): Boolean {
        intervals.sortBy { it[0] }
        for (i in 0 until intervals.size - 1) {
            if (intervals[i][1] > intervals[i + 1][0]) return false
        }
        return true
    }
}