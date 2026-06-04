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
 * [URL](https://leetcode.com/problems/earliest-finish-time-for-land-and-water-rides-ii/)
 */
object EarliestFinishTimeForLandAndWaterRidesII {

    fun earliestFinishTime(
        landStartTime: IntArray,
        landDuration: IntArray,
        waterStartTime: IntArray,
        waterDuration: IntArray,
    ): Int {
        val land_water = solve(landStartTime, landDuration, waterStartTime, waterDuration)
        val water_land = solve(waterStartTime, waterDuration, landStartTime, landDuration)
        return minOf(land_water, water_land)
    }

    private fun solve(start1: IntArray, duration1: IntArray, start2: IntArray, duration2: IntArray): Int {
        var finish1 = Int.MAX_VALUE
        for (i in start1.indices) {
            finish1 = minOf(finish1, start1[i] + duration1[i])
        }
        var finish2 = Int.MAX_VALUE
        for (i in start2.indices) {
            finish2 = minOf(finish2, maxOf(start2[i], finish1) + duration2[i])
        }
        return finish2
    }
}
