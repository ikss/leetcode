package hard

/**
 * You are given a list of blocks, where `blocks[i] = t` means that the i-th block needs t units of time to be built.
 * A block can only be built by exactly one worker.
 *
 * A worker can either split into two workers (number of workers increases by one) or build a block then go home.
 * Both decisions cost some time.
 *
 * The time cost of spliting one worker into two workers is given as an integer split.
 * Note that if two workers split at the same time, they split in parallel so the cost would be split.
 *
 * Output the minimum time needed to build all blocks.
 *
 * Initially, there is only one worker.
 *
 * [URL](https://leetcode.com/problems/minimum-time-to-build-blocks/)
 */
object MinimumTimeToBuildBlocks {
    fun minBuildTime(blocks: IntArray, split: Int): Int {
        // Sort the blocks in descending order
        blocks.sortDescending()

        // dp[i][j] represents the minimum time taken to build blocks[i~n-1] block using j workers
        // Initialize the dp array with -1
        val dp = Array(blocks.size) { IntArray(blocks.size + 1) { -1 } }

        // Call for the block from index 0 with 1 worker
        return solve(blocks, split, 0, 1, dp)
    }

    private fun solve(blocks: IntArray, split: Int, b: Int, w: Int, dp: Array<IntArray>): Int {
        // Base cases
        if (b == blocks.size) {
            return 0
        }
        if (w == 0) {
            return Int.MAX_VALUE
        }
        if (w >= blocks.size - b) {
            return blocks[b]
        }

        // If the sub-problem is already solved, return the result
        if (dp[b][w] != -1) {
            return dp[b][w]
        }

        // Two Choices
        val workHere = maxOf(blocks[b], solve(blocks, split, b + 1, w - 1, dp))
        val splitHere = split + solve(blocks, split, b, minOf(2 * w, blocks.size - b), dp)

        // Store the result in the dp array
        dp[b][w] = minOf(workHere, splitHere)
        return dp[b][w]
    }
}
