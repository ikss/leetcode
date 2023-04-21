package arrays.hard

/**
 * There is a group of n members, and a list of various crimes they could commit. The ith crime generates a `profit[i]`
 * and requires `group[i]` members to participate in it. If a member participates in one crime, that member can't
 * participate in another crime.
 *
 * Let's call a profitable scheme any subset of these crimes that generates at least minProfit profit, and the total
 * number of members participating in that subset of crimes is at most n.
 *
 * Return the number of schemes that can be chosen. Since the answer may be very large, return it modulo 10^9 + 7.
 *
 * [URL](https://leetcode.com/problems/profitable-schemes/)
 */
object ProfitableSchemes {
    private const val MOD = 1000000007

    // Got TLE on 40th test case
    fun profitableSchemesMine(n: Int, minProfit: Int, group: IntArray, profit: IntArray): Int {
        val visited = hashMapOf<Triple<Int, Int, Int>, Long>()
        val result = if (minProfit == 0) 1L else 0L + backtrack(n, 0, 0, minProfit, group, profit, visited)
        return (result % MOD).toInt()
    }

    private fun backtrack(
        n: Int,
        currProfit: Int,
        index: Int,
        minProfit: Int,
        group: IntArray,
        profit: IntArray,
        visited: HashMap<Triple<Int, Int, Int>, Long>,
    ): Long {
        val cached = visited[Triple(n, currProfit, index)]
        if (cached != null) {
            return cached
        }
        var tempRes = 0L
        for (i in index until profit.size) {
            val peopleLeft = n - group[i]
            if (peopleLeft >= 0) {
                val newProfit = currProfit + profit[i]
                if (newProfit >= minProfit) {
                    tempRes++
                }
                tempRes += backtrack(peopleLeft, newProfit, i + 1, minProfit, group, profit, visited)
            }
        }
        visited[Triple(n, currProfit, index)] = tempRes
        return tempRes
    }

    fun profitableSchemesDp(n: Int, minProfit: Int, group: IntArray, profits: IntArray): Int {
        val dp = Array(101) { Array(101) { IntArray(101) } }
        // Initializing the base case.
        for (count in 0..n) {
            dp[group.size][count][minProfit] = 1
        }
        for (index in group.indices.reversed()) {
            for (count in 0..n) {
                for (profit in 0..minProfit) {
                    // Ways to get a profitable scheme without this crime.
                    dp[index][count][profit] = dp[index + 1][count][profit]
                    val nexPeople = count + group[index]
                    if (nexPeople <= n) {
                        // Adding ways to get profitable schemes, including this crime.
                        val nexMinProfit = minOf(minProfit, profit + profits[index])
                        val including = dp[index + 1][nexPeople][nexMinProfit]
                        dp[index][count][profit] = (dp[index][count][profit] + including) % MOD
                    }
                }
            }
        }
        return dp[0][0][0]
    }
}