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
        var result = 0

        val queue = ArrayDeque<String>()
        val visited = HashSet<String>()
        queue.offer("0000")

        while (queue.isNotEmpty()) {
            val size = queue.size
            for (rep in 0 until size) {
                val s = queue.poll()
                if (s == target) return result
                if (s in deads || !visited.add(s)) continue

                for (i in s.indices) {
                    val c = s[i] - '0'
                    queue.offer(buildString(s, c + 1, i))
                    queue.offer(buildString(s, c - 1, i))
                }
            }
            result++
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