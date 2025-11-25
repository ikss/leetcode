package hard

import java.util.*

/**
 * You are given two integers n and k and two integer arrays speed and efficiency both of length n.
 * There are n engineers numbered from 1 to n. `speed[i]` and `efficiency[i]` represent the speed and efficiency of
 * the ith engineer respectively.
 *
 * Choose at most k different engineers out of the n engineers to form a team with the maximum performance.
 *
 * The performance of a team is the sum of their engineers' speeds multiplied by the minimum efficiency among their engineers.
 *
 * Return the maximum performance of this team. Since the answer can be a huge number, return it modulo 10^9 + 7.
 *
 * [URL](https://leetcode.com/problems/maximum-performance-of-a-team/)
 */
object MaximumPerformanceOfATeam {
    private const val MOD = 1_000_000_007

    fun maxPerformance(n: Int, speed: IntArray, efficiency: IntArray, k: Int): Int {
        val players = Array(n) { i -> efficiency[i] to speed[i] }
        Arrays.sort(players) { p1, p2 -> p2.first - p1.first }

        val speedQueue = PriorityQueue<Int>(k)
        var teamPerformance: Long = 0
        var teamSpeed: Long = 0
        for (i in 0 until n) {
            if (speedQueue.size >= k) {
                teamSpeed -= speedQueue.remove()
            }
            val (playerEfficiency, playerSpeed) = players[i]
            speedQueue.add(playerSpeed)
            teamSpeed += playerSpeed
            teamPerformance = maxOf(teamPerformance, teamSpeed * playerEfficiency)
        }
        return (teamPerformance % MOD).toInt()
    }
}
