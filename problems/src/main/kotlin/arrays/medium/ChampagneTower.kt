package arrays.medium

/**
 * We stack glasses in a pyramid, where the first row has 1 glass, the second row has 2 glasses,
 * and so on until the 100th row.  Each glass holds one cup of champagne.
 *
 * Then, some champagne is poured into the first glass at the top.
 * When the topmost glass is full, any excess liquid poured will fall equally to the glass immediately to the left and
 * right of it.  When those glasses become full, any excess champagne will fall equally to the left and right of those
 * glasses, and so on.  (A glass at the bottom row has its excess champagne fall on the floor.)
 *
 * [URL](https://leetcode.com/problems/champagne-tower/)
 */
object ChampagneTower {
    fun champagneTower(poured: Int, query_row: Int, query_glass: Int): Double {
        val tower = Array(query_row + 2) { DoubleArray(it + 2) }
        tower[0][0] = poured.toDouble()

        for (r in 0..query_row) {
            for (c in 0..r) {
                val q = (tower[r][c] - 1.0) / 2
                if (q > 0) {
                    val row = tower[r + 1]
                    row[c] += q
                    row[c + 1] += q
                }
            }
        }

        return minOf(1.0, tower[query_row][query_glass])
    }
}
