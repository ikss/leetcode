package arrays.medium

/**
 * You are given two positive integers n and limit.
 *
 * Return the total number of ways to distribute n candies among 3 children such that no child gets more than limit candies.
 *
 * [URL](https://leetcode.com/problems/distribute-candies-among-children-ii/)
 */
object DistributeCandiesAmongChildrenII {
    fun distributeCandies(n: Int, limit: Int): Long {
        var result = 0L

        for (i in 0 .. minOf(n, limit)) {
            result += maxOf(minOf(limit, n - i) - maxOf(0, n - i - limit) + 1, 0)
        }

        return result
    }
}
