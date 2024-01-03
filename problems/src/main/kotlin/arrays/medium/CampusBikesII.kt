package arrays.medium

import java.util.*


/**
 * On a campus represented as a 2D grid, there are n workers and m bikes, with n <= m.
 * Each worker and bike is a 2D coordinate on this grid.
 *
 * We assign one unique bike to each worker so that the sum of the Manhattan distances between each worker and their
 * assigned bike is minimized.
 *
 * Return the minimum possible sum of Manhattan distances between each worker and their assigned bike.
 *
 * The Manhattan distance between two points p1 and p2 is Manhattan(p1, p2) = |p1.x - p2.x| + |p1.y - p2.y|.
 *
 * [URL](https://leetcode.com/problems/campus-bikes-ii/)
 */
object CampusBikesII {
    // Maximum value of mask will be 2^(Number of bikes)
    // and number of bikes can be 10 at max
    var memo = IntArray(1024)

    fun assignBikes(workers: Array<IntArray>, bikes: Array<IntArray>): Int {
        Arrays.fill(memo, -1)
        return minimumDistanceSum(workers, bikes, 0, 0)
    }

    private fun minimumDistanceSum(workers: Array<IntArray>, bikes: Array<IntArray>, workerIndex: Int, mask: Int): Int {
        if (workerIndex >= workers.size) {
            return 0
        }

        // If result is already calculated, return it no recursion needed
        if (memo[mask] != -1) return memo[mask]

        var smallestDistanceSum = Int.MAX_VALUE
        for (bikeIndex in bikes.indices) {
            // Check if the bike at bikeIndex is available
            if ((mask and (1 shl bikeIndex)) != 0) continue
            // Adding the current distance and repeat the process for next worker
            // also changing the bit at index bikeIndex to 1 to show the bike there is assigned
            val distance = findDistance(workers[workerIndex], bikes[bikeIndex])
            smallestDistanceSum = minOf(
                smallestDistanceSum,
                distance + minimumDistanceSum(workers, bikes, workerIndex + 1, mask or (1 shl bikeIndex))
            )
        }

        // Memoizing the result corresponding to mask
        memo[mask] = smallestDistanceSum
        return smallestDistanceSum
    }

    // Manhattan distance
    private fun findDistance(worker: IntArray, bike: IntArray): Int {
        return Math.abs(worker[0] - bike[0]) + Math.abs(worker[1] - bike[1])
    }
}