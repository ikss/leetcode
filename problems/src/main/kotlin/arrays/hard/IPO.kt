package arrays.hard

import java.util.*


/**
 * Suppose LeetCode will start its IPO soon. In order to sell a good price of its shares to Venture Capital,
 * LeetCode would like to work on some projects to increase its capital before the IPO. Since it has limited resources,
 * it can only finish at most k distinct projects before the IPO. Help LeetCode design the best way to maximize its
 * total capital after finishing at most k distinct projects.
 *
 * You are given n projects where the ith project has a pure profit `profits[i]` and a minimum capital of `capital[i]`
 * is needed to start it.
 *
 * Initially, you have w capital. When you finish a project, you will obtain its pure profit and the profit will be
 * added to your total capital.
 *
 * Pick a list of at most k distinct projects from given projects to maximize your final capital, and return the
 * final maximized capital.
 *
 * The answer is guaranteed to fit in a 32-bit signed integer.
 *
 * [URL](https://leetcode.com/problems/ipo/)
 */
object IPO {
    internal class Project(var capital: Int, var profit: Int) : Comparable<Project> {
        override operator fun compareTo(other: Project): Int {
            return capital - other.capital
        }
    }

    fun findMaximizedCapital(k: Int, w: Int, profits: IntArray, capital: IntArray): Int {
        var w = w
        val n = profits.size
        val projects = Array(n) { Project(capital[it], profits[it]) }
        projects.sort()

        // PriorityQueue is a min heap, but we need a max heap, so we use Collections.reverseOrder()
        val q = PriorityQueue(n, Collections.reverseOrder<Int>())
        var ptr = 0
        for (i in 0 until k) {
            while (ptr < n && projects[ptr].capital <= w) {
                q.add(projects[ptr++].profit)
            }
            if (q.isEmpty()) {
                break
            }
            w += q.poll()
        }
        return w
    }
}
