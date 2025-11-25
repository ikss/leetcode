package medium

/**
 * You are given an integer array ranks representing the ranks of some mechanics.
 * ranksi is the rank of the ith mechanic.
 * A mechanic with a rank r can repair n cars in r * n2 minutes.
 *
 * You are also given an integer cars representing the total number of cars waiting in the garage to be repaired.
 *
 * Return the minimum time taken to repair all the cars.
 *
 * Note: All the mechanics can repair the cars simultaneously.
 *
 * [URL](https://leetcode.com/problems/minimum-time-to-repair-cars/)
 */
object MinimumTimeToRepairCars {
    fun repairCars(ranks: IntArray, cars: Int): Long {
        var min = 1L
        ranks.sort()
        var max = ranks[0].toLong() * cars * cars

        while (min < max) {
            val mid = min + (max - min) / 2

            var repaired = 0L

            for (r in ranks) {
                val numOfCars = Math.sqrt(mid.toDouble() / r).toLong()
                repaired += numOfCars
                if (repaired >= cars) break
            }

            if (repaired >= cars) {
                max = mid
            } else {
                min = mid + 1
            }
        }

        return max
    }
}
