package hard

/**
 * You want to schedule a list of jobs in d days. Jobs are dependent
 * (i.e To work on the ith job, you have to finish all the jobs j where 0 <= j < i).
 *
 * You have to finish at least one task every day. The difficulty of a job schedule is the sum of difficulties
 * of each day of the d days. The difficulty of a day is the maximum difficulty of a job done on that day.
 *
 * You are given an integer array jobDifficulty and an integer d. The difficulty of the ith job is `jobDifficulty[i]`.
 *
 * Return the minimum difficulty of a job schedule. If you cannot find a schedule for the jobs return -1.
 *
 * [URL](https://leetcode.com/problems/minimum-difficulty-of-a-job-schedule/)
 */
object MinimumDifficultyOfJobSchedule {
    fun minDifficulty(jobDifficulty: IntArray, d: Int): Int {
        val n: Int = jobDifficulty.size
        if (n < d) return -1
        var dp = IntArray(n)

        dp[0] = jobDifficulty[0]
        for (j in 1 until n) {
            dp[j] = maxOf(jobDifficulty[j], dp[j - 1])
        }

        for (d in 1 until d) {
            val tmp = IntArray(n)
            for (len in d until n) {
                var localMax = jobDifficulty[len]
                tmp[len] = Int.MAX_VALUE
                for (schedule in len downTo d) {
                    localMax = maxOf(localMax, jobDifficulty[schedule])
                    tmp[len] = minOf(tmp[len], dp[schedule - 1] + localMax)
                }
            }
            dp = tmp
        }

        return dp[n - 1]
    }
}
