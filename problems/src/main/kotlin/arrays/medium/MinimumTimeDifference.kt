package arrays.medium

/**
 * Given a list of 24-hour clock time points in "HH:MM" format,
 * return the minimum minutes difference between any two time-points in the list.
 *
 * [URL](https://leetcode.com/problems/minimum-time-difference/)
 */
object MinimumTimeDifference {
    fun findMinDifferenceSort(timePoints: List<String>): Int {
        val sorted = timePoints.map {
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

    fun findMinDifferenceBucketSort(timePoints: List<String>): Int {
        val minutes = BooleanArray(24 * 60)
        for (t in timePoints) {
            val mapped = t.substring(0, 2).toInt() * 60 + t.substring(3).toInt()
            if (minutes[mapped]) {
                return 0
            }
            minutes[mapped] = true
        }
        var prevIndex = Int.MAX_VALUE
        var firstIndex = Int.MAX_VALUE
        var lastIndex = Int.MAX_VALUE
        var result = Int.MAX_VALUE

        for (i in 0 until 24 * 60) {
            if (!minutes[i]) continue
            
            if (prevIndex != Int.MAX_VALUE) {
                result = minOf(result, i - prevIndex)
            }
            prevIndex = i
            if (firstIndex == Int.MAX_VALUE) {
                firstIndex = i
            }
            lastIndex = i
        }

        return minOf(result, (24 * 60 - (lastIndex - firstIndex)))
    }
}