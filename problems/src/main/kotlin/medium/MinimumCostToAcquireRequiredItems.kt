package medium

/**
 * You are given five integers cost1, cost2, costBoth, need1, and need2.
 *
 * There are three types of items available:
 * * An item of type 1 costs cost1 and contributes 1 unit to the type 1 requirement only.
 * * An item of type 2 costs cost2 and contributes 1 unit to the type 2 requirement only.
 * * An item of type 3 costs costBoth and contributes 1 unit to both type 1 and type 2 requirements.
 *
 * You must collect enough items so that the total contribution toward type 1 is at least need1
 * and the total contribution toward type 2 is at least need2.
 *
 * Return an integer representing the minimum possible total cost to achieve these requirements.
 *
 * [URL](https://leetcode.com/problems/minimum-cost-to-acquire-required-items/)
 */
object MinimumCostToAcquireRequiredItems {
    fun minimumCost(cost1: Int, cost2: Int, costBoth: Int, need1: Int, need2: Int): Long {
        val cost1 = cost1.toLong()
        val cost2 = cost2.toLong()
        val costBoth = costBoth.toLong()

        if (costBoth >= cost1 + cost2) {
            return cost1 * need1 + cost2 * need2
        }
        val min = minOf(need1, need2)

        val buyBoth = min * costBoth

        val buyFirst = minOf(cost1, costBoth) * (need1 - min)
        val buySecond = minOf(cost2, costBoth) * (need2 - min)

        return buyBoth + buyFirst + buySecond
    }
}
