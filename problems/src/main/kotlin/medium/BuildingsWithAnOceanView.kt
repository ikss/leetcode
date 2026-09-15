package medium

import java.util.Stack

/**
 * There are n buildings in a line. You are given an integer array heights of size n
 * that represents the heights of the buildings in the line.
 *
 * The ocean is to the right of the buildings. A building has an ocean view if the building can see the ocean without
 * obstructions. Formally, a building has an ocean view if all the buildings to its right have a smaller height.
 *
 * Return a list of indices (0-indexed) of buildings that have an ocean view, sorted in increasing order.
 *
 * [URL](https://leetcode.com/problems/buildings-with-an-ocean-view/)
 */
object BuildingsWithAnOceanView {
    fun findBuildings(heights: IntArray): IntArray {
        val stack = Stack<Int>()

        for (i in heights.indices) {
            val currh = heights[i]

            while (stack.isNotEmpty() && heights[stack.peek()] <= currh) {
                stack.pop()
            }
            stack.push(i)
        }

        val n = stack.size
        val result = IntArray(n)

        var i = 0
        while (stack.isNotEmpty()) {
            result[n - i++ - 1] = stack.pop()
        }

        return result
    }
}
