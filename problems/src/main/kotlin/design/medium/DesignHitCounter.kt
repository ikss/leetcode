package design.medium

import java.util.*

/**
 * Design a hit counter which counts the number of hits received in the past 5 minutes (i.e., the past 300 seconds).
 *
 * Your system should accept a timestamp parameter (in seconds granularity), and you may assume that calls are being
 * made to the system in chronological order (i.e., timestamp is monotonically increasing).
 * Several hits may arrive roughly at the same time.
 *
 * Implement the HitCounter class:
 * * HitCounter() Initializes the object of the hit counter system.
 * * void hit(int timestamp) Records a hit that happened at timestamp (in seconds). Several hits may happen at the same
 * timestamp.
 * * int getHits(int timestamp) Returns the number of hits in the past 5 minutes from timestamp (i.e., the past 300 seconds).
 *
 * [URL](https://leetcode.com/problems/design-hit-counter/)
 */
object DesignHitCounter {
    class HitCounter {
        private val period = 300 // 5 minutes
        private val map = TreeMap<Int, Int>()

        fun hit(timestamp: Int) {
            map.merge(timestamp, 1, Int::plus)
        }

        fun getHits(timestamp: Int): Int {
            var start = map.ceilingEntry(timestamp - period + 1)
            if (start == null || start.key > timestamp) return 0

            var result = start.value

            while (true) {
                start = map.higherEntry(start.key)
                if (start == null || start.key > timestamp) break

                result += start.value
            }
            return result
        }

    }
}