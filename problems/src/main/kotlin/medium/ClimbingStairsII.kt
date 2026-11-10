package medium

import java.util.*
import kotlin.math.pow

/**
 * You are climbing a staircase with n + 1 steps, numbered from 0 to n.
 *
 * You are also given a 1-indexed integer array costs of length n, where `costs[i]` is the cost of step i.
 *
 * From step i, you can jump only to step i + 1, i + 2, or i + 3.
 * The cost of jumping from step i to step j is defined as: `costs[j] + (j - i)^2`
 *
 * You start from step 0 with cost = 0.
 *
 * Return the minimum total cost to reach step n.
 *
 * [URL](https://leetcode.com/problems/climbing-stairs-ii/)
 */
object ClimbingStairsII {
    fun climbStairs(n: Int, costs: IntArray): Int {
        val minCost = IntArray(n + 1) { Int.MAX_VALUE }
        minCost[0] = 0

        for (i in 0 until n) {
            for (step in 1..3) {
                if (i + step > n) continue
                val stepCost = costs[i + step - 1] + step * step
                minCost[i + step] = minOf(minCost[i + step], minCost[i] + stepCost)
            }
        }

        return minCost[n]
    }
}
