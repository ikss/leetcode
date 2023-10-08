package arrays.hard

/**
 * Given two arrays nums1 and nums2.
 *
 * Return the maximum dot product between non-empty subsequences of nums1 and nums2 with the same length.
 *
 * A subsequence of a array is a new array which is formed from the original array by deleting some (can be none)
 * of the characters without disturbing the relative positions of the remaining characters.
 * (ie, `[2,3,5]` is a subsequence of `[1,2,3,4,5]` while `[1,5,3]` is not).
 *
 * [URL](https://leetcode.com/problems/max-dot-product-of-two-subsequences/)
 */
object MaxDotProductOfTwoSubsequences {
    fun maxDotProduct(nums1: IntArray, nums2: IntArray): Int {
        var nums1Max = Int.MIN_VALUE
        var nums1Min = Int.MAX_VALUE
        var nums2Max = Int.MIN_VALUE
        var nums2Min = Int.MAX_VALUE

        for (n in nums1) {
            nums1Max = maxOf(nums1Max, n)
            nums1Min = minOf(nums1Min, n)
        }

        for (n in nums2) {
            nums2Max = maxOf(nums2Max, n)
            nums2Min = minOf(nums2Min, n)
        }

        if (nums1Max < 0 && nums2Min > 0) {
            return nums1Max * nums2Min
        } else if (nums2Max < 0 && nums1Min > 0) {
            return nums2Max * nums1Min
        }

        val memo = Array(nums1.size) { IntArray(nums2.size) { Int.MIN_VALUE } }
        return dp(0, 0, nums1, nums2, memo)
    }

    private fun dp(i: Int, j: Int, nums1: IntArray, nums2: IntArray, memo: Array<IntArray>): Int {
        if (i == nums1.size || j == nums2.size) {
            return 0
        }

        if (memo[i][j] != Int.MIN_VALUE) {
            return memo[i][j]
        }

        val use = nums1[i] * nums2[j] + dp(i + 1, j + 1, nums1, nums2, memo)

        memo[i][j] = maxOf(
            use,
            dp(i + 1, j, nums1, nums2, memo),
            dp(i, j + 1, nums1, nums2, memo),
        )
        return memo[i][j]
    }
}
