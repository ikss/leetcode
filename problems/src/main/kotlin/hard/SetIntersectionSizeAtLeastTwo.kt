package hard

/**
 * You are given a 2D integer array intervals where `intervals[i] = [starti, endi]` represents all the integers from
 * starti to endi inclusively.
 *
 * A containing set is an array nums where each interval from intervals has at least two integers in nums.
 *
 * For example, if `intervals = [[1,3], [3,7], [8,9]]`, then `[1,2,4,7,8,9]` and `[2,3,4,8,9]` are containing sets.
 * Return the minimum possible size of a containing set.
 *
 * [URL](https://leetcode.com/problems/set-intersection-size-at-least-two/)
 */
object SetIntersectionSizeAtLeastTwo {
    fun intersectionSizeTwo(intervals: Array<IntArray>): Int {
        val sorted = intervals.sortedWith { a, b ->
            if (a[0] != b[0]) a[0] - b[0] else b[1] - a[1]
        }

        var t = sorted.size
        val todo = IntArray(t) { 2 }
        var result = 0

        while (--t >= 0) {
            val (start, end) = sorted[t]
            val m = todo[t]

            for (p in start until start + m) {
                for (i in 0 .. t) {
                    if (todo[i] > 0 && p <= sorted[i][1]) {
                        todo[i]--
                    }
                }
                result++
            }
        }

        return result
    }
}
