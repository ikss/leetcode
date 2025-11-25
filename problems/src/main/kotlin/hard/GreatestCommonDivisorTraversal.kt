package hard

import data_structures.UnionFind

/**
 * You are given a 0-indexed integer array nums, and you are allowed to traverse between its indices.
 * You can traverse between index i and index j, i != j, if and only if `gcd(nums[i], nums[j]) > 1`,
 * where gcd is the greatest common divisor.
 *
 * Your task is to determine if for every pair of indices i and j in nums, where i < j,
 * there exists a sequence of traversals that can take us from i to j.
 *
 * Return true if it is possible to traverse between all such pairs of indices, or false otherwise.
 *
 * [URL](https://leetcode.com/problems/greatest-common-divisor-traversal/)
 */
object GreatestCommonDivisorTraversal {
    private fun getPrimeFactors(x: Int): List<Int> {
        var x = x
        val primeFactors = ArrayList<Int>()
        var i = 2
        while (i * i <= x) {
            if (x % i == 0) {
                primeFactors.add(i)
                while (x % i == 0) {
                    x /= i
                }
            }
            i++
        }
        if (x != 1) {
            primeFactors.add(x)
        }
        return primeFactors
    }

    fun canTraverseAllPairs(nums: IntArray): Boolean {
        val n = nums.size
        if (n == 1) {
            return true
        }
        val g = UnionFind(n)
        val seen = HashMap<Int, Int>()
        for (i in 0 until n) {
            if (nums[i] == 1) {
                return false
            }
            val primeFactors = getPrimeFactors(nums[i])
            for (prime in primeFactors) {
                if (seen.containsKey(prime)) {
                    g.union(i, seen[prime]!!)
                } else {
                    seen[prime] = i
                }
            }
        }
        return g.allIsConnected()
    }
}
