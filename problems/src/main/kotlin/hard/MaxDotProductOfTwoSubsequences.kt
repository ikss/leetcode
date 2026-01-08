package hard

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
    fun maxDotProductDpTopDown(nums1: IntArray, nums2: IntArray): Int {
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
        return dpTopDown(0, 0, nums1, nums2, memo)
    }

    private fun dpTopDown(i: Int, j: Int, nums1: IntArray, nums2: IntArray, memo: Array<IntArray>): Int {
        if (i == nums1.size || j == nums2.size) {
            return 0
        }

        if (memo[i][j] != Int.MIN_VALUE) {
            return memo[i][j]
        }

        val use = nums1[i] * nums2[j] + dpTopDown(i + 1, j + 1, nums1, nums2, memo)

        memo[i][j] = maxOf(
            use,
            dpTopDown(i + 1, j, nums1, nums2, memo),
            dpTopDown(i, j + 1, nums1, nums2, memo),
        )
        return memo[i][j]
    }

    fun maxDotProductDpBottomUp(nums1: IntArray, nums2: IntArray): Int {
        var max1 = Int.MIN_VALUE
        var min1 = Int.MAX_VALUE
        var max2 = Int.MIN_VALUE
        var min2 = Int.MAX_VALUE

        for (n in nums1) {
            max1 = maxOf(max1, n)
            min1 = minOf(min1, n)
        }
        for (n in nums2) {
            max2 = maxOf(max2, n)
            min2 = minOf(min2, n)
        }

        if (max1 < 0 && min2 > 0) {
            return max1 * min2
        }

        if (max2 < 0 && min1 > 0) {
            return max2 * min1
        }

        val dp = Array(nums1.size + 1) { IntArray(nums2.size + 1) }

        for (i1 in nums1.size - 1 downTo 0) {
            for (i2 in nums2.size - 1 downTo 0) {
                dp[i1][i2] = maxOf(dp[i1 + 1][i2 + 1] + nums1[i1] * nums2[i2], dp[i1 + 1][i2], dp[i1][i2 + 1])
            }
        }

        return dp[0][0]
    }
}
