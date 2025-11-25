package medium

/**
 * You are given an array of n pairs pairs where `pairs[i] = [lefti, righti]` and lefti < righti.
 *
 * A pair `p2 = [c, d]` follows a pair `p1 = [a, b]` if b < c. A chain of pairs can be formed in this fashion.
 *
 * Return the length longest chain which can be formed.
 *
 * You do not need to use up all the given intervals. You can select pairs in any order.
 *
 * [URL](https://leetcode.com/problems/maximum-length-of-pair-chain/)
 */
object MaximumLengthOfPairChain {
    fun findLongestChain(pairs: Array<IntArray>): Int {
        // Sort pairs in ascending order based on the second element.
        pairs.sortBy { it[1] }
        var curr = Int.MIN_VALUE
        var ans = 0
        for (pair in pairs) {
            if (pair[0] > curr) {
                ans++
                curr = pair[1]
            }
        }
        return ans
    }
}
