package arrays.medium

/**
 * You have n bags numbered from 0 to n - 1. You are given two 0-indexed integer arrays capacity and rocks.
 * The ith bag can hold a maximum of `capacity[i]` rocks and currently contains `rocks[i]` rocks.
 * You are also given an integer additionalRocks, the number of additional rocks you can place in any of the bags.
 *
 * Return the maximum number of bags that could have full capacity after placing the additional rocks in some bags.
 *
 * [URL](https://leetcode.com/problems/maximum-bags-with-full-capacity-of-rocks/)
 */
object MaximumBagsWithFullCapacityOfRocks {
    fun maximumBags(capacity: IntArray, rocks: IntArray, additionalRocks: Int): Int {
        val free = IntArray(capacity.size)
        for (i in free.indices) {
            free[i] = capacity[i] - rocks[i]
        }
        free.sort()

        var leftRocks = additionalRocks
        var result = 0
        for (i in free.indices) {
            if (leftRocks < free[i]) break
            leftRocks -= free[i]
            result++
        }

        return result
    }
}
