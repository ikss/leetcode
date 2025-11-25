package medium

/**
 * A set of real numbers can be represented as the union of several disjoint intervals,
 * where each interval is in the form `[a, b)`. A real number x is in the set
 * if one of its intervals `[a, b)` contains x (i.e. a <= x < b).
 *
 * You are given a sorted list of disjoint intervals intervals representing a set of real numbers as described above,
 * where `intervals[i] = [ai, bi]` represents the interval `[ai, bi)`. You are also given another interval toBeRemoved.
 *
 * Return the set of real numbers with the interval toBeRemoved removed from intervals.
 * In other words, return the set of real numbers such that every x in the set is in intervals but not in toBeRemoved.
 * Your answer should be a sorted list of disjoint intervals as described above.
 *
 * [URL](https://leetcode.com/problems/remove-interval/)
 */
object RemoveInterval {
    fun removeInterval(intervals: Array<IntArray>, toBeRemoved: IntArray): List<List<Int>> {
        val result = ArrayList<List<Int>>()

        val (removeStart, removeEnd) = toBeRemoved
        for ((start, end) in intervals) {
            if (start <= removeEnd && end >= removeStart) {
                if (start < removeStart) {
                    result.add(listOf(start, removeStart))
                }
                if (end > removeEnd) {
                    result.add(listOf(removeEnd, end))
                }
            } else {
                result.add(listOf(start, end))
            }
        }

        return result
    }
}
