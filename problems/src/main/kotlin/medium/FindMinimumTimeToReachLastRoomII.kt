package medium

import java.util.*

/**
 * There is a dungeon with n x m rooms arranged as a grid.
 *
 * You are given a 2D array moveTime of size n x m, where `moveTime[ i ][ j ]` represents the minimum time in seconds
 * when you can start moving to that room. You start from the room (0, 0) at time t = 0 and can move to an adjacent room.
 * Moving between adjacent rooms takes one second for one move and two seconds for the next, alternating between the two.
 *
 * Return the minimum time to reach the room (n - 1, m - 1).
 *
 * Two rooms are adjacent if they share a common wall, either horizontally or vertically.
 *
 * [URL](https://leetcode.com/problems/find-minimum-time-to-reach-last-room-ii/)
 */
object FindMinimumTimeToReachLastRoomII {
    private val directions = listOf(-1 to 0, 1 to 0, 0 to -1, 0 to 1)

    fun minTimeToReach(moveTime: Array<IntArray>): Int {
        val n = moveTime.size
        val m = moveTime[0].size
        val moveTimeResult = Array(n) { IntArray(m) { Int.MAX_VALUE } }
        val queue = PriorityQueue<IntArray> { a1, a2 -> a1[2] - a2[2] }
        queue.offer(intArrayOf(0, 0, 0, 1))

        while (queue.isNotEmpty()) {
            val (curr, curc, curt, currCost) = queue.poll()
            if (curr == n - 1 && curc == m - 1) break

            for ((dr, dc) in directions) {
                val newr = curr + dr
                val newc = curc + dc
                if (newr !in 0..<n || newc !in 0..<m) continue
                val newt = maxOf(curt, moveTime[newr][newc]) + currCost
                
                val newCost = if (currCost == 1) 2 else 1

                if (newt >= moveTimeResult[newr][newc]) continue
                moveTimeResult[newr][newc] = newt
                queue.offer(intArrayOf(newr, newc, newt, newCost))
            }

        }

        return moveTimeResult[n - 1][m - 1]
    }
}
