package medium


/**
 * You are given the two integers, n and m and two integer arrays, hBars and vBars. The grid has n + 2 horizontal
 * and m + 2 vertical bars, creating 1 x 1 unit cells. The bars are indexed starting from 1.
 *
 * You can remove some of the bars in hBars from horizontal bars and some of the bars in vBars from vertical bars.
 * Note that other bars are fixed and cannot be removed.
 *
 * Return an integer denoting the maximum area of a square-shaped hole in the grid,
 * after removing some bars (possibly none).
 *
 * [URL](https://leetcode.com/problems/alternating-groups-ii/)
 */
object MaximizeAreaOfSquareHoleInGrid {
    fun maximizeSquareHoleArea(n: Int, m: Int, hBars: IntArray, vBars: IntArray): Int {
        hBars.sort()
        vBars.sort()

        var hmax = 1
        var vmax = 1
        var hcur = 1
        var vcur = 1
        for (i in 1..<hBars.size) {
            if (hBars[i] == hBars[i - 1] + 1) {
                hcur++
            } else {
                hcur = 1
            }
            hmax = maxOf(hmax, hcur)
        }
        for (i in 1..<vBars.size) {
            if (vBars[i] == vBars[i - 1] + 1) {
                vcur++
            } else {
                vcur = 1
            }
            vmax = maxOf(vmax, vcur)
        }
        val side = minOf(hmax, vmax) + 1
        return side * side
    }
}
