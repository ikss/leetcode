package arrays.easy

/**
 * An image smoother is a filter of the size 3 x 3 that can be applied to each cell of an image by rounding down
 * the average of the cell and the eight surrounding cells (i.e., the average of the nine cells in the blue smoother).
 * If one or more of the surrounding cells of a cell is not present, we do not consider it in the average
 * (i.e., the average of the four cells in the red smoother).
 *
 *
 * Given an m x n integer matrix img representing the grayscale of an image, return the image after applying
 * the smoother on each cell of it.
 *
 * [URL](https://leetcode.com/problems/image-smoother/)
 */
object ImageSmoother {
    private val directions = listOf(-1 to -1, -1 to 0, -1 to 1, 0 to -1, 0 to 0, 0 to 1, 1 to -1, 1 to 0, 1 to 1)

    fun imageSmoother(img: Array<IntArray>): Array<IntArray> {
        val result = Array(img.size) { IntArray(img[0].size) }

        for (i in img.indices) {
            for (j in img[0].indices) {
                result[i][j] = getAvg(i, j, img)
            }
        }

        return result
    }

    private fun getAvg(i: Int, j: Int, img: Array<IntArray>): Int {
        var sum = 0
        var count = 0
        for ((di, dj) in directions) {
            val newi = i + di
            val newj = j + dj
            if (newi < 0 || newj < 0 || newi == img.size || newj == img[0].size) {
                continue
            }
            count++
            sum += img[newi][newj]
        }
        return sum / count
    }
}
