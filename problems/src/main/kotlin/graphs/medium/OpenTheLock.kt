package graphs.medium

import java.util.*

/**
 * You have a lock in front of you with 4 circular wheels. Each wheel has 10 slots:
 * '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'.
 * The wheels can rotate freely and wrap around: for example we can turn '9' to be '0', or '0' to be '9'.
 * Each move consists of turning one wheel one slot.
 *
 * The lock initially starts at '0000', a string representing the state of the 4 wheels.
 *
 * You are given a list of deadends dead ends, meaning if the lock displays any of these codes,
 * the wheels of the lock will stop turning and you will be unable to open it.
 *
 * Given a target representing the value of the wheels that will unlock the lock, return the minimum total number of
 * turns required to open the lock, or -1 if it is impossible.
 *
 * [URL](https://leetcode.com/problems/open-the-lock/)
 */
object OpenTheLock {
    fun openLock(deadends: Array<String>, target: String): Int {
        val deads = deadends.toSet()

        val queue = PriorityQueue<Pair<Int, String>> { e1, e2 -> e1.first.compareTo(e2.first) }
        val visited = HashSet<String>()
        queue.offer(0 to "0000")

        while (queue.isNotEmpty()) {
            val (steps, s) = queue.poll()
            if (s == target) return steps
            if (s in deads || s in visited) continue

            for (i in s.indices) {
                val next = buildString(s, s[i] - '0' + 1, i)
                if (next !in deads && next !in visited) {
                    queue.offer(steps + 1 to next)
                }
                val prev = buildString(s, s[i] - '0' - 1, i)
                if (prev !in deads && prev !in visited) {
                    queue.offer(steps + 1 to prev)
                }
            }
        }
        return -1
    }

    private fun buildString(s: String, n: Int, i: Int): String {
        val n = when (n) {
            10 -> 0
            -1 -> 9
            else -> n
        }
        return s.replaceRange(i, i + 1, n.toString())
    }
}