package arrays.easy

/**
 * You are given an integer array cost where `cost[i]` is the cost of ith step on a staircase.
 * Once you pay the cost, you can either climb one or two steps.
 *
 * You can either start from the step with index 0, or the step with index 1.
 *
 * Return the minimum cost to reach the top of the floor.
 *
 * [URL](https://leetcode.com/problems/min-cost-climbing-stairs/)
 */
object MinCostClimbingStairs {

    fun minCostClimbingStairs(cost: IntArray): Int {
        var prevPrev = cost[0]
        var prev = cost[1]

        for (i in 2 until cost.size) {
            val curr = cost[i] + minOf(prev, prevPrev)
            prevPrev = prev
            prev = curr
        }
        return minOf(prev, prevPrev)
    }
}
