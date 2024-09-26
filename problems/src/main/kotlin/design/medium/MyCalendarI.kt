package design.medium

import java.util.*

/**
 * You are implementing a program to use as your calendar.
 * We can add a new event if adding the event will not cause a double booking.
 *
 * A double booking happens when two events have some non-empty intersection
 * (i.e., some moment is common to both events.).
 *
 * The event can be represented as a pair of integers start and end that represents a booking on the half-open interval
 * `[start, end)`, the range of real numbers x such that start <= x < end.
 *
 * Implement the MyCalendar class:
 * * MyCalendar() Initializes the calendar object.
 * * boolean book(int start, int end) Returns true if the event can be added to the calendar successfully without
 *  causing a double booking. Otherwise, return false and do not add the event to the calendar.
 *
 * [URL](https://leetcode.com/problems/my-calendar-i/)
 */
class MyCalendarI {
    private val calendar = TreeSet<Pair<Int, Int>> { a, b -> a.first - b.first }

    fun book(start: Int, end: Int): Boolean {
        val pair = start to end
        if (calendar.isNotEmpty()) {
            val floor = calendar.floor(pair)
            if (floor != null && floor.second > start) {
                return false
            }
            val ceil = calendar.ceiling(pair)
            if (ceil != null && ceil.first < end) {
                return false
            }
        }
        calendar.add(pair)
        return true
    }
}
