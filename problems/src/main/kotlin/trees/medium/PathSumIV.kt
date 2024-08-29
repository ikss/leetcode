package trees.medium


/**
 * If the depth of a tree is smaller than 5, then this tree can be represented by an array of three-digit integers.
 * For each integer in this array:
 * * The hundreds digit represents the depth d of this node where 1 <= d <= 4.
 * * The tens digit represents the position p of this node in the level it belongs to where 1 <= p <= 8.
 * * The position is the same as that in a full binary tree.
 * * The units digit represents the value v of this node where 0 <= v <= 9.
 *
 * Given an array of ascending three-digit integers nums representing a binary tree with a depth smaller than 5,
 * return the sum of all paths from the root towards the leaves.
 *
 * It is guaranteed that the given array represents a valid connected binary tree.
 *
 * [URL](https://leetcode.com/problems/path-sum-iv/)
 */
object PathSumIV {

    fun pathSum(nums: IntArray): Int {
        if (nums.isEmpty()) return 0

        // Store the data in a hashmap, with the coordinates as the key and the
        // node value as the value
        val map = HashMap<Int, Int>()
        for (num in nums) {
            val key = num / 10
            val value = num % 10
            map[key] = value
        }

        return dfs(nums[0] / 10, 0, map)
    }

    private fun dfs(root: Int, preSum: Int, map: Map<Int, Int>): Int {
        // Find the level and position values from the coordinates
        val level = root / 10
        val pos = root % 10

        val left = (level + 1) * 10 + pos * 2 - 1
        val right = (level + 1) * 10 + pos * 2
        val currSum = preSum + map[root]!!

        // If the node is a leaf node, return its root to leaf path sum.
        if (!map.containsKey(left) && !map.containsKey(right)) {
            return currSum
        }

        val leftSum = if (map.containsKey(left)) dfs(left, currSum, map) else 0
        val rightSum = if (map.containsKey(right)) dfs(right, currSum, map) else 0

        return leftSum + rightSum
    }
}