package medium

/**
 * Given a 2D integer array nums, return all elements of nums in diagonal order as shown in the below images.
 *
 * [URL](https://leetcode.com/problems/diagonal-traverse-ii/)
 */
object DiagonalTraverseII {
    fun findDiagonalOrder(nums: List<List<Int>>): IntArray {
        val queue = java.util.ArrayDeque<Pair<Int, Int>>()
        queue.offer(0 to 0)

        val result = ArrayList<Int>()
        while (queue.isNotEmpty()) {
            val (row, col) = queue.poll()
            result.add(nums[row][col])

            if (col == 0 && row + 1 < nums.size) {
                queue.offer(row + 1 to 0)
            }
            if (col + 1 < nums[row].size) {
                queue.offer(row to col + 1)
            }
        }
        return result.toIntArray()
    }
}