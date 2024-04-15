package arrays.hard

import java.util.*

/**
 * Given an array of integers heights representing the histogram's bar height where the width of each bar is 1,
 * return the area of the largest rectangle in the histogram.
 *
 * [URL](https://leetcode.com/problems/largest-rectangle-in-histogram/)
 */
object LargestRectangleInHistogram {
    fun largestRectangleArea(heights: IntArray): Int {
        val stack = Stack<Pair<Int, Int>>()

        var result = 0
        for (i in heights.indices) {
            val h = heights[i]
            var newi = i
            while (stack.isNotEmpty() && stack.peek().second >= h) {
                val (previ, prevh) = stack.pop()
                result = maxOf(result, (i - previ) * prevh)
                newi = previ
            }
            stack.push(newi to h)
        }

        while (stack.isNotEmpty()) {
            val (previ, prevh) = stack.pop()
            result = maxOf(result, (heights.size - previ) * prevh)
        }

        return result
    }
}
