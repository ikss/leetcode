package arrays.medium

import java.util.*

/**
 * You have n jobs and m workers. You are given three arrays: difficulty, profit, and worker where:
 * * `difficulty[i]` and `profit[i]` are the difficulty and the profit of the ith job, and
 * * `worker[j]` is the ability of jth worker (i.e., the jth worker can only complete a job with difficulty
 * at most `worker[j]`).
 * 
 * Every worker can be assigned at most one job, but one job can be completed multiple times.
 *
 * For example, if three workers attempt the same job that pays $1, then the total profit will be $3.
 * If a worker cannot complete any job, their profit is $0.
 * Return the maximum profit we can achieve after assigning the workers to the jobs.
 *
 * [URL](https://leetcode.com/problems/most-profit-assigning-work/)
 */
object MostProfitAssigningWork {
    fun maxProfitAssignment(difficulty: IntArray, profit: IntArray, worker: IntArray): Int {
        val map = TreeMap<Int, Int>()

        for (i in difficulty.indices) {
            val diff = difficulty[i]
            val prof = profit[i]
            // check if we have a better profit for the same or lower difficulty
            var existing = map.floorEntry(diff)
            if (existing != null && existing.value > prof) continue

            // remove all the entries with lower profit for the same or higher difficulty
            existing = map.ceilingEntry(diff)
            while (existing != null && existing.value < prof) {
                map.remove(existing.key)
                existing = map.ceilingEntry(diff)
            }
            map[diff] = prof
        }

        var result = 0

        // for each worker, find the maximum profit for the difficulty he can handle
        for (w in worker) {
            result += map.floorEntry(w)?.value ?: 0
        }
        return result
    }
}