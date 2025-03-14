package arrays.medium

import java.util.*

/**
 * You are given an integer array nums of length n and a 2D array queries where `queries[i] = [li, ri]`.
 *
 * Each `queries[i]` represents the following action on nums:
 * * Decrement the value at each index in the range [li, ri] in nums by at most 1.
 * * The amount by which the value is decremented can be chosen independently for each index.
 *
 * A Zero Array is an array with all its elements equal to 0.
 *
 * Return the maximum number of elements that can be removed from queries, such that nums can still be converted to a
 * zero array using the remaining queries. If it is not possible to convert nums to a zero array, return -1.
 *
 * [URL](https://leetcode.com/problems/zero-array-transformation-iii/)
 */
object ZeroArrayTransformationIII {
    fun maxRemoval(nums: IntArray, queries: Array<IntArray>): Int {
        val n = nums.size
        queries.sortBy { it[0] }

        val queue = PriorityQueue<Int> { i1, i2 -> i2 - i1 }
        val end = IntArray(n + 1)
        var cur = 0
        var query = 0
        for (i in 0..<n) {
            cur -= end[i]
            while (query < queries.size && queries[query][0] <= i) {
                queue.offer(queries[query][1])
                query++
            }
            while (cur < nums[i]) {
                if (queue.isEmpty() || queue.peek() < i) {
                    return -1
                }
                end[queue.poll() + 1]++
                cur++
            }
        }
        return queue.size
    }
}
