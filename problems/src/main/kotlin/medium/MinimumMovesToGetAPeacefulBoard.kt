package medium

/**
 * Given a 2D array rooks of length n, where `rooks[i] = [xi, yi]` indicates the position of a rook on an n x n
 * chess board. Your task is to move the rooks 1 cell at a time vertically or horizontally (to an adjacent cell) such
 * that the board becomes peaceful.
 *
 * A board is peaceful if there is exactly one rook in each row and each column.
 *
 * Return the minimum number of moves required to get a peaceful board.
 *
 * Note that at no point can there be two rooks in the same cell.
 *
 * [URL](https://leetcode.com/problems/minimum-moves-to-get-a-peaceful-board/)
 */
object MinimumMovesToGetAPeacefulBoard {
    fun minMoves(rooks: Array<IntArray>): Int {
        val n = rooks.size
        val rows = IntArray(n)
        val cols = IntArray(n)

        for ((r,c) in rooks) {
            rows[r]++
            cols[c]++
        }

        var rowMin = 0
        var colMin = 0
        var result = 0

        for (i in rooks.indices) {
            rowMin += rows[i] - 1
            colMin += cols[i] - 1

            result += Math.abs(rowMin) + Math.abs(colMin)
        }

        return result
    }
}
