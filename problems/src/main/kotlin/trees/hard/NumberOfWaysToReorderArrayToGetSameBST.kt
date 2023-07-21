package trees.hard

/**
 * Given an array nums that represents a permutation of integers from 1 to n. We are going to construct a binary search
 * tree (BST) by inserting the elements of nums in order into an initially empty BST. Find the number of different ways
 * to reorder nums so that the constructed BST is identical to that formed from the original array nums.
 *
 * For example, given `nums = [2,1,3]`, we will have 2 as the root, 1 as a left child, and 3 as a right child.
 * The array `[2,3,1]` also yields the same BST but `[3,2,1]` yields a different BST.
 * Return the number of ways to reorder nums such that the BST formed is identical to the original BST formed from nums.
 *
 * Since the answer may be very large, return it modulo 10^9 + 7.
 *
 * [URL](https://leetcode.com/problems/number-of-ways-to-reorder-array-to-get-same-bst/)
 */
object NumberOfWaysToReorderArrayToGetSameBST {
    private const val MOD = 1_000_000_007
    fun numOfWays(nums: IntArray): Int {
        val m = nums.size

        // Table of Pascal's triangle
        val table = Array(m) { LongArray(m) }
        for (i in 0 until m) {
            table[i][i] = 1
            table[i][0] = table[i][i]
        }
        for (i in 2 until m) {
            for (j in 1 until i) {
                table[i][j] = (table[i - 1][j - 1] + table[i - 1][j]) % MOD
            }
        }
        val arrList = nums.toList()
        return dfs(arrList, table).toInt() - 1
    }

    private fun dfs(nums: List<Int>, table: Array<LongArray>): Long {
        val m = nums.size
        if (m < 3) {
            return 1
        }
        val leftNodes = ArrayList<Int>()
        val rightNodes = ArrayList<Int>()
        for (i in 1 until m) {
            if (nums[i] < nums[0]) {
                leftNodes.add(nums[i])
            } else {
                rightNodes.add(nums[i])
            }
        }
        val leftWays = dfs(leftNodes, table)
        val rightWays = dfs(rightNodes, table)
        return (leftWays * rightWays % MOD * table[m - 1][leftNodes.size]) % MOD
    }
}
