package data_structures.arrays.medium

/**
 * You are given a rectangular cake of size h x w and two arrays of integers horizontalCuts and verticalCuts where:
 *
 *  * `horizontalCuts[i]` is the distance from the top of the rectangular cake to the ith horizontal cut and similarly, and
 *  * `verticalCuts[j]` is the distance from the left of the rectangular cake to the jth vertical cut.
 *
 * Return the maximum area of a piece of cake after you cut at each horizontal and vertical position
 * provided in the arrays horizontalCuts and verticalCuts. Since the answer can be a large number,
 * return this modulo 10^9 + 7.
 *
 * [URL](https://leetcode.com/problems/maximum-area-of-a-piece-of-cake-after-horizontal-and-vertical-cuts/)
 */
object MaximumAreaPieceOfCake {
    fun maxArea(h: Int, w: Int, horizontalCuts: IntArray, verticalCuts: IntArray): Int {
        horizontalCuts.sort()
        verticalCuts.sort()

        var prev = 0
        var maxH = 0
        var maxV = 0

        for (hCut in horizontalCuts) {
            maxH = Math.max(maxH, hCut - prev)
            prev = hCut
        }
        maxH = Math.max(maxH, h - prev)

        prev = 0
        for (vCut in verticalCuts) {
            maxV = Math.max(maxV, vCut - prev)
            prev = vCut
        }
        maxV = Math.max(maxV, w - prev)

        return ((maxH.toLong() * maxV) % (1_000_000_007)).toInt()
    }
}
