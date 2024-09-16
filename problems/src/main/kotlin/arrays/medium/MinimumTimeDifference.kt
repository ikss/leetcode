package arrays.medium

/**
 * Given a list of 24-hour clock time points in "HH:MM" format,
 * return the minimum minutes difference between any two time-points in the list.
 *
 * [URL](https://leetcode.com/problems/minimum-time-difference/)
 */
object MinimumTimeDifference {
    fun findMinDifferenceSort(timePoints: List<String>): Int {
        val sorted = timePoints.map { it ->
            val (hours, minutes) = it.split(":")
            60 * hours.toInt() + minutes.toInt()
        }.sorted()

        var result = Int.MAX_VALUE
        for (i in 0 until sorted.size - 1) {
            result = minOf(result, getDiff(sorted[i], sorted[i + 1]))
        }

        return minOf(result, getDiff(sorted.first(), sorted.last()))
    }

    private fun getDiff(t1: Int, t2: Int): Int {
        val diff = Math.abs(t1 - t2)

        return minOf(diff, 1440 - diff)
    }
}