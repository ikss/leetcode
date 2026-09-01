package medium


/**
 * You are given an m x n grid classroom where a student volunteer is tasked with cleaning up litter
 * scattered around the room. Each cell in the grid is one of the following:
 * * 'S': Starting position of the student
 * * 'L': Litter that must be collected (once collected, the cell becomes empty)
 * * 'R': Reset area that restores the student's energy to full capacity,
 * regardless of their current energy level (can be used multiple times)
 * * 'X': Obstacle the student cannot pass through
 * * '.': Empty space
 *
 * You are also given an integer energy, representing the student's maximum energy capacity.
 * The student starts with this energy from the starting position 'S'.
 *
 * Each move to an adjacent cell (up, down, left, or right) costs 1 unit of energy.
 * If the energy reaches 0, the student can only continue if they are on a reset area 'R',
 * which resets the energy to its maximum capacity energy.
 *
 * Return the minimum number of moves required to collect all litter items, or -1 if it's impossible.
 *
 * [URL](https://leetcode.com/problems/minimum-moves-to-clean-the-classroom/)
 */
object MinimumMovesToCleanTheClassroom {
    private data class State(
        var row: Int,
        var col: Int,
        var mask: Int,
        var energyLeft: Int,
        var steps: Int,
    )

    private val directions = listOf(0 to -1, 0 to 1, -1 to 0, 1 to 0)

    fun minMoves(classroom: Array<String>, energy: Int): Int {
        val maxRows = classroom.size
        val maxCols = classroom[0].length
        val index = Array(maxRows) { IntArray(maxCols) }
        var start = -1 to -1
        var litterCount = 0

        for (row in 0..<maxRows) {
            for (col in 0..<maxCols) {
                val c = classroom[row][col]
                if (c == 'S') {
                    start = row to col
                } else if (c == 'L') {
                    index[row][col] = 1 shl litterCount
                    litterCount++
                }
            }
        }
        val full = 1 shl litterCount
        val bestEnergy = Array(maxRows) { Array(maxCols) { IntArray(full) { -1 } } }

        bestEnergy[start.first][start.second][0] = energy


        val queue = java.util.ArrayDeque<State>()
        queue.offer(State(start.first, start.second, 0, energy, 0))
        while (queue.isNotEmpty()) {
            val t = queue.poll()
            if (t.mask == full - 1) {
                return t.steps
            }
            if (t.energyLeft == 0) {
                continue
            }
            for ((dr, dc) in directions) {
                val nRow = t.row + dr
                val nCol = t.col + dc
                if (nRow !in 0..<maxRows || nCol < 0 || nCol >= maxCols || classroom[nRow][nCol] == 'X') {
                    continue
                }
                val ne = if (classroom[nRow][nCol] == 'R') energy else t.energyLeft - 1
                val nmask = t.mask or index[nRow][nCol]

                if (ne > bestEnergy[nRow][nCol][nmask]) {
                    bestEnergy[nRow][nCol][nmask] = ne
                    queue.offer(State(nRow, nCol, nmask, ne, t.steps + 1))
                }
            }
        }
        return -1
    }
}
