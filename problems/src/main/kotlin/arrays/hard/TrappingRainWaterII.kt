package arrays.hard

/**
 * Given an m x n integer matrix heightMap representing the height of each unit cell in a 2D elevation map,
 * return the volume of water it can trap after raining.
 *
 * [URL](https://leetcode.com/problems/trapping-rain-water-ii/)
 */
object TrappingRainWaterII {
    private val fillDirections = listOf(
        intArrayOf(0, -1, 0),
        intArrayOf(0, 1, 0),
        intArrayOf(0, 0, -1),
        intArrayOf(0, 0, 1),
        intArrayOf(-1, 0, 0),
    )
    private val drainDirections = listOf(
        intArrayOf(0, -1, 0),
        intArrayOf(0, 1, 0),
        intArrayOf(0, 0, -1),
        intArrayOf(0, 0, 1),
        intArrayOf(1, 0, 0),
    )

    fun trapRainWater(heightMap: Array<IntArray>): Int {
        val m = heightMap.size
        val n = heightMap[0].size
        val maxHeight = heightMap.maxOf { it.max() }

        // 0 - unfilled
        // 1 - block
        // 2 - filled
        val blocks = Array(maxHeight) { Array(m) { IntArray(n) } }

        for (r in heightMap.indices) {
            for (c in heightMap[0].indices) {
                for (h in 0 until heightMap[r][c]) {
                    blocks[h][r][c] = 1
                }
            }
        }
        var count = fillTrapped(blocks)
        count -= drainTrapped(blocks)

        return count
    }

    private fun fillTrapped(blocks: Array<Array<IntArray>>): Int {
        val visited = Array(blocks.size + 1) { Array(blocks[0].size) { BooleanArray(blocks[0][0].size) } }
        val queue = java.util.ArrayDeque<IntArray>()
        queue.offer(intArrayOf(blocks.size, 0, 0))
        visited[blocks.size][0][0] = true

        var count = 0
        while (queue.isNotEmpty()) {
            val curr = queue.poll()
            val currz = curr[0]
            val currr = curr[1]
            val currc = curr[2]

            for (dir in fillDirections) {
                val dz = dir[0]
                val dr = dir[1]
                val dc = dir[2]

                val newz = currz + dz
                val newr = currr + dr
                val newc = currc + dc

                if (newz !in visited.indices || newr !in visited[0].indices || newc !in visited[0][0].indices) {
                    continue
                }
                if (newz in blocks.indices && blocks[newz][newr][newc] == 0) {
                    blocks[newz][newr][newc] = 2
                    count++
                }
                if (visited[newz][newr][newc]) {
                    continue
                }
                visited[newz][newr][newc] = true
                queue.offer(intArrayOf(newz, newr, newc))
            }
        }
        return count
    }

    private fun drainTrapped(blocks: Array<Array<IntArray>>): Int {
        val visited = HashSet<Triple<Int, Int, Int>>()
        val queue = java.util.ArrayDeque<IntArray>()
        queue.offer(intArrayOf(0, -1, -1))
        visited.add(Triple(0, -1, -1))
        var count = 0

        while (queue.isNotEmpty()) {
            val curr = queue.poll()
            val currz = curr[0]
            val currr = curr[1]
            val currc = curr[2]

            for (dir in drainDirections) {
                val dz = dir[0]
                val dr = dir[1]
                val dc = dir[2]

                val newz = currz + dz
                val newr = currr + dr
                val newc = currc + dc

                if (newz == -2) {
                    continue
                }
                if (newz !in blocks.indices || newr !in -1..blocks[0].size || newc !in -1..blocks[0][0].size) {
                    continue
                }

                if (newr in blocks[newz].indices && newc in blocks[newz][newr].indices && blocks[newz][newr][newc] == 1) {
                    continue
                }
                if (newr in blocks[newz].indices && newc in blocks[newz][newr].indices && blocks[newz][newr][newc] == 2) {
                    blocks[newz][newr][newc] = 0
                    count++
                }
                if (!visited.add(Triple(newz, newr, newc))) {
                    continue
                }
                queue.offer(intArrayOf(newz, newr, newc))
            }
        }
        return count
    }
}
