package medium

import java.util.*

/**
 * You have a set which contains all positive integers `[1, 2, 3, 4, 5, ...]`.
 *
 * Implement the SmallestInfiniteSet class:
 * * SmallestInfiniteSet() Initializes the SmallestInfiniteSet object to contain all positive integers.
 * * int popSmallest() Removes and returns the smallest integer contained in the infinite set.
 * * void addBack(int num) Adds a positive integer num back into the infinite set, if it is not already in the infinite set.
 *
 * [URL](https://leetcode.com/problems/smallest-number-in-infinite-set/)
 */
object SmallestNumberInInfiniteSet {
    class SmallestInfiniteSet {
        val set = TreeSet<Int>()
        var next = 1

        fun popSmallest(): Int {
            if (set.isEmpty()) {
                return next++
            }
            val result = set.first()
            set.remove(result)
            return result
        }

        fun addBack(num: Int) {
            if (next > num) {
                set.add(num)
            }
        }

    }
}