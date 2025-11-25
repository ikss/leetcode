package medium

/**
 * You are given a 0-indexed integer array candies. Each element in the array denotes a pile of candies of size
 * `candies[i]`. You can divide each pile into any number of sub piles, but you cannot merge two piles together.
 *
 * You are also given an integer k. You should allocate piles of candies to k children such that
 * each child gets the same number of candies.
 * Each child can be allocated candies from only one pile of candies and some piles of candies may go unused.
 *
 * Return the maximum number of candies each child can get.
 *
 * [URL](https://leetcode.com/problems/maximum-candies-allocated-to-k-children/)
 */
object MaximumCandiesAllocatedToKChildren {
    fun maximumCandies(candies: IntArray, k: Long): Int {
        var sum = 0L
        for (c in candies) {
            sum += c
        }

        var min = 1
        var max = (sum / k).toInt()

        var result = 0

        while (min <= max) {
            val mid = (max - min) / 2 + min

            if (canAllocate(mid, candies, k)) {
                result = mid
                min = mid + 1
            } else {
                max = mid - 1
            }
        }

        return result
    }

    private fun canAllocate(num: Int, candies: IntArray, kids: Long): Boolean {
        var allocated = 0L
        for (c in candies) {
            val canAllocate = c / num
            allocated += canAllocate
            if (allocated >= kids) break
        }
        return allocated >= kids
    }
}
