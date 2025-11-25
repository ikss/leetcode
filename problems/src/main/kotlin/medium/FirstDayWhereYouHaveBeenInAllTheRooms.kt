package medium

/**
 * There are n rooms you need to visit, labeled from 0 to n - 1. Each day is labeled, starting from 0. You will go in
 * and visit one room a day.
 *
 * Initially on day 0, you visit room 0. The order you visit the rooms for the coming days is determined by the
 * following rules and a given 0-indexed array nextVisit of length n:
 *
 * Assuming that on a day, you visit room i,
 * if you have been in room i an odd number of times (including the current visit), on the next day you will visit a
 * room with a lower or equal room number specified by `nextVisit[i]` where `0 <= nextVisit[i] <= i`;
 * if you have been in room i an even number of times (including the current visit), on the next day you will visit
 * room (i + 1) mod n.
 * Return the label of the first day where you have been in all the rooms. It can be shown that such a day exists.
 * Since the answer may be very large, return it modulo 10^9 + 7.
 *
 * [URL](https://leetcode.com/problems/first-day-where-you-have-been-in-all-the-rooms/)
 */
object FirstDayWhereYouHaveBeenInAllTheRooms {
    private const val mod = 1_000_000_007

    fun firstDayBeenInAllRooms(nextVisit: IntArray): Int {
        val n = nextVisit.size
        val dp = IntArray(n + 1)

        for (i in 1 until n) {
            val value = (2L + 2 * dp[i - 1] - dp[nextVisit[i - 1]] + mod) % mod
            dp[i] = value.toInt()
        }
        return dp[n - 1]
    }
}
