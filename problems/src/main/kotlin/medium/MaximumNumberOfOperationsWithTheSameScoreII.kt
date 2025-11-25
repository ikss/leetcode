package medium

/**
 * Given an array of integers called nums, you can perform any of the following operation while nums contains at least
 * 2 elements:
 * * Choose the first two elements of nums and delete them.
 * * Choose the last two elements of nums and delete them.
 * * Choose the first and the last elements of nums and delete them.
 *
 * The score of the operation is the sum of the deleted elements.
 *
 * Your task is to find the maximum number of operations that can be performed, such that all operations have the same
 * score.
 *
 * Return the maximum number of operations possible that satisfy the condition mentioned above.
 *
 * [URL](https://leetcode.com/problems/maximum-number-of-operations-with-the-same-score-ii/)
 */
object MaximumNumberOfOperationsWithTheSameScoreII {
    fun maxOperations(nums: IntArray): Int {
        val size = nums.size
        val cache = Array(size) { IntArray(nums.size) { -1 } }
        return 1 + maxOf(
            traverse(nums, 2, size - 1, nums[0] + nums[1], cache),
            traverse(nums, 1, size - 2, nums[0] + nums[size - 1], cache),
            traverse(nums, 0, size - 3, nums[size - 1] + nums[size - 2], cache),
        )
    }

    private fun traverse(nums: IntArray, start: Int, end: Int, score: Int, cache: Array<out IntArray>): Int {
        if (end - start < 1) return 0

        if (cache[start][end] != -1) {
            return cache[start][end]
        }
        var result = 0

        if (nums[start] + nums[start + 1] == score) {
            result = maxOf(1 + traverse(nums, start + 2, end, score, cache), result)
        }

        if (nums[start] + nums[end] == score) {
            result = maxOf(1 + traverse(nums, start + 1, end - 1, score, cache), result)
        }

        if (nums[end] + nums[end - 1] == score) {
            result = maxOf(1 + traverse(nums, start, end - 2, score, cache), result)
        }

        cache[start][end] = result
        return result
    }

}