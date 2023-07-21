package arrays.medium

/**
 * Given an m x n binary matrix mat, return the distance of the nearest 0 for each cell.
 *
 * The distance between two adjacent cells is 1.
 *
 * [URL](https://leetcode.com/problems/01-matrix/)
 */
object MaximumNumberOfEventsThatCanBeAttendedII {
    fun maxValue(events: Array<IntArray>, k: Int): Int {
        events.sortBy { it[0] }
        val n = events.size
        val dp = Array(k + 1) { IntArray(n) { -1 } }
        return dfs(0, 0, -1, events, k, dp)
    }

    private fun dfs(
        curIndex: Int,
        count: Int,
        prevEndingTime: Int,
        events: Array<IntArray>,
        k: Int,
        dp: Array<IntArray>,
    ): Int {
        if (curIndex == events.size || count == k) {
            return 0
        }
        if (prevEndingTime >= events[curIndex][0]) {
            return dfs(curIndex + 1, count, prevEndingTime, events, k, dp)
        }
        if (dp[count][curIndex] != -1) {
            return dp[count][curIndex]
        }
        val ans = maxOf(
            dfs(curIndex + 1, count, prevEndingTime, events, k, dp),
            dfs(curIndex + 1, count + 1, events[curIndex][1], events, k, dp) + events[curIndex][2]
        )
        dp[count][curIndex] = ans
        return ans
    }
}
