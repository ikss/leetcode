package strings.medium

/**
 * There are n balls on a table, each ball has a color black or white.
 *
 * You are given a 0-indexed binary string s of length n, where 1 and 0 represent black and white balls, respectively.
 *
 * In each step, you can choose two adjacent balls and swap them.
 *
 * Return the minimum number of steps to group all the black balls to the right and all the white balls to the left.
 *
 * [URL](https://leetcode.com/problems/separate-black-and-white-balls/)
 */
object SeparateBlackAndWhiteBalls {
    fun minimumSteps(s: String): Long {
        var count = 0
        var result = 0L

        for (c in s) {
            if (c == '0') {
                result += count
            } else {
                count++
            }
        }

        return result
    }
}
