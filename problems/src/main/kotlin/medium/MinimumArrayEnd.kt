package medium

/**
 * You are given two integers n and x. You have to construct an array of positive integers nums of size n where for
 * every` 0 <= i < n - 1, nums[i + 1]` is greater than `nums[i]`, and the result of the bitwise AND operation between all
 * elements of nums is x.
 *
 * Return the minimum possible value of `nums[n - 1]`.
 *
 * [URL](https://leetcode.com/problems/minimum-array-end/)
 */
object MinimumArrayEnd {
    fun minEnd(n: Int, x: Int): Long {
        var n = n - 1
        var result = x.toLong()
        var mask = 1L
        val x = x.toLong()

        while (n > 0) {
            if (mask and x == 0L) {
                result = result or (n and 1) * mask
                n = n shr 1
            }
            mask = mask shl 1
        }

        return result
    }
}