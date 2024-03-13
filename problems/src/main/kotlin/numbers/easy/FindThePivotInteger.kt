package numbers.easy

/**
 * Given a positive integer n, find the pivot integer x such that:
 *
 * The sum of all elements between 1 and x inclusively equals the sum of all elements between x and n inclusively.
 * Return the pivot integer x. If no such integer exists, return -1.
 * It is guaranteed that there will be at most one pivot index for the given input.
 *
 * [URL](https://leetcode.com/problems/find-the-pivot-integer/)
 */
object FindThePivotInteger {
    fun pivotInteger(n: Int): Int {
        var low = 0
        var high = n

        val totalSum = n * (n + 1) / 2
        while (low <= high) {
            val mid = (high - low) / 2 + low

            val sumBefore = mid * (mid - 1) / 2 + mid
            val sumAfter = totalSum - sumBefore + mid

            if (sumBefore == sumAfter) {
                return mid
            } else if (sumBefore < sumAfter) {
                low = mid + 1
            } else {
                high = mid - 1
            }
        }
        return -1
    }
}
