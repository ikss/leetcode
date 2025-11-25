package hard

import java.util.*

/**
 * There are n workers. You are given two integer arrays quality and wage where `quality[i]` is the quality of the ith
 * worker and `wage[i]` is the minimum wage expectation for the ith worker.
 *
 * We want to hire exactly k workers to form a paid group. To hire a group of k workers,
 * we must pay them according to the following rules:
 * * Every worker in the paid group must be paid at least their minimum wage expectation.
 * * In the group, each worker's pay must be directly proportional to their quality.
 * This means if a worker’s quality is double that of another worker in the group, then they must be paid
 * twice as much as the other worker.
 *
 * Given the integer k, return the least amount of money needed to form a paid group satisfying the above conditions.
 * Answers within 10-5 of the actual answer will be accepted.
 *
 * [URL](https://leetcode.com/problems/minimum-cost-to-hire-k-workers/)
 */
object MinimumCostToHireKWorkers {
    fun mincostToHireWorkers(quality: IntArray, wage: IntArray, k: Int): Double {
        val n = quality.size
        var totalCost = Double.MAX_VALUE
        var currentTotalQuality = 0.0
        val wageToQualityRatio = ArrayList<Pair<Double, Int>>()

        // Calculate wage-to-quality ratio for each worker
        for (i in 0 until n) {
            val q = quality[i]
            wageToQualityRatio.add(wage[i].toDouble() / q to q)
        }

        // Sort workers based on their wage-to-quality ratio
        wageToQualityRatio.sortBy { it.first }

        // Use a priority queue to keep track of the highest quality workers
        val highestQualityWorkers = PriorityQueue(Collections.reverseOrder<Int>())

        // Iterate through workers
        for ((key, v) in wageToQualityRatio) {
            highestQualityWorkers.add(v)
            currentTotalQuality += v

            // If we have more than k workers,
            // remove the one with the highest quality
            if (highestQualityWorkers.size > k) {
                currentTotalQuality -= highestQualityWorkers.poll()
            }

            // If we have exactly k workers,
            // calculate the total cost and update if it's the minimum
            if (highestQualityWorkers.size == k) {
                totalCost = minOf(totalCost, currentTotalQuality * key)
            }
        }
        return totalCost
    }
}
