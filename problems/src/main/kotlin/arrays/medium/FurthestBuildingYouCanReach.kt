package arrays.medium

import java.util.*

/**
 * You are given an integer array heights representing the heights of buildings, some bricks, and some ladders.
 *
 * You start your journey from building 0 and move to the next building by possibly using bricks or ladders.
 *
 * While moving from building i to building i+1 (0-indexed),
 *
 * * If the current building's height is greater than or equal to the next building's height, you do not need a ladder or bricks.
 * * If the current building's height is less than the next building's height, you can either use one ladder or (h`[i+1]` - h`[i]`) bricks.
 *
 * Return the furthest building index (0-indexed) you can reach if you use the given ladders and bricks optimally.
 *
 * [URL](https://leetcode.com/problems/furthest-building-you-can-reach/)
 */
object FurthestBuildingYouCanReach {
    fun furthestBuilding(heights: IntArray, bricks: Int, ladders: Int): Int {
        val pq = PriorityQueue<Int>()
        var currBricks = bricks
        for (i in 1 until heights.size) {
            val diff = heights[i] - heights[i - 1]
            if (diff > 0) {
                pq.add(diff)
            }
            if (pq.size > ladders) {
                currBricks -= pq.poll()
                if (currBricks < 0) {
                    return i - 1
                }
            }
        }
        return heights.size - 1
    }
}
