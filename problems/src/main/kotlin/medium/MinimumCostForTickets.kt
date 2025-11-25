package medium

/**
 * You have planned some train traveling one year in advance. The days of the year in which you will travel are given
 * as an integer array days. Each day is an integer from 1 to 365.
 *
 * Train tickets are sold in three different ways:
 * * a 1-day pass is sold for costs[0] dollars,
 * * a 7-day pass is sold for costs[1] dollars, and
 * * a 30-day pass is sold for costs[2] dollars.
 *
 * The passes allow that many days of consecutive travel.
 *
 * For example, if we get a 7-day pass on day 2, then we can travel for 7 days: 2, 3, 4, 5, 6, 7, and 8.
 * Return the minimum number of dollars you need to travel every day in the given list of days.
 *
 * [URL](https://leetcode.com/problems/minimum-cost-for-tickets/)
 */
object MinimumCostForTickets {
    fun mincostTickets(days: IntArray, costs: IntArray): Int {
        val lastDay = days[days.size - 1]
        val dayIncluded = BooleanArray(lastDay + 1)
        for (day in days) {
            dayIncluded[day] = true
        }
        val minCost = IntArray(lastDay + 1)
        minCost[0] = 0
        val (cost1, cost7, cost30) = costs
        for (day in 1..lastDay) {
            if (!dayIncluded[day]) {
                minCost[day] = minCost[day - 1]
                continue
            }
            var min = minCost[day - 1] + cost1
            min = minOf(min, minCost[maxOf(0, day - 7)] + cost7)
            min = minOf(min, minCost[maxOf(0, day - 30)] + cost30)
            minCost[day] = min
        }
        return minCost[lastDay]
    }
}
