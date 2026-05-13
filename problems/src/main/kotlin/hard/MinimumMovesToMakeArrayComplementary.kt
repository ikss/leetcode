package hard

/**
 * You are given an integer array nums of even length n and an integer limit.
 * In one move, you can replace any integer from nums with another integer between 1 and limit, inclusive.
 *
 * The array nums is complementary if for all indices i (0-indexed), `nums[i] + nums[n - 1 - i]` equals the same number.
 * For example, the array `[1,2,3,4]` is complementary because for all indices i, `nums[i] + nums[n - 1 - i] = 5`.
 *
 * Return the minimum number of moves required to make nums complementary.
 *
 * [URL](https://leetcode.com/problems/minimum-moves-to-make-array-complementary/)
 */
object MinimumMovesToMakeArrayComplementary {
    fun minMoves(nums: IntArray, limit: Int): Int {
        val n = nums.size
        val diff = IntArray(2 * limit + 2)

        for (i in 0 until n / 2) {
            val a = minOf(nums[i], nums[n - 1 - i])
            val b = maxOf(nums[i], nums[n - 1 - i])

            diff[2] += 2
            diff[a + 1] -= 1
            diff[a + b] -= 1
            diff[a + b + 1] += 1
            diff[b + limit + 1] += 1
        }

        var result = n
        var currentOps = 0

        for (c in 2..2 * limit) {
            currentOps += diff[c]
            result = minOf(result, currentOps)
        }

        return result
    }
}
