package medium

import java.util.*

/**
 * Given an array of non-negative integers arr, you are initially positioned at start index of the array.
 * When you are at index i, you can jump to `i + arr[i] or i - arr[i]`, check if you can reach any index with value 0.
 *
 * Notice that you can not jump outside of the array at any time.
 *
 * [URL](https://leetcode.com/problems/jump-game-iii/)
 */
object JumpGameIII {
    fun canReach(arr: IntArray, start: Int): Boolean {
        val queue = ArrayDeque<Int>()
        queue.offer(start)
        val visited = HashSet<Int>()

        while (queue.isNotEmpty()) {
            val curr = queue.poll()
            if (!visited.add(curr)) {
                continue
            }
            val num = arr[curr]
            if (num == 0) return true
            val left = curr - num
            val right = curr + num
            if (left >= 0) queue.offer(left)
            if (right < arr.size) queue.offer(right)
        }

        return false
    }
}
