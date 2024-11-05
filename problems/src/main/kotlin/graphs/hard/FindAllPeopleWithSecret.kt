package graphs.hard

import data_structures.UnionFind
import java.util.*

/**
 * You are given an integer n indicating there are n people numbered from 0 to n - 1.
 * You are also given a 0-indexed 2D integer array meetings where` meetings[i] = [xi, yi, timei]` indicates that person
 * xi and person yi have a meeting at timei. A person may attend multiple meetings at the same time.
 * Finally, you are given an integer firstPerson.
 *
 * Person 0 has a secret and initially shares the secret with a person firstPerson at time 0.
 * This secret is then shared every time a meeting takes place with a person that has the secret.
 * More formally, for every meeting, if a person xi has the secret at timei, then they will share the secret
 * with person yi, and vice versa.
 *
 * The secrets are shared instantaneously. That is, a person may receive the secret and share it with people in other
 * meetings within the same time frame.
 *
 * Return a list of all the people that have the secret after all the meetings have taken place.
 * You may return the answer in any order.
 *
 * [URL](https://leetcode.com/problems/find-all-people-with-secret/)
 */
object FindAllPeopleWithSecret {
    fun findAllPeople(n: Int, meetings: Array<IntArray>, firstPerson: Int): List<Int> {
        // Group Meetings in increasing order of time
        val sameTimeMeetings = TreeMap<Int, ArrayList<Pair<Int, Int>>>()
        for ((p1, p2, t) in meetings) {
            sameTimeMeetings.computeIfAbsent(t) { ArrayList() }.add(p1 to p2)
        }

        // Create graph
        val graph = UnionFind(n)
        graph.union(firstPerson, 0)

        // Process in increasing order of time
        for ((_, v) in sameTimeMeetings) {
            // Unite two persons taking part in a meeting
            for ((p1, p2) in v) {
                graph.union(p1, p2)
            }

            // If any one knows the secret, both will be connected to 0.
            // If no one knows the secret, then reset.
            for ((p1, p2) in v) {
                if (!graph.areConnected(p1, 0)) {
                    // No need to check for y since x and y were united
                    graph.reset(p1)
                    graph.reset(p2)
                }
            }
        }

        // Al those who are connected to 0 will know the secret
        val ans = ArrayList<Int>()
        for (i in 0 until n) {
            if (graph.areConnected(i, 0)) {
                ans.add(i)
            }
        }
        return ans
    }
}
