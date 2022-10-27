package arrays.medium

/**
 * You are given two images, img1 and img2, represented as binary, square matrices of size n x n.
 * A binary matrix has only 0s and 1s as values.
 *
 * We translate one image however we choose by sliding all the 1 bits left, right, up, and/or down any number of units.
 * We then place it on top of the other image. We can then calculate the overlap by counting the number of positions
 * that have a 1 in both images.
 *
 * Note also that a translation does not include any kind of rotation. Any 1 bits that are translated
 * outside of the matrix borders are erased.
 *
 * Return the largest possible overlap.
 *
 * [URL](https://leetcode.com/problems/image-overlap/)
 */
object ImageOverlap {

    fun largestOverlap(img1: Array<IntArray>, img2: Array<IntArray>): Int {
        val size = img1.size
        val padded = Array(3 * size - 2) { IntArray(3 * size - 2) }
        for (row in 0 until size) {
            for (col in 0 until size) {
                padded[row + size - 1][col + size - 1] = img2[row][col]
            }
        }
        var maxOverlaps = 0
        for (xShift in 0 until 2 * size - 1) {
            for (yShift in 0 until 2 * size - 1) {
                maxOverlaps = maxOf(maxOverlaps, convolute(img1, padded, xShift, yShift))
            }
        }
        return maxOverlaps
    }

    private fun convolute(img1: Array<IntArray>, kernel: Array<IntArray>, xShift: Int, yShift: Int): Int {
        var result = 0
        for (row in img1.indices) {
            for (col in img1.indices) {
                result += img1[row][col] * kernel[row + yShift][col + xShift]
            }
        }
        return result
    }
}
