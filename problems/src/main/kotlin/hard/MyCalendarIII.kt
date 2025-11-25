package hard

import java.util.*

/**
 * A k-booking happens when k events have some non-empty intersection (i.e., there is some time that is common
 * to all k events.)
 *
 * You are given some events [start, end), after each given event, return an integer k representing the maximum
 * k-booking between all the previous events.
 *
 * Implement the MyCalendarThree class:
 * * MyCalendarThree() Initializes the object.
 * * int book(int start, int end) Returns an integer k representing the largest integer such that there exists
 *  a k-booking in the calendar.
 *
 * [URL](https://leetcode.com/problems/my-calendar-iii/)
 */
object MyCalendarIII {
    class MyCalendarIIINaive {
        private var diff = TreeMap<Int, Int>()

        fun book(start: Int, end: Int): Int {
            diff[start] = diff.getOrDefault(start, 0) + 1
            diff[end] = diff.getOrDefault(end, 0) - 1
            var res = 0
            var cur = 0
            for (delta in diff.values) {
                cur += delta
                res = maxOf(res, cur)
            }
            return res
        }
    }

    class MyCalendarIIIBalancedTree {
        private var starts = TreeMap<Int, Int>().apply { this[0] = 0 }
        private var res = 0

        fun book(start: Int, end: Int): Int {
            split(start)
            split(end)
            for (interval in starts.subMap(start, true, end, false)) {
                val newValue = interval.setValue(interval.value + 1) + 1
                res = maxOf(res, newValue)
            }
            return res
        }

        private fun split(x: Int) {
            val prev = starts.floorKey(x)
            val next = starts.ceilingKey(x)
            if (next != null && next == x) return
            starts[x] = starts[prev]!!
        }
    }
}