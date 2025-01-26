package graphs.hard

import java.util.*


/**
 * A company is organizing a meeting and has a list of n employees, waiting to be invited.
 * They have arranged for a large circular table, capable of seating any number of employees.
 *
 * The employees are numbered from 0 to n - 1. Each employee has a favorite person and they will attend the meeting
 * only if they can sit next to their favorite person at the table. The favorite person of an employee is not themself.
 *
 * Given a 0-indexed integer array favorite, where `favorite[i]` denotes the favorite person of the ith employee,
 * return the maximum number of employees that can be invited to the meeting.
 *
 * [URL](https://leetcode.com/problems/maximum-employees-to-be-invited-to-a-meeting/)
 */
object MaximumEmployeesToBeInvitedToMeeting {
    fun maximumInvitations(favorite: IntArray): Int {
        val n = favorite.size
        val inDegree = IntArray(n)

        for (person in 0..<n) {
            inDegree[favorite[person]]++
        }

        val q = java.util.ArrayDeque<Int>()
        for (person in 0..<n) {
            if (inDegree[person] == 0) {
                q.offer(person)
            }
        }

        val depth = IntArray(n) { 1 }

        while (q.isNotEmpty()) {
            val curr = q.poll()
            val next = favorite[curr]
            depth[next] = maxOf(depth[next], depth[curr] + 1)
            if (--inDegree[next] == 0) {
                q.offer(next)
            }
        }

        var result = 0
        var twoCycleInvitations = 0

        // Detect cycles
        for (person in 0..<n) {
            if (inDegree[person] == 0) continue

            var cycleLength = 0
            var current = person
            while (inDegree[current] != 0) {
                inDegree[current] = 0
                cycleLength++
                current = favorite[current]
            }

            if (cycleLength == 2) {
                twoCycleInvitations += depth[person] + depth[favorite[person]]
            } else {
                result = maxOf(result, cycleLength)
            }
        }

        return maxOf(result, twoCycleInvitations)
    }
}
