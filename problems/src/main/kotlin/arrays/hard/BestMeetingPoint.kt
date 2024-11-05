package arrays.hard

/**
 * Given an m x n binary grid _grid_ where each 1 marks the home of one friend, return the minimal total travel distance.
 *
 * The total travel distance is the sum of the distances between the houses of the friends and the meeting point.
 *
 * The distance is calculated using Manhattan Distance, where distance(p1, p2) = |p2.x - p1.x| + |p2.y - p1.y|.
 *
 * [URL](https://leetcode.com/problems/best-meeting-point/)
 */
object BestMeetingPoint {
    fun minTotalDistance(grid: Array<IntArray>): Int {
        val m = grid.size
        val n = grid[0].size

        val rows = ArrayList<Int>(m)
        val cols = ArrayList<Int>(n)

        for (i in 0 until m) {
            for (j in 0 until n) {
                if (grid[i][j] == 1) {
                    rows.add(i)
                    cols.add(j)
                }
            }
        }
        // rows are already sorted, bc we iterate over i first
        return getMin(rows) + getMin(cols.sorted())
    }

    private fun getMin(list: List<Int>): Int {
        var ret = 0

        var i = 0
        var j = list.size - 1
        while (i < j) {
            ret += list[j--] - list[i++]
        }

        return ret
    }
}
