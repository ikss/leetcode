package medium

/**
 * You are given two integers m and n representing a 0-indexed m x n grid. You are also given two 2D integer
 * arrays guards and walls where `guards[i] = [rowi, coli]` and `walls[j] = [rowj, colj]` represent the positions
 * of the ith guard and jth wall respectively.
 *
 * A guard can see every cell in the four cardinal directions (north, east, south, or west) starting from their
 * position unless obstructed by a wall or another guard.
 * A cell is guarded if there is at least one guard that can see it.
 *
 * Return the number of unoccupied cells that are not guarded.
 *
 * [URL](https://leetcode.com/problems/count-unguarded-cells-in-the-grid/)
 */
object CountUnguardedCellsInTheGrid {
    private val directions = listOf(-1 to 0, 1 to 0, 0 to -1, 0 to 1)
    
    fun countUnguarded(m: Int, n: Int, guards: Array<IntArray>, walls: Array<IntArray>): Int {
        val grid = Array(m) { IntArray(n) }
        var cells = m * n

        for ((r, c) in walls) {
            grid[r][c] = -1
            cells--
        }
        for ((r, c) in guards) {
            grid[r][c] = -1
            cells--
        }

        for ((r, c) in guards) {
            for ((dr, dc) in directions) {
                var newr = r + dr
                var newc = c + dc

                while (newr in grid.indices && newc in grid[0].indices && grid[newr][newc] != -1) {
                    if (grid[newr][newc] == 0) {
                        cells--
                        grid[newr][newc] = -2
                    }
                    newr += dr
                    newc += dc
                }
            }
        }

        return cells
    }
}
