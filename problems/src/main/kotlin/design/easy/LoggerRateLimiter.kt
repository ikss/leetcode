package design.easy

import java.util.*

/**
 * Design a logger system that receives a stream of messages along with their timestamps.
 * Each unique message should only be printed at most every 10 seconds (i.e. a message printed at timestamp t will
 * prevent other identical messages from being printed until timestamp t + 10).
 *
 * All messages will come in chronological order. Several messages may arrive at the same timestamp.
 *
 * Implement the Logger class:
 * * Logger() Initializes the logger object.
 * * bool shouldPrintMessage(int timestamp, string message) Returns true if the message should be printed in the given
 * timestamp, otherwise returns false.
 *
 * [URL](https://leetcode.com/problems/logger-rate-limiter/)
 */
object LoggerRateLimiter {
    class LoggerMap() {
        private val map = HashMap<String, Int>()

        fun shouldPrintMessage(timestamp: Int, message: String): Boolean {
            val old = map[message]

            if (old != null && old + 10 > timestamp) return false
            map[message] = timestamp
            return true
        }

    }

    class LoggerQueue() {
        private val queue = LinkedList<Pair<String, Int>>()
        private val set = HashSet<String>()

        fun shouldPrintMessage(timestamp: Int, message: String): Boolean {
            while (queue.isNotEmpty() && queue.peek().second + 10 <= timestamp) {
                val (msg, _) = queue.poll()
                set.remove(msg)
            }
            if (set.contains(message)) {
                return false
            }
            queue.add(Pair(message, timestamp))
            set.add(message)
            return true
        }

    }
}