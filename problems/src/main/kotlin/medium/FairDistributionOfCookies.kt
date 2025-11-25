package medium

/**
 * You are given an integer array cookies, where `cookies[i]` denotes the number of cookies in the ith bag.
 * You are also given an integer k that denotes the number of children to distribute all the bags of cookies to.
 * All the cookies in the same bag must go to the same child and cannot be split up.
 *
 * The unfairness of a distribution is defined as the maximum total cookies obtained by a single child
 * in the distribution.
 *
 * Return the minimum unfairness of all distributions.
 *
 * [URL](https://leetcode.com/problems/fair-distribution-of-cookies/)
 */
object FairDistributionOfCookies {

    fun distributeCookies(cookies: IntArray, k: Int): Int {
        val distribute = IntArray(k)
        return dfs(0, distribute, cookies, k, k)
    }

    private fun dfs(i: Int, distribute: IntArray, cookies: IntArray, k: Int, zeroCount: Int): Int {
        // If there are not enough cookies remaining, return Integer.MAX_VALUE
        // as it leads to an invalid distribution.
        var zeroCount = zeroCount
        if (cookies.size - i < zeroCount) {
            return Int.MAX_VALUE
        }

        // After distributing all cookies, return the unfairness of this distribution.
        if (i == cookies.size) {
            return distribute.max()
        }

        // Try to distribute the i-th cookie to each child, and update answer
        // as the minimum unfairness in these distributions.
        var answer = Int.MAX_VALUE
        for (j in 0 until k) {
            zeroCount -= if (distribute[j] == 0) 1 else 0
            distribute[j] += cookies[i]

            // Recursively distribute the next cookie.
            answer = minOf(answer, dfs(i + 1, distribute, cookies, k, zeroCount))
            distribute[j] -= cookies[i]
            zeroCount += if (distribute[j] == 0) 1 else 0
        }
        return answer
    }
}
