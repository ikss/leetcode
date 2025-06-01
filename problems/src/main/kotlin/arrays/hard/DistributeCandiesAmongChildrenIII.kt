package arrays.hard

/**
 * You are given two positive integers n and limit.
 *
 * Return the total number of ways to distribute n candies among 3 children such that no child gets more than limit candies.
 *
 * [URL](https://leetcode.com/problems/distribute-candies-among-children-iii/)
 */
object DistributeCandiesAmongChildrenIII {

    fun distributeCandies(n: Int, limit: Int): Long {
        return cal(n + 2) -
                3 * cal(n - limit + 1) +
                3 * cal(n - 2 * (limit + 1) + 2) -
                cal(n - 3 * (limit + 1) + 2)

    }

    fun cal(x: Int): Long {
        if (x < 0) {
            return 0
        }
        return (x.toLong() * (x - 1)) / 2
    }
}
