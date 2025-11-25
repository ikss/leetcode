package medium

import java.util.*

/**
 * You are given a 0-indexed integer array nums and an integer k.
 *
 * You are initially standing at index 0. In one move, you can jump at most k steps forward without going outside
 * the boundaries of the array. That is, you can jump from index i to any index in the range
 * `[i + 1, min(n - 1, i + k)]` inclusive.
 *
 * You want to reach the last index of the array (index n - 1). Your score is the sum of all `nums[j]` for each index j
 * you visited in the array.
 *
 * Return the maximum score you can get.
 *
 * [URL](https://leetcode.com/problems/jump-game-vi/)
 */
object JumpGameVI {
    fun maxResult(nums: IntArray, k: Int): Int {
        if (nums.size == 1) return nums[0]
        val dp = IntArray(nums.size) { Int.MIN_VALUE }
        dp[0] = nums[0]
        for (i in nums.indices) {
            for (jump in 1..k) {
                if (i + jump >= nums.size) {
                    break
                }
                dp[i + jump] = maxOf(dp[i] + nums[i + jump], dp[i + jump])
            }
        }
        return dp[nums.size - 1]
    }

    fun maxResultOpt(nums: IntArray, k: Int): Int {
        val deque = LinkedList<Pair<Int, Int>>()
        deque.offer(Pair(0, nums[0]))
        var max = nums[0]
        for (i in 1 until nums.size) {
            while (!deque.isEmpty() && deque.peekFirst().first < i - k) {
                deque.pollFirst()
            }
            max = nums[i] + if (deque.isEmpty()) 0 else deque.peekFirst().second
            while (!deque.isEmpty() && deque.peekLast().second <= max) {
                deque.pollLast()
            }
            deque.offerLast(Pair(i, max))
        }
        return max
    }
}
