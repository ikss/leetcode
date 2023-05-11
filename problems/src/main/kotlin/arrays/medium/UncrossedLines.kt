package arrays.medium

/**
 * You are given two integer arrays nums1 and nums2. We write the integers of nums1 and nums2
 * (in the order they are given) on two separate horizontal lines.
 *
 * We may draw connecting lines: a straight line connecting two numbers `nums1[i]` and `nums2[j]` such that:
 * * `nums1[i] == nums2[j]`, and
 * * the line we draw does not intersect any other connecting (non-horizontal) line.
 *
 * Note that a connecting line cannot intersect even at the endpoints
 * (i.e., each number can only belong to one connecting line).
 *
 * Return the maximum number of connecting lines we can draw in this way.
 *
 * [URL](https://leetcode.com/problems/uncrossed-lines/)
 */
object UncrossedLines {
    fun maxUncrossedLines(nums1: IntArray, nums2: IntArray): Int {
        var l1 = nums1.size
        var l2 = nums2.size

        val dp = Array(l1 + 1) { IntArray(l2 + 1) }

        for (i in 0 until l1) {
            for (j in 0 until l2) {
                dp[i + 1][j + 1] = if (nums1[i] == nums2[j]) {
                    dp[i][j] + 1
                } else {
                    maxOf(dp[i + 1][j], dp[i][j + 1])
                }
            }
        }

        return dp[l1][l2]
    }
}
