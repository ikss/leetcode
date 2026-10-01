package hard

/**
 * A train line going through a city has two routes, the regular route and the express route.
 * Both routes go through the same n + 1 stops labeled from 0 to n. Initially, you start on the regular route at stop 0.
 *
 * You are given two 1-indexed integer arrays regular and express, both of length n. `regular[i]` describes the cost it
 * takes to go from stop i - 1 to stop i using the regular route, and `express[i]` describes the cost it takes to go
 * from stop i - 1 to stop i using the express route.
 *
 * You are also given an integer expressCost which represents the cost to transfer from the regular route to the
 * express route.
 *
 * Note that:
 * * There is no cost to transfer from the express route back to the regular route.
 * * You pay expressCost every time you transfer from the regular route to the express route.
 * * There is no extra cost to stay on the express route.
 *
 * Return a 1-indexed array costs of length n, where `costs[i]` is the minimum cost to reach stop i from stop 0.
 *
 * Note that a stop can be counted as reached from either route.
 *
 * [URL](https://leetcode.com/problems/minimum-costs-using-the-train-line/)
 */
object MinimumCostsUsingTheTrainLine {
    fun minimumCosts(regular: IntArray, express: IntArray, expressCost: Int): LongArray {
        val n = regular.size
        // 0 - for being on regular lane
        // 1 - for being on express lane
        val dp = Array(2) { LongArray(n) { Long.MAX_VALUE } }
        dp[1][0] = (expressCost + express[0]).toLong()
        dp[0][0] = minOf(dp[1][0], regular[0].toLong())

        for (i in 1 until n) {
            dp[1][i] = minOf(
                // jumping to express
                dp[0][i - 1] + expressCost + express[i],
                // staying on express
                dp[1][i - 1] + express[i],
            )

            dp[0][i] = minOf(
                // moving by regular
                dp[1][i],
                // staying on regular
                dp[0][i - 1] + regular[i],
            )
        }

        return dp[0]
    }
}
