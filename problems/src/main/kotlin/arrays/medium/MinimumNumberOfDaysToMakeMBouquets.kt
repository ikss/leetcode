package arrays.medium

/**
 * You are given an integer array bloomDay, an integer m and an integer k.
 *
 * You want to make m bouquets. To make a bouquet, you need to use k adjacent flowers from the garden.
 *
 * The garden consists of n flowers, the ith flower will bloom in the `bloomDay[i]` and then can be used in exactly
 * one bouquet.
 *
 * Return the minimum number of days you need to wait to be able to make m bouquets from the garden.
 * If it is impossible to make m bouquets return -1.
 *
 * [URL](https://leetcode.com/problems/minimum-number-of-arrows-to-burst-balloons/)
 */
object MinimumNumberOfDaysToMakeMBouquets {
    fun minDays(bloomDay: IntArray, m: Int, k: Int): Int {
        if (m * k > bloomDay.size) return -1

        var min = 1
        var max = bloomDay.max()
        var minDays = -1

        while (min <= max) {
            val mid = min + (max - min) / 2
            var bouquets = 0
            var flowers = 0

            for (day in bloomDay) {
                if (day > mid) {
                    flowers = 0
                    continue
                }
                if (++flowers == k) {
                    bouquets++
                    flowers = 0
                }
            }

            if (bouquets < m) {
                min = mid + 1
            } else {
                max = mid - 1
                minDays = mid
            }
        }
        return minDays
    }
}
