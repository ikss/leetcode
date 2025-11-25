package hard

/**
 * There is an undirected connected tree with n nodes labeled from 0 to n - 1 and n - 1 edges.
 *
 * You are given a 0-indexed integer array nums of length n where `nums[i]` represents the value of the ith node.
 * You are also given a 2D integer array edges of length n - 1 where edges[i] = [ai, bi] indicates that there is an edge between nodes ai and bi in the tree.
 *
 * Remove two distinct edges of the tree to form three connected components. For a pair of removed edges,
 * the following steps are defined:
 *
 * 1. Get the XOR of all the values of the nodes for each of the three components respectively.
 * 2. The difference between the largest XOR value and the smallest XOR value is the score of the pair.
 * 3. For example, say the three components have the node values: `[4,5,7]`, `[1,9]`, and `[3,3,3]`.
 * The three XOR values are 4 ^ 5 ^ 7 = 6, 1 ^ 9 = 8, and 3 ^ 3 ^ 3 = 3.
 * The largest XOR value is 8 and the smallest XOR value is 3. The score is then 8 - 3 = 5.
 *
 * Return the minimum score of any possible pair of edge removals on the given tree.
 *
 * [URL](https://leetcode.com/problems/minimum-score-after-removals-on-a-tree/)
 */
object MinimumScoreAfterRemovalsOnTree {
    private var result: Int = Int.MAX_VALUE

    fun minimumScore(nums: IntArray, edges: Array<IntArray>): Int {
        result = Int.MAX_VALUE

        var sum = 0
        val e = ArrayList<ArrayList<Int>>()
        for (x in nums) {
            e.add(ArrayList())
            sum = sum xor x
        }

        for ((start, end) in edges) {
            e[start].add(end)
            e[end].add(start)
        }

        dfs(0, -1, nums, e, sum)
        return result
    }

    private fun dfs(x: Int, f: Int, nums: IntArray, e: List<List<Int>>, sum: Int): Int {
        var son = nums[x]
        for (y in e[x]) {
            if (y == f) {
                continue
            }
            son = son xor dfs(y, x, nums, e, sum)
        }

        for (y in e[x]) {
            if (y == f) {
                dfs2(y, x, son, x, nums, e, sum)
            }
        }
        return son
    }

    private fun dfs2(x: Int, f: Int, oth: Int, anc: Int, nums: IntArray, e: List<List<Int>>, sum: Int): Int {
        var son = nums[x]
        for (y in e[x]) {
            if (y == f) {
                continue
            }
            son = son xor dfs2(y, x, oth, anc, nums, e, sum)
        }
        if (f == anc) {
            return son
        }
        val part3 = sum xor oth xor son
        val newResult = maxOf(oth, maxOf(son, part3)) - minOf(oth, minOf(son, part3))
        result = minOf(result, newResult)

        return son
    }
}
