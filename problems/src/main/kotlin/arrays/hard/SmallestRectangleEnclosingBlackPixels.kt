package arrays.hard

/**
 * You are given an m x n binary matrix image where 0 represents a white pixel and 1 represents a black pixel.
 *
 * The black pixels are connected (i.e., there is only one black region).
 * Pixels are connected horizontally and vertically.
 *
 * Given two integers x and y that represents the location of one of the black pixels,
 * return the area of the smallest (axis-aligned) rectangle that encloses all black pixels.
 *
 * You must write an algorithm with less than O(mn) runtime complexity
 *
 * [URL](https://leetcode.com/problems/smallest-rectangle-enclosing-black-pixels/)
 */
object SmallestRectangleEnclosingBlackPixels {
    fun minArea(image: Array<CharArray>, x: Int, y: Int): Int {
        val m = image.size
        val n = image[0].size
        val left = searchColumns(image, 0, y, 0, m, true)
        val right = searchColumns(image, y + 1, n, 0, m, false)
        val top = searchRows(image, 0, x, left, right, true)
        val bottom = searchRows(image, x + 1, m, left, right, false)
        return (right - left) * (bottom - top)
    }

    private fun searchColumns(
        image: Array<CharArray>,
        i: Int,
        j: Int,
        top: Int,
        bottom: Int,
        whiteToBlack: Boolean,
    ): Int {
        var i = i
        var j = j
        while (i != j) {
            var k = top
            val mid = (i + j) / 2
            while (k < bottom && image[k][mid] == '0') ++k
            // k < bottom means the column mid has black pixel
            if (k < bottom == whiteToBlack) {
                //search the boundary in the smaller half
                j = mid
            } else {
                //search the boundary in the greater half
                i = mid + 1
            }
        }
        return i
    }

    private fun searchRows(
        image: Array<CharArray>,
        i: Int,
        j: Int,
        left: Int,
        right: Int,
        whiteToBlack: Boolean,
    ): Int {
        var i = i
        var j = j
        while (i != j) {
            var k = left
            val mid = (i + j) / 2
            while (k < right && image[mid][k] == '0') ++k
            // k < right means the row mid has black pixel
            if (k < right == whiteToBlack) {
                j = mid
            } else {
                i = mid + 1
            }
        }
        return i
    }
}
