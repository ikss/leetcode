package hard

/**
 * You are given an array of transactions transactions where `transactions[i] = [fromi, toi, amounti]` indicates that
 * the person with ID = fromi gave amounti $ to the person with ID = toi.
 *
 * Return the minimum number of transactions required to settle the debt.
 *
 * [URL](https://leetcode.com/problems/optimal-account-balancing/)
 */
object OptimalAccountBalancing {
    fun minTransfers(transactions: Array<IntArray>): Int {
        val creditMap = HashMap<Int, Int>()
        for ((from, to, amount) in transactions) {
            creditMap[from] = creditMap.getOrDefault(from, 0) + amount
            creditMap[to] = creditMap.getOrDefault(to, 0) - amount
        }

        val creditList = ArrayList<Int>()
        for (amount in creditMap.values) {
            if (amount != 0) {
                creditList.add(amount)
            }
        }

        val n = creditList.size
        val memo = IntArray(1 shl n) { -1 }
        memo[0] = 0
        return n - dfs((1 shl n) - 1, memo, creditList)
    }

    private fun dfs(totalMask: Int, memo: IntArray, creditList: List<Int>): Int {
        if (memo[totalMask] != -1) {
            return memo[totalMask]
        }
        var balanceSum = 0
        var answer = 0

        // Remove one person at a time in total_mask
        for (i in creditList.indices) {
            val curBit = 1 shl i
            if ((totalMask and curBit) != 0) {
                balanceSum += creditList[i]
                answer = maxOf(answer, dfs(totalMask xor curBit, memo, creditList))
            }
        }

        // If the total balance of total_mask is 0, increment answer by 1.
        memo[totalMask] = answer + (if (balanceSum == 0) 1 else 0)
        return memo[totalMask]
    }
}