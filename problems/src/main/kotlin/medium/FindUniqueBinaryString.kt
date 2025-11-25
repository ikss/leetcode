package medium

/**
 * Given an array of strings nums containing n unique binary strings each of length n,
 * return a binary string of length n that does not appear in nums.
 * If there are multiple answers, you may return any of them.
 *
 * [URL](https://leetcode.com/problems/find-unique-binary-string/)
 */
object FindUniqueBinaryString {
    fun findDifferentBinaryString(nums: Array<String>): String {
        val ans = StringBuilder()
        for (i in nums.indices) {
            val curr = nums[i][i]
            ans.append(if (curr == '0') '1' else '0')
        }

        return ans.toString()
    }
}