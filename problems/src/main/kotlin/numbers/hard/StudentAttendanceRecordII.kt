package numbers.hard

/**
 * An attendance record for a student can be represented as a string where each character signifies whether the student was absent, late, or present on that day. The record only contains the following three characters:
 * * 'A': Absent.
 * * 'L': Late.
 * * 'P': Present.
 *
 * Any student is eligible for an attendance award if they meet both of the following criteria:
 *
 * The student was absent ('A') for strictly fewer than 2 days total.
 * The student was never late ('L') for 3 or more consecutive days.
 * Given an integer n, return the number of possible attendance records of length n that make a student
 * eligible for an attendance award. The answer may be very large, so return it modulo 10^9 + 7.
 *
 * [URL](https://leetcode.com/problems/student-attendance-record-ii/)
 */
object StudentAttendanceRecordII {
    private val MOD = 1_000_000_007

    // 0 - 0A0L, 1 - 0A1L, 2 - 0A2L, 3 - 1A0L, 4 - 1A1L, 4 - 1A2L
    fun checkRecord(n: Int): Int {
        var state = longArrayOf(1L, 1L, 0L, 1L, 0L, 0L)

        for (i in 1 until n) {
            val newState = LongArray(6)
            var lval = state[0] + state[1] + state[2]
            newState[0] = lval % MOD

            lval += state[3] + state[4] + state[5]
            newState[3] = lval % MOD

            newState[1] = state[0]

            newState[2] = state[1]

            newState[4] = state[3]

            newState[5] = state[4]

            state = newState
        }

        return state.sum().bound()
    }

    private fun Long.bound(): Int = (this % MOD).toInt()
}