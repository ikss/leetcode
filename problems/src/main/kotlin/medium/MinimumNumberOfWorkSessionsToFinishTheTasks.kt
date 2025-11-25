package medium

/**
 * There are n tasks assigned to you. The task times are represented as an integer array tasks of length n,
 * where the ith task takes `tasks[i]` hours to finish. A work session is when you work for at most sessionTime
 * consecutive hours and then take a break.
 *
 * You should finish the given tasks in a way that satisfies the following conditions:
 * * If you start a task in a work session, you must complete it in the same work session.
 * * You can start a new task immediately after finishing the previous one.
 * * You may complete the tasks in any order.
 *
 * Given tasks and sessionTime, return the minimum number of work sessions needed to finish all the tasks
 * following the conditions above.
 *
 * The tests are generated such that sessionTime is greater than or equal to the maximum element in `tasks[i]`.
 *
 * [URL](https://leetcode.com/problems/minimum-number-of-work-sessions-to-finish-the-tasks/)
 */
object MinimumNumberOfWorkSessionsToFinishTheTasks {
    fun minSessions(tasks: IntArray, sessionTime: Int): Int {
        val memo = Array(1 shl 14) { IntArray(16) { Int.MAX_VALUE } }
        return dp(tasks, 0, sessionTime, sessionTime, memo) + 1
    }

    fun dp(tasks: IntArray, mask: Int, sessionTime: Int, remainTime: Int, memo: Array<IntArray>): Int {
        if (mask == (1 shl tasks.size) - 1) return 0
        if (memo[mask][remainTime] != Int.MAX_VALUE) return memo[mask][remainTime]

        var result = tasks.size
        for (i in tasks.indices) {
            if ((mask shr i) and 1 == 0) {
                val newMask = (1 shl i) or mask
                result = if (tasks[i] <= remainTime) {
                    minOf(
                        result,
                        dp(tasks, newMask, sessionTime, remainTime - tasks[i], memo)
                    )
                } else {
                    minOf(
                        result,
                        dp(tasks, newMask, sessionTime, sessionTime - tasks[i], memo) + 1
                    )
                }
            }
        }

        return result.also { memo[mask][remainTime] = it }
    }
}
