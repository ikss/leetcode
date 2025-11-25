package hard

/**
 * You want to build some obstacle courses. You are given a 0-indexed integer array obstacles of length n,
 * where `obstacles[i]` describes the height of the ith obstacle.
 *
 * For every index i between 0 and n - 1 (inclusive), find the length of the longest obstacle course in obstacles such that:
 * * You choose any number of obstacles between 0 and i inclusive.
 * * You must include the ith obstacle in the course.
 * * You must put the chosen obstacles in the same order as they appear in obstacles.
 * * Every obstacle (except the first) is taller than or the same height as the obstacle immediately before it.
 *
 * Return an array ans of length n, where `ans[i]` is the length of the longest obstacle course for index i
 * as described above.
 *
 * [URL](https://leetcode.com/problems/find-the-longest-valid-obstacle-course-at-each-position/)
 */
object FindTheLongestValidObstacleCourseAtEachPosition {

    fun longestObstacleCourseAtEachPosition(obstacles: IntArray): IntArray {
        val n = obstacles.size
        var lisLength = 0

        // lis[i] records the lowest increasing sequence of length i + 1.
        val answer = IntArray(n)
        val lis = IntArray(n)
        for (i in 0 until n) {
            val height = obstacles[i]

            // Find the rightmost insertion position idx.
            val idx = bisectRight(lis, height, lisLength)
            if (idx == lisLength) lisLength++
            lis[idx] = height
            answer[i] = idx + 1
        }
        return answer
    }

    // Find the rightmost insertion position. We use a fixed-length array and a changeable right boundary
    // to represent an arraylist of dynamic size.
    private fun bisectRight(A: IntArray, target: Int, right: Int): Int {
        var right = right
        if (right == 0) return 0
        var left = 0
        while (left < right) {
            val mid = left + (right - left) / 2
            if (A[mid] <= target) left = mid + 1 else right = mid
        }
        return left
    }
}