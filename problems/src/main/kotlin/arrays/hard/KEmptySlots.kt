package arrays.hard

import java.util.*

/**
 * You have n bulbs in a row numbered from 1 to n. Initially, all the bulbs are turned off.
 * We turn on exactly one bulb every day until all bulbs are on after n days.
 *
 * You are given an array bulbs of length n where `bulbs[i] = x` means that on the (i+1)th day,
 * we will turn on the bulb at position x where i is 0-indexed and x is 1-indexed.
 *
 * Given an integer k, return the minimum day number such that there exists two turned on bulbs that have exactly k
 * bulbs between them that are all turned off. If there isn't such day, return -1.
 *
 * [URL](https://leetcode.com/problems/k-empty-slots/)
 */
object KEmptySlots {
    fun kEmptySlots(bulbs: IntArray, k: Int): Int {
        val map = TreeMap<Int, Pair<Int, Int>>()

        for (i in bulbs.indices) {
            val b = bulbs[i]
            val next = map.ceilingEntry(b)
            val toNext = if (next != null) {
                val fromNext = next.key - b - 1
                map[next.key] = fromNext to next.value.second
                fromNext
            } else {
                -1
            }


            val prev = map.floorEntry(b)
            val toPrev = if (prev != null) {
                val fromPrev = b - prev.key - 1
                map[prev.key] = fromPrev to prev.value.second
                fromPrev
            } else {
                -1
            }
            if (toNext == k || toPrev == k) {
                return i + 1
            }
            map[b] = toPrev to toNext

        }

        return -1
    }
}
