package easy

import java.util.*

/**
 * You are given an array of integers stones where `stones[i]` is the weight of the ith stone.
 *
 * We are playing a game with the stones. On each turn, we choose the heaviest two stones and smash them together.
 * Suppose the heaviest two stones have weights x and y with x <= y. The result of this smash is:
 * * If x == y, both stones are destroyed, and
 * * If x != y, the stone of weight x is destroyed, and the stone of weight y has new weight y - x.
 *
 * At the end of the game, there is at most one stone left.
 *
 * Return the weight of the last remaining stone. If there are no stones left, return 0.
 *
 * [URL](https://leetcode.com/problems/last-stone-weight/)
 */
object LastStoneWeight {
    fun lastStoneWeight(stones: IntArray): Int {
        val q = PriorityQueue<Int>(Collections.reverseOrder())

        for (s in stones) {
            q.offer(s)
        }

        while (q.size > 1) {
            val s1 = q.poll()
            val s2 = q.poll()
            if (s1 != s2) q.offer(s1 - s2)
        }
        return if (q.isEmpty()) 0 else q.poll()
    }
}
