package easy

/**
 * There are n houses evenly lined up on the street, and each house is beautifully painted.
 * You are given a 0-indexed integer array colors of length n, where `colors[i]` represents the color of the ith house.
 *
 * Return the maximum distance between two houses with different colors.
 *
 * The distance between the ith and jth houses is abs(i - j), where abs(x) is the absolute value of x.
 *
 * [URL](https://leetcode.com/problems/two-furthest-houses-with-different-colors/)
 */
object TwoFurthestHousesWithDifferentColors {
    fun maxDistance(colors: IntArray): Int {
        val map = HashMap<Int, Int>()
        var result = 0
        for (i in colors.indices) {
            val c = colors[i]
            var found = false
            for ((k, v) in map) {
                if (k == c) {
                    found = true
                    continue
                }
                result = maxOf(result, i - v)
            }
            if (!found) {
                map[c] = i
            }
        }

        return result
    }
}
