package hard

/**
 * You are given an m x n grid grid of values 0, 1, or 2, where:
 *
 * each 0 marks an empty land that you can pass by freely,
 * each 1 marks a building that you cannot pass through, and
 * each 2 marks an obstacle that you cannot pass through.
 * You want to build a house on an empty land that reaches all buildings in the shortest total travel distance.
 * You can only move up, down, left, and right.
 *
 * Return the shortest travel distance for such a house. If it is not possible to build such a house according
 * to the above rules, return -1.
 *
 * The total travel distance is the sum of the distances between the houses of the friends and the meeting point.
 *
 * The distance is calculated using Manhattan Distance, where distance(p1, p2) = |p2.x - p1.x| + |p2.y - p1.y|.
 *
 * [URL](https://leetcode.com/problems/shortest-distance-from-all-buildings/)
 */
object ShortestDistanceFromAllBuildings {
    private val moves = listOf(-1 to 0, 1 to 0, 0 to -1, 0 to 1)

    fun shortestDistance(grid: Array<IntArray>): Int {
        val buildings = Array(grid.size) { IntArray(grid[0].size) }
        var maxBuildings = 0
        for (i in grid.indices) {
            for (j in grid[0].indices) {
                if (grid[i][j] == 1) {
                    maxBuildings++
                    fillGrid(i, j, grid, buildings)
                }
            }
        }

        var result = Int.MAX_VALUE

        for (i in grid.indices) {
            for (j in grid[0].indices) {
                if (grid[i][j] < 0 && buildings[i][j] == maxBuildings) {
                    result = minOf(result, -grid[i][j])
                }
            }
        }

        return if (result == Int.MAX_VALUE) -1 else result
    }

    private fun fillGrid(starti: Int, startj: Int, grid: Array<IntArray>, buildings: Array<IntArray>) {
        val queue = java.util.ArrayDeque<Pair<Int, Int>>()
        queue.offer(starti to startj)
        var step = 1
        val visited = HashSet<Pair<Int, Int>>()
        visited.add(starti to startj)

        while (queue.isNotEmpty()) {
            val size = queue.size
            for (el in 0 until size) {
                val (i, j) = queue.poll()

                for ((di, dj) in moves) {
                    val newi = i + di
                    val newj = j + dj

                    if (newi !in grid.indices || newj !in grid[0].indices || grid[newi][newj] > 0 || !visited.add(newi to newj)) {
                        continue
                    }
                    buildings[newi][newj]++
                    grid[newi][newj] -= step
                    queue.offer(newi to newj)
                }
            }
            step++
        }
    }
}
