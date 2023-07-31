package arrays.hard

import java.util.*

/**
 * Given a wooden stick of length n units. The stick is labelled from 0 to n.
 * For example, a stick of length 6 is labelled as follows:
 * Given an integer array cuts where `cuts[i]` denotes a position you should perform a cut at.
 *
 * You should perform the cuts in order, you can change the order of the cuts as you wish.
 *
 * The cost of one cut is the length of the stick to be cut, the total cost is the sum of costs of all cuts.
 * When you cut a stick, it will be split into two smaller sticks (i.e. the sum of their lengths is the length of
 * the stick before the cut). Please refer to the first example for a better explanation.
 *
 * Return the minimum total cost of the cuts.
 *
 * [URL](https://leetcode.com/problems/minimum-cost-to-cut-a-stick/)
 */
object MinimumCostToCutStick {

    fun minCostDpTopDown(n: Int, cuts: IntArray): Int {
        val m = cuts.size
        val newCuts = IntArray(m + 2)
        System.arraycopy(cuts, 0, newCuts, 1, m)
        newCuts[m + 1] = n
        Arrays.sort(newCuts)
        val memo = Array(m + 2) { IntArray(m + 2) { -1 } }
        return cost(0, newCuts.size - 1, newCuts, memo)
    }

    private fun cost(left: Int, right: Int, newCuts: IntArray, memo: Array<IntArray>): Int {
        if (memo[left][right] != -1) {
            return memo[left][right]
        }
        if (right - left == 1) {
            return 0
        }
        var ans = Int.MAX_VALUE
        for (mid in left + 1 until right) {
            val cost = cost(left, mid, newCuts, memo) + cost(mid, right, newCuts, memo) + newCuts[right] - newCuts[left]
            ans = Math.min(ans, cost)
        }
        memo[left][right] = ans
        return ans
    }

    fun minCostDpBottomUp(n: Int, cuts: IntArray): Int {
        val m = cuts.size
        val newCuts = IntArray(m + 2)
        System.arraycopy(cuts, 0, newCuts, 1, m)
        newCuts[m + 1] = n
        newCuts.sort()

        val dp = Array(m + 2) { IntArray(m + 2) }

        for (diff in 2 until m + 2) {
            for (left in 0 until m + 2 - diff) {
                val right = left + diff
                var ans = Integer.MAX_VALUE
                for (mid in left + 1 until right) {
                    ans = minOf(ans, dp[left][mid] + dp[mid][right] + newCuts[right] - newCuts[left])
                }
                dp[left][right] = ans
            }
        }

        return dp[0][m + 1]
    }
}
