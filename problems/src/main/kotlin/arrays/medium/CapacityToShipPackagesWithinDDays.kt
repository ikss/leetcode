package arrays.medium

/**
 * A conveyor belt has packages that must be shipped from one port to another within days days.
 *
 * The ith package on the conveyor belt has a weight of `weights[i]`. Each day, we load the ship with packages on
 * the conveyor belt (in the order given by weights).
 * We may not load more weight than the maximum weight capacity of the ship.
 *
 * Return the least weight capacity of the ship that will result in all the packages on the conveyor belt
 * being shipped within days days.
 *
 * [URL](https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/)
 */
object CapacityToShipPackagesWithinDDays {
    fun shipWithinDays(weights: IntArray, days: Int): Int {
        var totalLoad = 0
        var maxLoad = 0
        for (weight in weights) {
            totalLoad += weight
            maxLoad = Math.max(maxLoad, weight)
        }
        var l = maxLoad
        var r = totalLoad
        while (l < r) {
            val mid = (l + r) / 2
            if (canShip(weights, mid, days)) {
                r = mid
            } else {
                l = mid + 1
            }
        }
        return l
    }

    // Check whether the packages can be shipped in less than "days" days with "c" capacity.
    private fun canShip(weights: IntArray, c: Int, days: Int): Boolean {
        var daysNeeded = 1
        var currentLoad = 0
        for (weight in weights) {
            currentLoad += weight
            if (currentLoad > c) {
                if (++daysNeeded > days) return false
                currentLoad = weight
            }
        }
        return true
    }
}