package medium

/**
 * You are given two categories of theme park attractions: land rides and water rides.
 *
 * * Land rides
 * * * `landStartTime[i]` – the earliest time the ith land ride can be boarded.
 * * * `landDuration[i]` – how long the ith land ride lasts.
 * * Water rides
 * * * `waterStartTime[j]` – the earliest time the jth water ride can be boarded.
 * * * `waterDuration[j]` – how long the jth water ride lasts.
 *
 * A tourist must experience exactly one ride from each category, in either order.
 * * A ride may be started at its opening time or any later moment.
 * * If a ride is started at time t, it finishes at time t + duration.
 * * Immediately after finishing one ride the tourist may board the other (if it is already open) or wait until it opens.
 *
 * Return the earliest possible time at which the tourist can finish both rides.
 *
 * [URL](https://leetcode.com/problems/earliest-finish-time-for-land-and-water-rides/)
 */
object EarliestFinishTimeForLandAndWaterRidesI {
    fun earliestFinishTime(landStartTime: IntArray, landDuration: IntArray, waterStartTime: IntArray, waterDuration: IntArray): Int {
        var result = Int.MAX_VALUE

        for (i in landStartTime.indices) {
            val landStart = landStartTime[i]
            val landEnd = landStart + landDuration[i]

            for (j in waterStartTime.indices) {
                val waterStart = waterStartTime[j]
                val waterEnd = waterStart + waterDuration[j]

                if (waterEnd <= landStart) {
                    result = minOf(result, landEnd)
                    continue
                }
                if (landEnd <= waterStart) {
                    result = minOf(result, waterEnd)
                    continue
                }

                result = minOf(result, minOf(waterStart, landStart) + landDuration[i] + waterDuration[j])
            }
        }

        return result
    }
}
