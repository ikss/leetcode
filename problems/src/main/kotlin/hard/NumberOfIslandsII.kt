package hard

import data_structures.UnionFind

/**
 * You are given an empty 2D binary grid grid of size m x n. The grid represents a map where 0's represent water and 1's
 * represent land. Initially, all the cells of grid are water cells (i.e., all the cells are 0's).
 *
 * We may perform an add land operation which turns the water at position into a land.
 * You are given an array positions where `positions[i] = [ri, ci]` is the position (ri, ci) at which we should operate
 * the ith operation.
 *
 * Return an array of integers answer where `answer[i]` is the number of islands after turning
 * the cell (ri, ci) into a land.
 *
 * An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically.
 * You may assume all four edges of the grid are all surrounded by water.
 *
 * [URL](https://leetcode.com/problems/number-of-islands-ii/)
 */
object NumberOfIslandsII {
    val directions = listOf(-1 to 0, 1 to 0, 0 to -1, 0 to 1)
    
    fun numIslands2(m: Int, n: Int, positions: Array<IntArray>): List<Int> {
        val uf = UnionFind(m * n, 0)
        val result = ArrayList<Int>(positions.size)
        val store = HashSet<Int>()

        for ((i, j) in positions) {
            if (store.add(i + m * j)) {
                uf.components++
                for ((di, dj) in directions) {
                    val newi = i + di
                    val newj = j + dj
                    if (newi in 0..<m && newj in 0..<n && store.contains(newi + m * newj)) {
                        uf.union(i + m * j, newi + m * newj)
                    }
                }
            }
            result.add(uf.components)
        }
        return result
    }
}
