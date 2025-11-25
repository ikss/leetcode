package hard

/**
 * We have n buildings numbered from 0 to n - 1. Each building has a number of employees.
 * It's transfer season, and some employees want to change the building they reside in.
 *
 * You are given an array requests where `requests[i] = [fromi, toi]` represents an employee's request to transfer from
 * building fromi to building toi.
 *
 * All buildings are full, so a list of requests is achievable only if for each building, the net change in employee
 * transfers is zero. This means the number of employees leaving is equal to the number of employees moving in.
 * For example if n = 3 and two employees are leaving building 0, one is leaving building 1, and one is leaving
 * building 2, there should be two employees moving to building 0, one employee moving to building 1,
 * and one employee moving to building 2.
 *
 * Return the maximum number of achievable requests.
 *
 * [URL](https://leetcode.com/problems/maximum-number-of-achievable-transfer-requests/)
 */
object MaximumNumberOfAchievableTransferRequests {

    fun maximumRequests(n: Int, requests: Array<IntArray>): Int {
        val indegree = IntArray(n)
        return backtrack(requests, indegree, n, 0, 0)
    }

    private fun backtrack(requests: Array<IntArray>, indegree: IntArray, n: Int, index: Int, count: Int): Int {
        if (index == requests.size) {
            // Check if all buildings have an in-degree of 0.
            if (indegree.any { it != 0 }) {
                return 0
            }
            return count
        }

        // Consider this request, increment and decrement for the buildings involved.
        val (from, to) = requests[index]
        indegree[from]--
        indegree[to]++
        // Move on to the next request and also increment the count of requests.
        val consider = backtrack(requests, indegree, n, index + 1, count + 1)
        // Backtrack to the previous values to move back to the original state before the second recursion.
        indegree[from]++
        indegree[to]--

        // Ignore this request and move on to the next request without incrementing the count.
        val ignore = backtrack(requests, indegree, n, index + 1, count)
        return maxOf(consider, ignore)
    }
}
