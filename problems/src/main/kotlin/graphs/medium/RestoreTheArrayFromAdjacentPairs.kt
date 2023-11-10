package graphs.medium

import java.util.*

/**
 * There is an integer array nums that consists of n unique elements, but you have forgotten it.
 * However, you do remember every pair of adjacent elements in nums.
 *
 * You are given a 2D integer array adjacentPairs of size n - 1 where each `adjacentPairs[i] = [ui, vi]` indicates that
 * the elements ui and vi are adjacent in nums.
 *
 * It is guaranteed that every adjacent pair of elements `nums[i]` and `nums[i+1]` will exist in adjacentPairs,
 * either as `[nums[i], nums[i+1]] or [nums[i+1], nums[i]]`. The pairs can appear in any order.
 *
 * Return the original array nums. If there are multiple solutions, return any of them.
 *
 * [URL](https://leetcode.com/problems/restore-the-array-from-adjacent-pairs/)
 */
object RestoreTheArrayFromAdjacentPairs {
    fun restoreArray(adjacentPairs: Array<IntArray>): IntArray {
        val graph = HashMap<Int, MutableList<Int>>()

        for ((s, e) in adjacentPairs) {
            graph.computeIfAbsent(s) { ArrayList() }.add(e)
            graph.computeIfAbsent(e) { ArrayList() }.add(s)
        }

        var root = 0
        for ((k, v) in graph) {
            if (v.size == 1) {
                root = k
                break
            }
        }

        var curr = root
        val result = IntArray(graph.size)
        result[0] = root
        var prev = Int.MAX_VALUE

        for (i in 1 until result.size) {
            for (neighbor in graph[curr]!!) {
                if (neighbor == prev) continue
                
                result[i] = neighbor
                prev = curr
                curr = neighbor
                break
            }
        }

        return result
    }
}
