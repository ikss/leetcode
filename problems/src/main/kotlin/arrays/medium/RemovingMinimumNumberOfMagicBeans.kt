package arrays.medium

/**
 * You are given an array of positive integers beans, where each integer represents the number of magic beans
 * found in a particular magic bag.
 *
 * Remove any number of beans (possibly none) from each bag such that the number of beans in each remaining
 * non-empty bag (still containing at least one bean) is equal. Once a bean has been removed from a bag, you are not allowed to return it to any of the bags.
 *
 * Return the minimum number of magic beans that you have to remove.
 *
 * [URL](https://leetcode.com/problems/removing-minimum-number-of-magic-beans/)
 */
object RemovingMinimumNumberOfMagicBeans {
    fun minimumRemoval(beans: IntArray): Long {
        val n = beans.size
        var sum = 0L
        for (b in beans) {
            sum += b
        }
        beans.sort()
        var result = Long.MAX_VALUE

        for (i in beans.indices) {
            result = minOf(result, sum - (n - i) * beans[i].toLong())
            if (result == 0L) break
        }

        return result
    }
}