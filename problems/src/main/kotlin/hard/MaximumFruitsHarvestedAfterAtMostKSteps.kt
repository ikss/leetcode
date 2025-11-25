package hard

import kotlin.math.abs

/**
 * Fruits are available at some positions on an infinite x-axis. You are given a 2D integer array fruits where
 * `fruits[i] = [positioni, amounti]` depicts amounti fruits at the position positioni.
 * fruits is already sorted by positioni in ascending order, and each positioni is unique.
 *
 * You are also given an integer startPos and an integer k. Initially, you are at the position startPos.
 * From any position, you can either walk to the left or right. It takes one step to move one unit on the x-axis,
 * and you can walk at most k steps in total. For every position you reach, you harvest all the fruits at that position,
 * and the fruits will disappear from that position.
 *
 * Return the maximum total number of fruits you can harvest.
 *
 * [URL](https://leetcode.com/problems/maximum-fruits-harvested-after-at-most-k-steps/)
 */
object MaximumFruitsHarvestedAfterAtMostKSteps {

    fun maxTotalFruits(fruits: Array<IntArray>, startPos: Int, k: Int): Int {
        var left = 0
        var right = 0
        val n = fruits.size
        var sum = 0
        var ans = 0

        while (right < n) {
            sum += fruits[right][1]
            while (left <= right && steps(fruits, startPos, left, right) > k) {
                sum -= fruits[left][1]
                left++
            }
            ans = maxOf(ans, sum)
            right++
        }
        return ans
    }

    private fun steps(fruits: Array<IntArray>, startPos: Int, left: Int, right: Int): Int {
        val fruitsRight = fruits[right]
        val fruitsLeft = fruits[left]
        val rightLeg = abs(startPos - fruitsRight[0])
        val leftLeg = abs(startPos - fruitsLeft[0])

        return minOf(rightLeg, leftLeg) + fruitsRight[0] - fruitsLeft[0]
    }
}
