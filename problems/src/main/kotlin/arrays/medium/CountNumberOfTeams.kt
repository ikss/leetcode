package arrays.medium

/**
 * There are n soldiers standing in a line. Each soldier is assigned a unique rating value.
 *
 * You have to form a team of 3 soldiers amongst them under the following rules:
 *
 *  * Choose 3 soldiers with index (i, j, k) with rating `(rating[i], rating[j], rating[k])`.
 *  * A team is valid if: `(rating[i] < rating[j] < rating[k])` or `(rating[i] > rating[j] > rating[k])` where
 * (0 <= i < j < k < n).
 *
 * Return the number of teams you can form given the conditions. (soldiers can be part of multiple teams).
 *
 * [URL](https://leetcode.com/problems/count-number-of-teams/)
 */
object CountNumberOfTeams {
    fun numTeams(rating: IntArray): Int {
        val n = rating.size
        var teams = 0

        for (mid in 0 until n) {
            var leftSmaller = 0
            var rightLarger = 0

            for (left in mid - 1 downTo 0) {
                if (rating[left] < rating[mid]) {
                    leftSmaller++
                }
            }

            for (right in mid + 1 until n) {
                if (rating[right] > rating[mid]) {
                    rightLarger++
                }
            }

            teams += leftSmaller * rightLarger

            val leftLarger = mid - leftSmaller
            val rightSmaller = n - mid - 1 - rightLarger

            teams += leftLarger * rightSmaller
        }

        return teams
    }
}
