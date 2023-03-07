package arrays.medium

/**
 * You are given an array time where time[i] denotes the time taken by the ith bus to complete one trip.
 *
 * Each bus can make multiple trips successively; that is, the next trip can start immediately after completing
 * the current trip. Also, each bus operates independently; that is, the trips of one bus do not influence
 * the trips of any other bus.
 *
 * You are also given an integer totalTrips, which denotes the number of trips all buses should make in total.
 * Return the minimum time required for all buses to complete at least totalTrips trips.
 *
 * [URL](https://leetcode.com/problems/minimum-time-to-complete-trips/)
 */
object MinimumTimeToCompleteTrips {
    fun minimumTime(time: IntArray, totalTrips: Int): Long {
        // Initialize the left and right boundaries.
        var left = time.min()!!.toLong()
        var right = left * totalTrips

        // Binary search to find the minimum time to finish the task.
        while (left < right) {
            val mid = (left + right) / 2
            if (timeEnough(time, mid, totalTrips)) {
                right = mid
            } else {
                left = mid + 1
            }
        }
        return left
    }

    // Can these buses finish 'totalTrips' of trips in 'givenTime'?
    private fun timeEnough(time: IntArray, givenTime: Long, totalTrips: Int): Boolean {
        var actualTrips: Long = 0
        for (t in time) {
            actualTrips += givenTime / t
        }
        return actualTrips >= totalTrips
    }
}
