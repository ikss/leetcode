package medium

import java.util.*

/**
 * There is a party where n friends numbered from 0 to n - 1 are attending.
 * There is an infinite number of chairs in this party that are numbered from 0 to infinity.
 * When a friend arrives at the party, they sit on the unoccupied chair with the smallest number.
 *
 * * For example, if chairs 0, 1, and 5 are occupied when a friend comes, they will sit on chair number 2.
 *
 * When a friend leaves the party, their chair becomes unoccupied at the moment they leave.
 * If another friend arrives at that same moment, they can sit in that chair.
 *
 * You are given a 0-indexed 2D integer array times where `times[i] = [arrivali, leavingi]`,
 * indicating the arrival and leaving times of the ith friend respectively, and an integer targetFriend.
 * All arrival times are distinct.
 *
 * Return the chair number that the friend numbered targetFriend will sit on.
 *
 * [URL](https://leetcode.com/problems/the-number-of-the-smallest-unoccupied-chair/)
 */
object TheNumberOfTheSmallestUnoccupiedChair {
    fun smallestChair(times: Array<IntArray>, targetFriend: Int): Int {
        val freeChairs = PriorityQueue<Int>()
        var currChair = 0
        val ends = PriorityQueue<Pair<Int, Int>> { p1, p2 -> p1.first - p2.first }

        val sorted = times.withIndex().sortedBy { it.value[0] }
        for (i in sorted.indices) {
            val sortedFriend = sorted[i].index
            val (start, end) = sorted[i].value

            while (ends.isNotEmpty() && start >= ends.peek().first) {
                val chair = ends.poll().second
                if (currChair - 1 == chair) {
                    currChair--
                } else {
                    freeChairs.offer(chair)
                }
            }

            val chair = if (freeChairs.isNotEmpty()) freeChairs.poll() else currChair++
            if (sortedFriend == targetFriend) {
                return chair
            }

            ends.offer(end to chair)
        }

        return -1
    }
}
