package medium

/**
 * You are given a positive integer days representing the total number of days an employee is available for work
 * (starting from day 1). You are also given a 2D array meetings of size n where, `meetings[i] = [start_i, end_i]`
 * represents the starting and ending days of meeting i (inclusive).
 *
 * Return the count of days when the employee is available for work but no meetings are scheduled.
 *
 * Note: The meetings may overlap.
 *
 * [URL](https://leetcode.com/problems/count-days-without-meetings/)
 */
object DaysWithoutMeetings {
    fun countDays(days: Int, meetings: Array<IntArray>): Int {
        meetings.sortBy { it[0] }

        var last = 0

        var result = 0

        for ((start, end) in meetings) {
            if (start > last) {
                result += start - last - 1
                last = end
            } else {
                last = maxOf(last, end)
            }
        }
        result += days - last

        return result
    }
}
