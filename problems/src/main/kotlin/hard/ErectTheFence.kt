package hard

import java.util.*

/**
 * You are given an array trees where `trees[i] = [xi, yi]` represents the location of a tree in the garden.
 *
 * You are asked to fence the entire garden using the minimum length of rope as it is expensive.
 * The garden is well fenced only if all the trees are enclosed.
 *
 * Return the coordinates of trees that are exactly located on the fence perimeter.
 *
 * [URL](https://leetcode.com/problems/erect-the-fence/)
 */
object ErectTheFence {
    fun outerTrees(trees: Array<IntArray>): Array<IntArray> {
        trees.sortWith { p, q ->
            if (q[0] == p[0]) q[1] - p[1] else q[0] - p[0]
        }

        val hull = Stack<IntArray>()
        for (p in trees) {
            while (hull.size >= 2 && orientation(hull[hull.size - 2], hull[hull.size - 1], p) > 0) {
                hull.pop()
            }
            hull.push(p)
        }
        hull.pop()
        for (i in trees.size - 1 downTo 0) {
            while (hull.size >= 2 && orientation(hull[hull.size - 2], hull[hull.size - 1], trees[i]) > 0) {
                hull.pop()
            }
            hull.push(trees[i])
        }
        return hull.toSet().toTypedArray()
    }

    private fun orientation(p: IntArray, q: IntArray, r: IntArray): Int {
        return (q[1] - p[1]) * (r[0] - q[0]) - (q[0] - p[0]) * (r[1] - q[1])
    }
}
