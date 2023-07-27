package arrays.hard

import java.util.*

/**
 * You have n computers. You are given the integer n and a 0-indexed integer array batteries where the ith battery
 * can run a computer for `batteries[i]` minutes. You are interested in running all n computers simultaneously using
 * the given batteries.
 *
 * Initially, you can insert at most one battery into each computer. After that and at any integer time moment,
 * you can remove a battery from a computer and insert another battery any number of times. The inserted battery can be
 * a totally new battery or a battery from another computer. You may assume that the removing and inserting processes
 * take no time.
 *
 * Note that the batteries cannot be recharged.
 *
 * Return the maximum number of minutes you can run all the n computers simultaneously.
 *
 * [URL](https://leetcode.com/problems/maximum-running-time-of-n-computers/)
 */
object MaximumRunningTimeOfNComputers {

    fun maxRunTimePrefixSum(n: Int, batteries: IntArray): Long {
        // Get the sum of all extra batteries.
        batteries.sort()
        var extra = 0L
        for (i in 0 until batteries.size - n) {
            extra += batteries[i]
        }

        // live stands for the n largest batteries we chose for n computers.
        val live = Arrays.copyOfRange(batteries, batteries.size - n, batteries.size)

        // We increase the total running time using 'extra' by increasing
        // the running time of the computer with the smallest battery.
        for (i in 0 until n - 1) {
            val nextDelta = (i + 1L) * (live[i + 1] - live[i])
            // If the target running time is between live[i] and live[i + 1].
            if (extra < nextDelta) {
                return live[i] + extra / (i + 1)
            }

            // Reduce 'extra' by the total power used.
            extra -= nextDelta
        }

        // If there is power left, we can increase the running time
        // of all computers.
        return live[n - 1] + extra / n
    }

    fun maxRunTimeBinarySearch(n: Int, batteries: IntArray): Long {
        var sumPower = 0L
        for (b in batteries) {
            sumPower += b.toLong()
        }
        var left = 1L
        var right = sumPower / n
        while (left < right) {
            val target = right - (right - left) / 2
            var extra = 0L
            for (b in batteries) {
                extra += minOf(b.toLong(), target)
            }
            if (extra >= (n * target)) {
                left = target
            } else {
                right = target - 1
            }
        }
        return left
    }

    // TLE for large input
    fun maxRunTimePriorityQueue(n: Int, batteries: IntArray): Long {
        val pq = PriorityQueue<Int>(Collections.reverseOrder())

        for (b in batteries) {
            pq.offer(b)
        }

        var result = 0L
        while (pq.size >= n) {
            val list = ArrayList<Int>(n)
            for (i in 0 until n) {
                val battery = pq.poll()
                list.add(battery)
            }
            val last = list[n - 1]
            val next = if (pq.isEmpty()) 0 else pq.peek()
            val delta = maxOf(last - next, 1)

            for (used in list) {
                if (used > delta) pq.offer(used - delta)
            }
            result += delta
        }

        return result
    }
}
