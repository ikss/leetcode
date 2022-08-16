package data_structures.arrays.medium

/**
 * Given a triangle array, return the minimum path sum from top to bottom.
 *
 * For each step, you may move to an adjacent number of the row below. More formally,
 * if you are on index i on the current row, you may move to either index i or index i + 1 on the next row.
 *
 * [URL](https://leetcode.com/problems/triangle/)
 */
object Triangle {

    fun minimumTotalDfs(triangle: List<List<Int>>): Int {
        val n = triangle.size
        val memo = Array(n) { arrayOfNulls<Int>(n) }
        return dfs(0, 0, triangle, memo)
    }

    private fun dfs(level: Int, i: Int, triangle: List<List<Int>>, memo: Array<Array<Int?>>): Int {
        if (memo[level][i] != null) {
            return memo[level][i]!!
        }
        var path = triangle[level][i]
        if (level < triangle.size - 1) {
            val left = dfs(level + 1, i, triangle, memo)
            val right = dfs(level + 1, i + 1, triangle, memo)
            path += minOf(left, right)
        }
        return path.also { memo[level][i] = it }
    }

    fun minimumTotalDp(triangle: List<List<Int>>): Int {
        val n = triangle.size
        var prevLevel = IntArray(n + 1)
        for (level in n - 1 downTo 0) {
            val curLevel = IntArray(n + 1)
            for (i in 0..level) {
                curLevel[i] = triangle[level][i] + minOf(prevLevel[i], prevLevel[i + 1])
            }
            prevLevel = curLevel
        }
        return prevLevel[0]
    }

}
