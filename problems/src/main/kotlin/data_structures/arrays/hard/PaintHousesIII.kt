package data_structures.arrays.hard

/**
 * There is a row of m houses in a small city, each house must be painted with one of the n colors
 * (labeled from 1 to n), some houses that have been painted last summer should not be painted again.
 *
 * A neighborhood is a maximal group of continuous houses that are painted with the same color.
 *
 *  * For example: houses = `[1,2,2,3,3,2,1,1]` contains 5 neighborhoods `[{1}, {2,2}, {3,3}, {2}, {1,1}]`.
 *
 * Given an array houses, an m x n matrix cost and an integer target where:
 *
 *  * `houses[i]`: is the color of the house i, and 0 if the house is not painted yet.
 *  * `cost[i][j]`: is the cost of paint the house i with the color j + 1.
 *
 * Return the minimum cost of painting all the remaining houses in such a way that there are exactly
 * target neighborhoods. If it is not possible, return -1.
 *
 * [URL](https://leetcode.com/problems/paint-house-iii/)
 */
object PaintHousesIII {
    // Maximum cost possible plus 1
    const val MAX_COST = 1000001

    fun minCost(houses: IntArray, cost: Array<IntArray>, m: Int, n: Int, target: Int): Int {
        var prevMemo = Array(target + 1) { IntArray(n) { MAX_COST } }

        // Initialize for house 0, neighborhood will be 1
        for (color in 1..n) {
            if (houses[0] == color) {
                // If the house has same color, no cost
                prevMemo[1][color - 1] = 0
            } else if (houses[0] == 0) {
                // If the house is not painted, assign the corresponding cost
                prevMemo[1][color - 1] = cost[0][color - 1]
            }
        }
        for (house in 1 until m) {
            val memo = Array(target + 1) { IntArray(n) { MAX_COST } }

            for (neighborhoods in 1..minOf(target, house + 1)) {
                for (color in 1..n) {

                    // If the house is already painted, and color is different
                    if (houses[house] != 0 && color != houses[house]) {
                        // Cannot be painted with different color
                        continue
                    }
                    var currCost = MAX_COST
                    // Iterate over all the possible color for previous house
                    for (prevColor in 1..n) {
                        currCost = if (prevColor != color) {
                            // Decrement the neighborhood as adjacent houses has different color
                            minOf(currCost, prevMemo[neighborhoods - 1][prevColor - 1])
                        } else {
                            // Previous house has the same color, no change in neighborhood count
                            minOf(currCost, prevMemo[neighborhoods][color - 1])
                        }
                    }

                    // If the house is already painted cost to paint is 0
                    val costToPaint = if (houses[house] != 0) 0 else cost[house][color - 1]
                    memo[neighborhoods][color - 1] = currCost + costToPaint
                }
            }
            // Update the table to have the current house results
            prevMemo = memo
        }
        var minCost = MAX_COST
        // Find the minimum cost with m houses and target neighborhoods
        // By comparing cost for different color for the last house
        for (color in 1..n) {
            minCost = minOf(minCost, prevMemo[target][color - 1])
        }

        // Return -1 if the answer is MAX_COST as it implies no answer possible
        return if (minCost == MAX_COST) -1 else minCost
    }
}
