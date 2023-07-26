package arrays.medium

import kotlin.math.ceil

/**
 * You are given a floating-point number hour, representing the amount of time you have to reach the office.
 * To commute to the office, you must take n trains in sequential order. You are also given an integer array dist
 * of length n, where `dist[i]` describes the distance (in kilometers) of the ith train ride.
 *
 * Each train can only depart at an integer hour, so you may need to wait in between each train ride.
 *
 * For example, if the 1st train ride takes 1.5 hours, you must wait for an additional 0.5 hours before you can depart
 * on the 2nd train ride at the 2 hour mark.
 * Return the minimum positive integer speed (in kilometers per hour) that all the trains must travel at for you to
 * reach the office on time, or -1 if it is impossible to be on time.
 *
 * Tests are generated such that the answer will not exceed 107 and hour will have at most two digits after the decimal point.
 *
 * [URL](https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/)
 */
object MinimumSpeedToArriveOnTime {
    fun minSpeedOnTime(dist: IntArray, hour: Double): Int {
        if (dist.size > ceil(hour)) return -1
        var left = 1
        var right = 10_000_000
        var result = -1

        while (left <= right) {
            val mid = left + (right - left) / 2

            if (canArriveInTime(dist, hour, mid)) {
                right = mid - 1
                result = mid
            } else {
                left = mid + 1
            }
        }
        return result
    }

    private fun canArriveInTime(dist: IntArray, hour: Double, speed: Int): Boolean {
        var timeSoFar = 0.0
        for (d in dist) {
            timeSoFar = ceil(timeSoFar)
            val timeToTravel = timeSoFar + d.toDouble() / speed
            if (timeToTravel > hour) return false
            timeSoFar = timeToTravel
        }

        return true
    }
}
