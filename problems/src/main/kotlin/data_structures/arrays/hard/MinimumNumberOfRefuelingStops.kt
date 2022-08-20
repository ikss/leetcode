package data_structures.arrays.hard

import java.util.*


/**
 * A car travels from a starting position to a destination which is target miles east of the starting position.
 *
 * There are gas stations along the way. The gas stations are represented as an array stations where
 * `stations[i] = [positioni, fueli]` indicates that the ith gas station is positioni miles east
 * of the starting position and has fueli liters of gas.
 *
 * The car starts with an infinite tank of gas, which initially has startFuel liters of fuel in it.
 * It uses one liter of gas per one mile that it drives. When the car reaches a gas station, it may stop and refuel,
 * transferring all the gas from the station into the car.
 *
 * Return the minimum number of refueling stops the car must make in order to reach its destination.
 * If it cannot reach the destination, return -1.
 *
 * Note that if the car reaches a gas station with 0 fuel left, the car can still refuel there.
 * If the car reaches the destination with 0 fuel left, it is still considered to have arrived.
 *
 * [URL](https://leetcode.com/problems/minimum-number-of-refueling-stops/)
 */
object MinimumNumberOfRefuelingStops {
    fun minRefuelStopsDp(target: Int, startFuel: Int, stations: Array<IntArray>): Int {
        if (target <= startFuel) return 0
        if (stations.isEmpty()) return -1

        val size = stations.size
        val dp = LongArray(size + 1)
        dp[0] = startFuel.toLong()

        for (i in 0 until size) {
            for (t in i downTo 0) {
                if (dp[t] >= stations[i][0]) {
                    dp[t + 1] = maxOf(dp[t + 1], dp[t] + stations[i][1].toLong())
                }
            }
        }

        for (i in 0..size) {
            if (dp[i] >= target) return i
        }
        return -1
    }

    fun minRefuelStopsHeap(target: Int, startFuel: Int, stations: Array<IntArray>): Int {
        // pq is a maxheap of gas station capacities
        var tank = startFuel
        val pq = PriorityQueue<Int>(Collections.reverseOrder())
        var ans = 0
        var prev = 0
        for ((location, capacity) in stations) {
            tank -= location - prev
            while (!pq.isEmpty() && tank < 0) {  // must refuel in past
                tank += pq.poll()
                ans++
            }
            if (tank < 0) return -1
            pq.offer(capacity)
            prev = location
        }

        // Repeat body for station = (target, inf)
        run {
            tank -= target - prev
            while (!pq.isEmpty() && tank < 0) {
                tank += pq.poll()
                ans++
            }
            if (tank < 0) return -1
        }
        return ans
    }


}
