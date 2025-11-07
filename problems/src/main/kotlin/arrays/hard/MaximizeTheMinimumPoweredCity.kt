package arrays.hard


/**
 * You are given a 0-indexed integer array stations of length n,
 * where `stations[i]` represents the number of power stations in the ith city.
 *
 * Each power station can provide power to every city in a fixed range. In other words, if the range is denoted by r,
 * then a power station at city i can provide power to all cities j such that |i - j| <= r and 0 <= i, j <= n - 1.
 *
 * * Note that |x| denotes absolute value. For example, |7 - 5| = 2 and |3 - 10| = 7.
 *
 * The power of a city is the total number of power stations it is being provided power from.
 *
 * The government has sanctioned building k more power stations, each of which can be built in any city,
 * and have the same range as the pre-existing ones.
 *
 * Given the two integers r and k, return the maximum possible minimum power of a city,
 * if the additional power stations are built optimally.
 *
 * Note that you can build the k power stations in multiple cities.
 *
 * [URL](https://leetcode.com/problems/maximize-the-minimum-powered-city/)
 */
object MaximizeTheMinimumPoweredCity {

    fun maxPower(stations: IntArray, r: Int, k: Int): Long {
        val n = stations.size
        val currStations = LongArray(n + 1)

        var lo = Long.MAX_VALUE
        var hi = k.toLong()
        for (i in 0..<n) {
            val left = maxOf(0, i - r)
            val right = minOf(n, i + r + 1)
            val power = stations[i].toLong()
            currStations[left] += power
            currStations[right] -= power

            lo = minOf(lo, power)
            hi += power
        }

        var result = 0L

        while (lo <= hi) {
            val mid = lo + (hi - lo) / 2
            if (check(currStations, mid, r, k)) {
                result = mid
                lo = mid + 1
            } else {
                hi = mid - 1
            }
        }
        return result
    }

    private fun check(currStations: LongArray, value: Long, r: Int, k: Int): Boolean {
        val n = currStations.size - 1
        val diff = currStations.clone()
        var sum = 0L
        var remaining = k.toLong()

        for (i in 0..<n) {
            sum += diff[i]
            if (sum < value) {
                val add = value - sum
                if (remaining < add) {
                    return false
                }
                remaining -= add
                val end = minOf(n, i + 2 * r + 1)
                diff[end] -= add
                sum += add
            }
        }
        return true
    }
}

