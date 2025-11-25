package medium

import java.util.*

/**
 * Design a system that manages the reservation state of n seats that are numbered from 1 to n.
 *
 * Implement the SeatManager class:
 * * SeatManager(int n) Initializes a SeatManager object that will manage n seats numbered from 1 to n.
 * All seats are initially available.
 * * int reserve() Fetches the smallest-numbered unreserved seat, reserves it, and returns its number.
 * * void unreserve(int seatNumber) Unreserves the seat with the given seatNumber.
 *
 * [URL](https://leetcode.com/problems/seat-reservation-manager/)
 */
object SeatManager {
    class SeatManager(n: Int) {
        private val queue = PriorityQueue<Int>()
        private var marker = 1

        fun reserve(): Int {
            if (queue.isNotEmpty()) {
                return queue.poll()
            }

            return marker++
        }

        fun unreserve(seatNumber: Int) {
            queue.offer(seatNumber)
        }
    }
}