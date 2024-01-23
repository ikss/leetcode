package arrays.medium

import java.util.*

/**
 * You have some number of sticks with positive integer lengths. These lengths are given as an array sticks,
 * where `sticks[i]` is the length of the ith stick.
 *
 * You can connect any two sticks of lengths x and y into one stick by paying a cost of x + y.
 * You must connect all the sticks until there is only one stick remaining.
 *
 * Return the minimum cost of connecting all the given sticks into one stick in this way.
 *
 * [URL](https://leetcode.com/problems/minimum-cost-to-connect-sticks)
 */
object MinimumCostToConnectSticks {
    fun connectSticks(sticks: IntArray): Int {
        val queue = PriorityQueue<Int>()

        for (s in sticks) {
            queue.offer(s)
        }

        var sum = 0
        while (queue.size > 1) {
            val s1 = queue.poll()
            val s2 = queue.poll()
            val s = s1 + s2
            sum += s
            queue.offer(s)
        }

        return sum
    }
}