package easy

/**
 * You are given a 2D array events which represents a sequence of events where a child pushes a series of buttons on a keyboard.
 *
 * Each `events[i] = [indexi, timei]` indicates that the button at index indexi was pressed at time timei.
 * * The array is sorted in increasing order of time.
 * * The time taken to press a button is the difference in time between consecutive button presses.
 *
 * The time for the first button is simply the time at which it was pressed.
 * Return the index of the button that took the longest time to push. If multiple buttons have the same longest time,
 * return the button with the smallest index.
 *
 * [URL](https://leetcode.com/problems/button-with-longest-push-time/)
 */
object ButtonWithLongestPushTime {
    fun buttonWithLongestTime(events: Array<IntArray>): Int {
        var prev = events[0][1]
        var max = prev
        var result = events[0][0]

        for (i in 1 until events.size) {
            val (button, time) = events[i]
            val diff = time - prev
            if (diff > max) {
                result = button
                max = diff
            } else if (diff == max && button < result) {
                result = button
            }

            prev = time
        }

        return result
    }
}
