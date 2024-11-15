package arrays.medium

/**
 * You are given a 0-indexed integer array candies, where `candies[i]` represents the flavor of the ith candy.
 * Your mom wants you to share these candies with your little sister by giving her k consecutive candies,
 * but you want to keep as many flavors of candies as possible.
 *
 * Return the maximum number of unique flavors of candy you can keep after sharing with your sister.
 *
 * [URL](https://leetcode.com/problems/number-of-unique-flavors-after-sharing-k-candies/)
 */
object NumberOfUniqueFlavorsAfterSharingKCandies {
    fun shareCandies(candies: IntArray, k: Int): Int {
        if (k >= candies.size) return 0

        val map = HashMap<Int, Int>()

        for (c in candies) {
            map[c] = map.getOrDefault(c, 0) + 1
        }

        var i = 0
        var curr = map.size
        while (i < k) {
            val c = candies[i]
            val newVal = map[c]!! - 1
            map[c] = newVal
            if (newVal == 0) {
                curr--
            }
            i++
        }
        var result = curr
        while (i < candies.size) {
            val prev = candies[i - k]
            val prevVal = map[prev]!! + 1
            map[prev] = prevVal
            if (prevVal == 1) {
                curr++
            }

            val c = candies[i]
            val newVal = map[c]!! - 1
            map[c] = newVal
            if (newVal == 0) {
                curr--
            }
            result = maxOf(result, curr)
            i++
        }

        return result
    }
}
