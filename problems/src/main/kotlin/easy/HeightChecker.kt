package easy

/**
 * A school is trying to take an annual photo of all the students. The students are asked to stand in a single file
 * line in non-decreasing order by height. Let this ordering be represented by the integer array expected
 * where `expected[i]` is the expected height of the ith student in line.
 *
 * You are given an integer array heights representing the current order that the students are standing in.
 * Each `heights[i]` is the height of the ith student in line (0-indexed).
 *
 * Return the number of indices where `heights[i] != expected[i]`.
 *
 * [URL](https://leetcode.com/problems/height-checker/)
 */
object HeightChecker {
    fun heightChecker(heights: IntArray): Int {
        val sorted = IntArray(101)
        for (h in heights) {
            sorted[h]++
        }
        var result = 0

        var sortedIx = 0
        for (i in heights.indices) {
            while (sorted[sortedIx] == 0) sortedIx++
            if (sortedIx != heights[i]) {
                result++
            }
            sorted[sortedIx]--
        }

        return result
    }
}
