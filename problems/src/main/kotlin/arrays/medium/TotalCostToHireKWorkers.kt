package arrays.medium

import java.util.*

/**
 * You are given a 0-indexed integer array costs where `costs[i]` is the cost of hiring the ith worker.
 *
 * You are also given two integers k and candidates. We want to hire exactly k workers according to the following rules:
 * * You will run k sessions and hire exactly one worker in each session.
 * * In each hiring session, choose the worker with the lowest cost from either the first candidates workers or the last
 * candidates workers. Break the tie by the smallest index.
 * * * For example, if `costs = [3,2,7,7,1,2]` and candidates = 2, then in the first hiring session, we will choose the
 * 4th worker because they have the lowest cost `[3,2,7,7,1,2]`.
 * * * In the second hiring session, we will choose 1st worker because they have the same lowest cost as 4th worker but
 * they have the smallest index `[3,2,7,7,2]`. Please note that the indexing may be changed in the process.
 * * If there are fewer than candidates workers remaining, choose the worker with the lowest cost among them.
 * Break the tie by the smallest index.
 * * A worker can only be chosen once.
 *
 * Return the total cost to hire exactly k workers.
 *
 * [URL](https://leetcode.com/problems/total-cost-to-hire-k-workers/)
 */
object TotalCostToHireKWorkers {
    fun totalCost(costs: IntArray, k: Int, candidates: Int): Long {
        val n = costs.size
        val pq = PriorityQueue<Pair<Int, Int>> { a, b ->
            if (a.first == b.first) {
                a.second - b.second
            } else {
                a.first - b.first
            }
        }

        for (i in 0 until candidates) {
            pq.offer(costs[i] to 0)
        }
        for (i in maxOf(candidates, n - candidates) until n) {
            pq.offer(costs[i] to 1)
        }

        var result = 0L
        var nextHead = candidates
        var nextTail = n - candidates - 1

        for (i in 0 until k) {
            val (cost, section) = pq.poll()!!
            result += cost
            if (nextHead > nextTail) continue

            if (section == 0) {
                pq.offer(costs[nextHead++] to 0)
            } else {
                pq.offer(costs[nextTail--] to 1)
            }
        }

        return result
    }
}
