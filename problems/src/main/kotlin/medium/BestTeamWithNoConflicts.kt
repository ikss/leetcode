package medium

/**
 * You are the manager of a basketball team. For the upcoming tournament, you want to choose the team with the highest
 * overall score. The score of the team is the sum of scores of all the players in the team.
 *
 * However, the basketball team is not allowed to have conflicts. A conflict exists if a younger player has a strictly
 * higher score than an older player. A conflict does not occur between players of the same age.
 *
 * Given two lists, scores and ages, where each `scores[i]` and `ages[i]` represents the score and age of the ith player,
 * respectively, return the highest overall score of all possible basketball teams.
 *
 * [URL](https://leetcode.com/problems/best-team-with-no-conflicts/)
 */
object BestTeamWithNoConflicts {
    fun bestTeamScore(scores: IntArray, ages: IntArray): Int {
        val n = ages.size
        val ageScorePair = Array(n) { ages[it] to scores[it] }

        // Sort in ascending order of age and then by score.
        val comparator = Comparator<Pair<Int, Int>> { a, b ->
            if (a.first == b.first) a.second - b.second else a.first - b.first
        }
        ageScorePair.sortWith(comparator)
        return findMaxScore(ageScorePair)
    }

    private fun findMaxScore(ageScorePair: Array<Pair<Int, Int>>): Int {
        val n = ageScorePair.size
        var answer = 0
        val dp = IntArray(n)
        // Initially, the maximum score for each player will be equal to the individual scores.
        for (i in 0 until n) {
            dp[i] = ageScorePair[i].second
            answer = maxOf(answer, dp[i])
        }
        for (i in 0 until n) {
            for (j in i - 1 downTo 0) {
                // If the players j and i could be in the same team.
                if (ageScorePair[i].second >= ageScorePair[j].second) {
                    // Update the maximum score for the ith player.
                    dp[i] = maxOf(dp[i], ageScorePair[i].second + dp[j])
                }
            }
            // Maximum score among all the players.
            answer = maxOf(answer, dp[i])
        }
        return answer
    }
}