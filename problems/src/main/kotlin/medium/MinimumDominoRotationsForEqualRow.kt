package medium

/**
 * In a row of dominoes, `tops[i]` and `bottoms[i]` represent the top and bottom halves of the ith domino.
 * (A domino is a tile with two numbers from 1 to 6 - one on each half of the tile.)
 *
 * We may rotate the ith domino, so that `tops[i]` and `bottoms[i]` swap values.
 *
 * Return the minimum number of rotations so that all the values in tops are the same,
 * or all the values in bottoms are the same.
 *
 * If it cannot be done, return -1.
 *
 * [URL](https://leetcode.com/problems/minimum-domino-rotations-for-equal-row/)
 */
object MinimumDominoRotationsForEqualRow {
    fun minDominoRotations(tops: IntArray, bottoms: IntArray): Int {
        val counts = IntArray(6)
        val countsTop = IntArray(6)
        val countsBottom = IntArray(6)
        val n = tops.size

        for (i in tops.indices) {
            val t = tops[i] - 1
            val b = bottoms[i] - 1
            countsTop[t]++
            countsBottom[b]++

            if (t == b) {
                counts[t]++
            } else {
                counts[t]++
                counts[b]++
            }
        }

        var result = Int.MAX_VALUE
        for (i in counts.indices) {
            if (counts[i] != n) continue

            result = minOf(n - countsTop[i], n - countsBottom[i], result)
        }

        return if (result == Int.MAX_VALUE) -1 else result
    }
}