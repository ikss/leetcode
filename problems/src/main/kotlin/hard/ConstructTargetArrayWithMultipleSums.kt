package hard

import java.util.*

/**
 * You are given an array target of n integers. From a starting array arr consisting of n 1's,
 * you may perform the following procedure:
 * * let x be the sum of all elements currently in your array.
 * * choose index i, such that 0 <= i < n and set the value of arr at index i to x.
 * * You may repeat this procedure as many times as needed.
 *
 * Return true if it is possible to construct the target array from arr, otherwise, return false.
 *
 * [URL](https://leetcode.com/problems/construct-target-array-with-multiple-sums/)
 */
object ConstructTargetArrayWithMultipleSums {
    fun isPossible(target: IntArray): Boolean {
        if (target.size == 1) {
            return target[0] == 1
        }
        val queue = PriorityQueue<Int> { n1, n2 -> n2.compareTo(n1) }

        var startSum = 0
        for (n in target) {
            queue.offer(n)
            startSum += n
        }
        
        while (queue.peek() > 1) {
            val curr = queue.poll()

            val oldSum = startSum - curr
            if (oldSum == 1) return true

            val oldNum = curr % oldSum
            if (oldNum < 1 || oldNum == curr) return false

            startSum -= curr - oldNum

            queue.offer(oldNum)
        }

        return true
    }
}
