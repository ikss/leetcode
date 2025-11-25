package hard


/**
 * You are given a 2D array points of size n x 2 representing integer coordinates of some points on a 2D-plane,
 * where `points[i] = [xi, yi]`.
 *
 * We define the right direction as positive x-axis (increasing x-coordinate) and the left direction as negative x-axis
 * (decreasing x-coordinate). Similarly, we define the up direction as positive y-axis (increasing y-coordinate) and
 * the down direction as negative y-axis (decreasing y-coordinate)
 *
 * You have to place n people, including Alice and Bob, at these points such that there is exactly one person
 * at every point. Alice wants to be alone with Bob, so Alice will build a rectangular fence with Alice's position as
 * the upper left corner and Bob's position as the lower right corner of the fence (Note that the fence might no
 * t enclose any area, i.e. it can be a line). If any person other than Alice and Bob is either inside the
 * fence or on the fence, Alice will be sad.
 *
 * Return the number of pairs of points where you can place Alice and Bob, such that Alice does not become
 * sad on building the fence.
 *
 * [URL](https://leetcode.com/problems/find-the-number-of-ways-to-place-people-ii/)
 */
object FindTheNumberOfWaysToPlacePeopleII {

    fun numberOfPairs(points: Array<IntArray>): Int {
        points.sortWith { a: IntArray, b: IntArray -> if (a[0] != b[0]) a[0] - b[0] else b[1] - a[1] }

        var result = 0
        for (i in 0..<points.size - 1) {
            val pointA = points[i]
            var xMin = pointA[0] - 1
            val xMax = Int.MAX_VALUE
            var yMin = Int.MIN_VALUE
            val yMax = pointA[1] + 1

            for (j in i + 1..<points.size) {
                val pointB = points[j]
                if (pointB[0] in (xMin + 1)..<xMax && (pointB[1] in (yMin + 1)..<yMax)) {
                    result++
                    xMin = pointB[0]
                    yMin = pointB[1]
                }
            }
        }
        return result
    }
}
