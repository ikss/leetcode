package easy

/**
 * You are given a 0-indexed string blocks of length n, where `blocks[i]` is either 'W' or 'B',
 * representing the color of the ith block. The characters 'W' and 'B' denote the colors white and black, respectively.
 *
 * You are also given an integer k, which is the desired number of consecutive black blocks.
 *
 * In one operation, you can recolor a white block such that it becomes a black block.
 *
 * Return the minimum number of operations needed such that there is at least one occurrence
 * of k consecutive black blocks.
 *
 * [URL](https://leetcode.com/problems/minimum-recolors-to-get-k-consecutive-black-blocks/)
 */
object MinimumRecolorsToGetKConsecutiveBlackBlocks {
    fun minimumRecolors(blocks: String, k: Int): Int {
        var start = 0
        var end = 0

        var result = k
        while (end < k) {
            if (blocks[end++] == 'B') {
                result--
            }
        }

        if (result == 0) return 0
        var count = result

        while (end < blocks.length) {
            if (blocks[start++] == 'B') {
                count++
            }
            if (blocks[end++] == 'B') {
                count--
            }
            result = minOf(result, count)
        }
        return result
    }
}