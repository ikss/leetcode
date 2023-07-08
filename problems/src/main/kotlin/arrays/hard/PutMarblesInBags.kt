package arrays.hard

import java.util.*


/**
 * You have k bags. You are given a 0-indexed integer array weights where `weights[i]` is the weight of the ith marble.
 * You are also given the integer k.
 *
 * Divide the marbles into the k bags according to the following rules:
 *
 * No bag is empty.
 * If the ith marble and jth marble are in a bag, then all marbles with an index between the ith and jth indices should
 * also be in that same bag.
 * If a bag consists of all the marbles with an index from i to j inclusively,
 * then the cost of the bag is `weights[i] + weights[j]`.
 * The score after distributing the marbles is the sum of the costs of all the k bags.
 *
 * Return the difference between the maximum and minimum scores among marble distributions.
 *
 * [URL](https://leetcode.com/problems/put-marbles-in-bags/)
 */
object PutMarblesInBags {
    fun putMarbles(weights: IntArray, k: Int): Long {
        val n = weights.size
        val pairs = IntArray(n - 1)
        for (i in 0 until n - 1) {
            pairs[i] = weights[i] + weights[i + 1]
        }
        pairs.sort(0, n - 1)

        var result = 0L
        for (i in 0 until k - 1) {
            result += pairs[n - 2 - i].toLong() - pairs[i]
        }

        return result
    }
}
