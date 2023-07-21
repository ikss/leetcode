package arrays.hard

/**
 * You are given nums, an array of positive integers of size 2 * n. You must perform n operations on this array.
 *
 * In the ith operation (1-indexed), you will:
 * * Choose two elements, x and y.
 * * Receive a score of i * gcd(x, y).
 * * Remove x and y from nums.
 *
 * Return the maximum score you can receive after performing n operations.
 *
 * The function gcd(x, y) is the greatest common divisor of x and y.
 *
 * [URL](https://leetcode.com/problems/maximize-score-after-n-operations/)
 */
object MaximizeScoreAfterNOperations {

    fun maxScore(nums: IntArray): Int {
        val memoSize = 1 shl nums.size // 2^(nums array size)
        val memo = IntArray(memoSize) { -1 }
        return backtrack(nums, 0, 0, memo)
    }

    private fun backtrack(nums: IntArray, mask: Int, pairsPicked: Int, memo: IntArray): Int {
        // If we have picked all the numbers from 'nums' array, we can't get more score.
        if (2 * pairsPicked == nums.size) {
            return 0
        }

        // If we already solved this sub-problem then return the stored result.
        if (memo[mask] != -1) {
            return memo[mask]
        }
        var maxScore = 0

        // Iterate on 'nums' array to pick the first and second number of the pair.
        for (firstIndex in nums.indices) {
            if (mask shr firstIndex and 1 == 1) {
                continue
            }
            for (secondIndex in firstIndex + 1 until nums.size) {

                // If the numbers are same, or already picked, then we move to next number.
                if (mask shr secondIndex and 1 == 1) {
                    continue
                }

                // Both numbers are marked as picked in this new mask.
                val newMask = mask or (1 shl firstIndex) or (1 shl secondIndex)

                // Calculate score of current pair of numbers, and the remaining array.
                val currScore = (pairsPicked + 1) * gcd(nums[firstIndex], nums[secondIndex])
                val remainingScore = backtrack(nums, newMask, pairsPicked + 1, memo)

                // Store the maximum score.
                maxScore = maxOf(maxScore, currScore + remainingScore)
                // We will use old mask in loop's next interation,
                // means we discarded the picked number and backtracked.
            }
        }

        // Store the result of the current sub-problem.
        memo[mask] = maxScore
        return maxScore
    }

    // Utility function to calculate the gcd of two numbers.
    private tailrec fun gcd(a: Int, b: Int): Int {
        return when (b) {
            0 -> a
            else -> gcd(b, a % b)
        }
    }
}
