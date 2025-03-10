package arrays.medium

/**
 * There is a circle of red and blue tiles. You are given an array of integers colors and an integer k.
 * The color of tile i is represented by `colors[i]`:
 * * `colors[i] == 0` means that tile i is red.
 * * `colors[i] == 1` means that tile i is blue.
 *
 * An alternating group is every k contiguous tiles in the circle with alternating colors
 * (each tile in the group except the first and last one has a different color from its left and right tiles).
 *
 * Return the number of alternating groups.
 *
 * Note that since colors represents a circle, the first and the last tiles are considered to be next to each other.
 *
 * [URL](https://leetcode.com/problems/alternating-groups-ii/)
 */
object AlternatingGroupsII {
    fun numberOfAlternatingGroups(colors: IntArray, k: Int): Int {
        if (colors.size < k) {
            return 0
        }
        
        var start = 0
        var end = 1
        
        var result = 0
        while (start < colors.size) {
            if (end - start == k) {
                result++
                start++
            }
            val curr = end % colors.size
            val prev = if (curr == 0) colors.size - 1 else curr - 1
            if (colors[curr] != colors[prev]) {
                end++
            } else {
                start = end
                end = start + 1
            }
        }
        
        return result
    }
}
