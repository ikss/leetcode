package hard

import java.util.*

/**
 * You are asked to cut off all the trees in a forest for a golf event.
 * The forest is represented as an m x n matrix. In this matrix:
 * * 0 means the cell cannot be walked through.
 * * 1 represents an empty cell that can be walked through.
 * * A number greater than 1 represents a tree in a cell that can be walked through,
 * and this number is the tree's height.
 *
 * In one step, you can walk in any of the four directions: north, east, south, and west.
 * If you are standing in a cell with a tree, you can choose whether to cut it off.
 *
 * You must cut off the trees in order from shortest to tallest. When you cut off a tree,
 * the value at its cell becomes 1 (an empty cell).
 *
 * Starting from the point (0, 0), return the minimum steps you need to walk to cut off all the trees.
 * If you cannot cut off all the trees, return -1.
 *
 * Note: The input is generated such that no two trees have the same height,
 * and there is at least one tree needs to be cut off.
 *
 * [URL](https://leetcode.com/problems/cut-off-trees-for-golf-event/)
 */
object CutOffTreesForGolfEvent {
    fun cutOffTree(forest: List<List<Int>>): Int {
        val trees = TreeMap<Int, Pair<Int, Int>>()
        for (r in forest.indices) {
            for (c in forest[0].indices) {
                if (forest[r][c] > 1) {
                    trees[forest[r][c]] = r to c
                }
            }
        }

        var result = 0

        var curr = 0 to 0
        for (t in trees) {
            val distance = bfs(curr, t.value, forest)
            if (distance == -1) return -1
            result += distance
            curr = t.value
        }

        return result
    }

    private fun bfs(curr: Pair<Int, Int>, next: Pair<Int, Int>, forest: List<List<Int>>): Int {
        val queue = ArrayDeque<Pair<Int, Int>>()
        queue.offer(curr)
        var result = 0
        val visited = hashSetOf<Pair<Int, Int>>()

        while (queue.isNotEmpty()) {
            val size = queue.size
            for (i in 0 until size) {
                val point = queue.poll()
                if (point == next) return result

                val (r, c) = point
                if (r < 0 || r >= forest.size || c < 0 || c >= forest[0].size || forest[r][c] == 0 || !visited.add(point)) continue

                queue.offer(r - 1 to c)
                queue.offer(r to c - 1)
                queue.offer(r + 1 to c)
                queue.offer(r to c + 1)
            }
            result++
        }

        return -1
    }
}