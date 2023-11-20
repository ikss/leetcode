package design.easy

/**
 * Given a stream of integers and a window size, calculate the moving average of all integers in the sliding window.
 *
 * Implement the MovingAverage class:
 * * MovingAverage(int size) Initializes the object with the size of the window size.
 * * double next(int val) Returns the moving average of the last size values of the stream.
 *
 * [URL](https://leetcode.com/problems/moving-average-from-data-stream/)
 */
object MovingAverageFromDataStream {
    class MovingAverage(val size: Int) {
        private val queue = java.util.ArrayDeque<Int>(size)
        private var sum = 0

        fun next(`val`: Int): Double {
            if (queue.size == size) {
                sum -= queue.poll()
            }
            queue.offer(`val`)
            sum += `val`
            return sum.toDouble() / queue.size
        }
    }
}