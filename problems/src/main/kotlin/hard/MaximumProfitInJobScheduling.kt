package hard

import java.util.*

/**
 * We have n jobs, where every job is scheduled to be done from `startTime[i]` to `endTime[i]`,
 * obtaining a profit of `profit[i]`.
 *
 * You're given the startTime, endTime and profit arrays, return the maximum profit you can take such that there are no
 * two jobs in the subset with overlapping time range.
 *
 * If you choose a job that ends at time X you will be able to start another job that starts at time X.
 *
 * [URL](https://leetcode.com/problems/maximum-profit-in-job-scheduling/)
 */
object MaximumProfitInJobScheduling {
    fun jobScheduling(startTime: IntArray, endTime: IntArray, profit: IntArray): Int {
        val n = startTime.size
        val jobs = Array(n) { intArrayOf(startTime[it], endTime[it], profit[it]) }
        jobs.sortBy { it[1] }

        val dp = TreeMap<Int, Int>()
        dp[0] = 0

        for ((start, end, jobProfit) in jobs) {
            val cur = dp.floorEntry(start).value + jobProfit
            if (cur > dp.lastEntry().value) {
                dp[end] = cur
            }
        }
        return dp.lastEntry().value
    }
}
