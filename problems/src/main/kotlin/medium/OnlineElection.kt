package medium

import java.util.*

/**
 * You are given two integer arrays persons and times. In an election, the ith vote was cast for `persons[i]` at time
 * `times[i]`.
 *
 * For each query at a time t, find the person that was leading the election at time t. Votes cast at time t will count
 * towards our query. In the case of a tie, the most recent vote (among tied candidates) wins.
 *
 * Implement the TopVotedCandidate class:
 * * TopVotedCandidate(int[] persons, int[] times) Initializes the object with the persons and times arrays.
 * * int q(int t) Returns the number of the person that was leading the election at time t
 * according to the mentioned rules.
 *
 * [URL](https://leetcode.com/problems/online-election/)
 */
object OnlineElection {
    class TopVotedCandidate(persons: IntArray, times: IntArray) {
        private val votes = HashMap<Int, TreeMap<Int, Int>>()

        init {
            for (i in persons.indices) {
                val p = persons[i]
                val t = times[i]

                val casts = votes.computeIfAbsent(p) { TreeMap() }

                casts[t] = 1 + (casts.floorEntry(t)?.value ?: 0)
            }
        }

        fun q(t: Int): Int {
            var result = 0
            var maxVotes = 0
            var maxTime = 0

            for ((p, v) in votes.entries) {
                val (time, count) = v.floorEntry(t) ?: continue
                if (count > maxVotes || (count == maxVotes && time > maxTime)) {
                    result = p
                    maxVotes = count
                    maxTime = time
                }
            }
            return result
        }
    }
}