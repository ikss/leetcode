package hard

import java.util.*

/**
 * We are given a list schedule of employees, which represents the working time for each employee.
 *
 * Each employee has a list of non-overlapping Intervals, and these intervals are in sorted order.
 *
 * Return the list of finite intervals representing common, positive-length free time for all employees, also in sorted order.
 *
 * (Even though we are representing Intervals in the form `[x, y]`, the objects inside are Intervals,
 * not lists or arrays.
 * For example, `schedule[0][0].start = 1`, `schedule[0][0].end = 2`, and `schedule[0][0][0]` is not defined).
 * Also, we wouldn't include intervals like `[5, 5]` in our answer, as they have zero length.
 *
 * [URL](https://leetcode.com/problems/employee-free-time/)
 */
object EmployeeFreeTime {
    fun employeeFreeTime(avails: List<List<Interval>>): List<Interval> {
        val OPEN = 0
        val CLOSE = 1

        val events = ArrayList<IntArray>()
        for (employee in avails) for (iv in employee) {
            events.add(intArrayOf(iv.start, OPEN))
            events.add(intArrayOf(iv.end, CLOSE))
        }

        events.sortWith { a: IntArray, b: IntArray -> if (a[0] != b[0]) a[0] - b[0] else a[1] - b[1] }
        val result = ArrayList<Interval>()

        var prev = -1
        var bal = 0
        for ((time, command) in events) {
            if (bal == 0 && prev >= 0) result.add(Interval(prev, time))
            bal += if (command == OPEN) 1 else -1
            prev = time
        }

        return result
    }
}

data class Interval(
    var start: Int = 0,
    var end: Int = 0,
)
