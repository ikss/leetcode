package medium

import java.util.*

/**
 * You are given an array of strings nums and an integer k. Each string in nums represents an integer without leading zeros.
 *
 * Return the string that represents the kth largest integer in nums.
 *
 * Note: Duplicate numbers should be counted distinctly. For example, if nums is `["1","2","2"]`,
 * "2" is the first largest integer, "2" is the second-largest integer, and "1" is the third-largest integer.
 *
 * [URL](https://leetcode.com/problems/find-the-kth-largest-integer-in-the-array/)
 */
object FindTheKthLargestIntegerInTheArray {
    fun kthLargestNumber(nums: Array<String>, k: Int): String {
        val queue = PriorityQueue<String> { i1, i2 ->
            if (i1.length == i2.length) {
                i1.compareTo(i2)
            } else {
                i1.length - i2.length
            }
        }

        for (n in nums) {
            queue.offer(n)
            if (queue.size > k) {
                queue.poll()
            }
        }

        return queue.poll()
    }
}
