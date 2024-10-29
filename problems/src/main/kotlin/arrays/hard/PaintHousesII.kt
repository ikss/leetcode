package arrays.hard

/**
 * There are a row of n houses, each house can be painted with one of the k colors. The cost of painting each house with
 * a certain color is different. You have to paint all the houses such that no two adjacent houses have the same color.
 *
 * The cost of painting each house with a certain color is represented by an n x k cost matrix costs.
 *
 * For example, costs[0][0] is the cost of painting house 0 with color 0; costs[1][2] is the cost of painting house 1
 * with color 2, and so on...
 * Return the minimum cost to paint all houses.
 *
 * [URL](https://leetcode.com/problems/paint-house-ii/)
 */
object PaintHousesII {
    fun minCostII(costs: Array<IntArray>): Int {
        val n = costs.size
        val k = costs[0].size

        val dp = Array(n) { IntArray(k) { Int.MAX_VALUE } }

        var minColor = Int.MAX_VALUE
        var secondMinColor = Int.MAX_VALUE
        
        for (i in 0 until k) {
            dp[0][i] = costs[0][i]
            if (dp[0][i] < minColor) {
                secondMinColor = minColor
                minColor = dp[0][i]
            } else if (dp[0][i] < secondMinColor) {
                secondMinColor = dp[0][i]
            }
        }

        for (house in 1 until n) {
            var curMinColor = Int.MAX_VALUE
            var secondCurMinColor = Int.MAX_VALUE
            for (paint in 0 until k) {
                if (dp[house - 1][paint] == minColor) {
                    dp[house][paint] = costs[house][paint] + secondMinColor
                } else {
                    dp[house][paint] = costs[house][paint] + minColor
                }
                if (dp[house][paint] < curMinColor) {
                    secondCurMinColor = curMinColor
                    curMinColor = dp[house][paint]
                } else if (dp[house][paint] < secondCurMinColor) {
                    secondCurMinColor = dp[house][paint]
                }
            }
            minColor = curMinColor
            secondMinColor = secondCurMinColor
        }
        var result = Int.MAX_VALUE
        for (paint in costs[0].indices) {
            result = minOf(result, dp[n - 1][paint])
        }

        return result
    }
}
