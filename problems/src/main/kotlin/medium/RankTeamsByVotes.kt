package medium

import java.util.*

/**
 * In a special ranking system, each voter gives a rank from highest to lowest to all teams participating in the competition.
 *
 * The ordering of teams is decided by who received the most position-one votes. If two or more teams tie in the first
 * position, we consider the second position to resolve the conflict, if they tie again, we continue this process until
 * the ties are resolved. If two or more teams are still tied after considering all positions,
 * we rank them alphabetically based on their team letter.
 *
 * You are given an array of strings votes which is the votes of all voters in the ranking systems. Sort all teams
 * according to the ranking system described above.
 *
 * Return a string of all teams sorted by the ranking system.
 *
 * [URL](https://leetcode.com/problems/rank-teams-by-votes/)
 */
object RankTeamsByVotes {
    fun rankTeams(votes: Array<String>): String {
        val maxVote = votes[0].length

        val voteCounts = HashMap<Char, IntArray>()

        for (vote in votes) {
            for (i in vote.indices) {
                val team = vote[i]
                val curr = voteCounts.computeIfAbsent(team) { IntArray(maxVote) }
                curr[i]++
            }
        }

        return voteCounts.entries.sortedWith { e1, e2 -> compareArrays(e1.value, e2.value) }.map { it.key }.joinToString("")
    }

    private fun compareArrays(arr1: IntArray, arr2: IntArray): Int {
        for (i in arr1.indices) {
            if (arr1[i] > arr2[i]) {
                return -1
            } else if (arr1[i] < arr2[i]) {
                return 1
            }
        }
        return 0
    }
}