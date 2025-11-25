package medium

/**
 * You are given an integer array values where `values[i]` represents the value of the ith sightseeing spot.
 * Two sightseeing spots i and j have a distance j - i between them.
 *
 * The score of a pair (i < j) of sightseeing spots is `values[i] + values[j] + i - j`: the sum of the values of the
 * sightseeing spots, minus the distance between them.
 *
 * Return the maximum score of a pair of sightseeing spots.
 *
 * [URL](https://leetcode.com/problems/best-sightseeing-pair/)
 */
object BestSightseeingPair {
    fun maxScoreSightseeingPair(values: IntArray): Int {
        val n = values.size

        var maxLeftScore = values[0]

        var maxScore = 0

        for (i in 1 until n) {
            val value = values[i]
            val currentRightScore = value - i
            maxScore = maxOf(maxScore, maxLeftScore + currentRightScore)

            val currentLeftScore = value + i
            maxLeftScore = maxOf(maxLeftScore, currentLeftScore)
        }

        return maxScore
    }
}