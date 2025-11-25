package hard

/**
 * You are given a positive integer k. You are also given:
 *
 * a 2D integer array rowConditions of size n where rowConditions[i] = [abovei, belowi], and
 * a 2D integer array colConditions of size m where colConditions[i] = [lefti, righti].
 * The two arrays contain integers from 1 to k.
 *
 * You have to build a k x k matrix that contains each of the numbers from 1 to k exactly once.
 * The remaining cells should have the value 0.
 *
 * The matrix should also satisfy the following conditions:
 * * The number abovei should appear in a row that is strictly above the row at which the number belowi
 * appears for all i from 0 to n - 1.
 * * The number lefti should appear in a column that is strictly left of the column at which the number righti
 * appears for all i from 0 to m - 1.
 *
 * Return any matrix that satisfies the conditions. If no answer exists, return an empty matrix.
 *
 * [URL](https://leetcode.com/problems/build-a-matrix-with-conditions/)
 */
object BuildMatrixWithConditions {
    fun buildMatrix(k: Int, rowConditions: Array<IntArray>, colConditions: Array<IntArray>): Array<IntArray> {
        val sortedRows = sort(rowConditions, k)
        if (sortedRows.isEmpty()) return emptyArray()

        val sortedCols = sort(colConditions, k)

        val result = Array(k) { IntArray(k) }
        for (i in 0 until k) {
            for (j in 0 until k) {
                if (sortedRows[i] == sortedCols[j]) {
                    result[i][j] = sortedRows[i]
                    break
                }
            }
        }

        return result
    }

    private fun sort(conditions: Array<IntArray>, k: Int): List<Int> {
        val result = ArrayList<Int>(k)

        val indegree = IntArray(k + 1)
        val adjustments = Array(k + 1) { ArrayList<Int>() }

        for ((from, to) in conditions) {
            indegree[to]++
            adjustments[from].add(to)
        }
        val queue = java.util.ArrayDeque<Int>()

        for (i in 1 until indegree.size) {
            if (indegree[i] == 0) {
                queue.offer(i)
            }
        }

        while (queue.isNotEmpty()) {
            val from = queue.poll()
            result.add(from)

            for (to in adjustments[from]) {
                if (--indegree[to] == 0) {
                    queue.offer(to)
                }
            }
        }
        return if (indegree.any { it > 0 }) return emptyList() else result
    }
}
