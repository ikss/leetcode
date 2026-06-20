package hard


/**
 * You want to build n new buildings in a city. The new buildings will be built in a line and are labeled from 1 to n.
 *
 * However, there are city restrictions on the heights of the new buildings:
 *
 * * The height of each building must be a non-negative integer.
 * * The height of the first building must be 0.
 * * The height difference between any two adjacent buildings cannot exceed 1.
 *
 * Additionally, there are city restrictions on the maximum height of specific buildings.
 * These restrictions are given as a 2D integer array restrictions where `restrictions[i] = [idi, maxHeighti]`
 * indicates that building idi must have a height less than or equal to maxHeighti.
 *
 * It is guaranteed that each building will appear at most once in restrictions,
 * and building 1 will not be in restrictions.
 *
 * Return the maximum possible height of the tallest building.
 *
 * [URL](https://leetcode.com/problems/maximum-building-height/)
 */
object MaximumBuildingHeight {
    fun maxBuilding(n: Int, restrictions: Array<IntArray>): Int {
        val limits = restrictions.toMutableList()
        limits.add(intArrayOf(1, 0))
        limits.sortBy { it[0] }
        if (limits.last()[0] != n) {
            limits.add(intArrayOf(n, n - 1))
        }

        val m = limits.size
        for (i in 1 until m) {
            val dist = limits[i][0] - limits[i - 1][0]

            limits[i][1] = minOf(limits[i][1], limits[i - 1][1] + dist)
        }

        for (i in m - 2 downTo 0) {
            val dist = limits[i + 1][0] - limits[i][1]

            limits[i][1] = minOf(limits[i][1], limits[i + 1][1] + dist)
        }

        var result = 0
        for (i in 0 until m - 1) {
            // Calculate the maximum height of the buildings between r[i][0] and r[i][1]
            val dist = limits[i + 1][0] - limits[i][0]
            val best = (dist + limits[i][1] + limits[i + 1][1]) / 2
            result = maxOf(result, best)
        }

        return result
    }
}
