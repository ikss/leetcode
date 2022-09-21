package arrays.easy

/**
 * An image is represented by an m x n integer grid image where `image[i][j]` represents the pixel value of the image.
 *
 * You are also given three integers sr, sc, and color. You should perform a flood fill on the image
 * starting from the pixel `image[sr][sc]`.
 *
 * To perform a flood fill, consider the starting pixel, plus any pixels connected 4-directionally to the starting pixel
 * of the same color as the starting pixel, plus any pixels connected 4-directionally to
 * those pixels (also with the same color), and so on. Replace the color of all of the aforementioned pixels with color.
 *
 * Return the modified image after performing the flood fill.
 *
 * [URL](https://leetcode.com/problems/flood-fill/)
 */
object FloodFill {
    fun floodFill(image: Array<IntArray>, sr: Int, sc: Int, newColor: Int): Array<IntArray> {
        val color = image[sr][sc]
        if (color != newColor) {
            dfs(image, sr, sc, color, newColor)
        }
        return image
    }

    private fun dfs(image: Array<IntArray>, r: Int, c: Int, color: Int, newColor: Int) {
        if (image[r][c] != color) return
        image[r][c] = newColor
        if (r >= 1) {
            dfs(image, r - 1, c, color, newColor)
        }
        if (c >= 1) {
            dfs(image, r, c - 1, color, newColor)
        }
        if (r + 1 < image.size) {
            dfs(image, r + 1, c, color, newColor)
        }
        if (c + 1 < image[0].size) {
            dfs(image, r, c + 1, color, newColor)
        }
    }
}
