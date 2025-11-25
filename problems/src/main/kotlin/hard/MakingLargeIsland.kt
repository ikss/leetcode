package hard

/**
 * You are given an n x n binary matrix grid. You are allowed to change at most one 0 to be 1.
 *
 * Return the size of the largest island in grid after applying this operation.
 *
 * An island is a 4-directionally connected group of 1s.
 *
 * [URL](https://leetcode.com/problems/best-meeting-point/)
 */
object MakingLargeIsland {
    private val dirRow = intArrayOf(-1, 1, 0, 0)
    private val dirCol = intArrayOf(0, 0, -1, 1)

    fun largestIsland(grid: Array<IntArray>): Int {
        val n = grid.size
        val dsu = DSU(n * n)

        for (r in grid.indices) {
            for (c in grid[0].indices) {
                if (grid[r][c] == 0) continue

                for (i in 0..3) {
                    val newr = r + dirRow[i]
                    val newc = c + dirCol[i]
                    if (newr in grid.indices && newc in grid[0].indices && grid[newr][newc] == 1) {
                        dsu.union(r * n + c, newr * n + newc)
                    }
                }
            }
        }

        var result = dsu.maxRank
        for (r in grid.indices) {
            for (c in grid[0].indices) {
                if (grid[r][c] == 1) continue

                val parents = HashSet<Int>()
                for (i in 0..3) {
                    val newr = r + dirRow[i]
                    val newc = c + dirCol[i]
                    if (newr in grid.indices && newc in grid[0].indices && grid[newr][newc] == 1) {
                        parents.add(dsu.find(newr * n + newc))
                    }
                }
                result = maxOf(result, parents.sumOf { dsu.ranks[it] } + 1)
            }
        }

        return result
    }

    private data class DSU(val n: Int) {
        val parents = IntArray(n) { it }
        val ranks = IntArray(n) { 1 }
        var maxRank = 1

        fun find(x: Int): Int {
            var parent = parents[x]

            while (parent != parents[parent]) {
                parent = parents[parent]
            }

            // shrink paths
            var temp = parents[x]
            while (temp != parents[temp]) {
                temp = parents[temp]
                parents[temp] = parent
            }

            return parent
        }

        fun union(x: Int, y: Int): Boolean {
            val parent1 = find(x)
            val parent2 = find(y)

            if (parent1 == parent2) {
                return false
            }

            val (big, small) = if (ranks[parent1] >= ranks[parent2]) {
                parent1 to parent2
            } else {
                parent2 to parent1
            }
            parents[small] = big
            ranks[big] += ranks[small]
            maxRank = maxOf(maxRank, ranks[big])
            return true
        }
    }
}
