package arrays.medium

/**
 * You are given an array of positive integers nums and want to erase a subarray containing unique elements.
 * The score you get by erasing the subarray is equal to the sum of its elements.
 *
 * Return the maximum score you can get by erasing exactly one subarray.
 *
 * An array b is called to be a subarray of a if it forms a contiguous subsequence of a, that is,
 * if it is equal to a[l],a[l+1],...,a[r] for some (l,r).
 *
 * [URL](https://leetcode.com/problems/maximum-erasure-value/)
 */
object MaximumErasureValue {
    fun maximumUniqueSubarray(nums: IntArray): Int {
        val uniques = mutableSetOf<Int>()
        var curr = 0
        var max = 0
        for (n in nums) {
            if (!uniques.add(n)) {
                max = maxOf(max, curr)
                while (!uniques.add(n)) {
                    val iter = uniques.iterator()
                    curr -= iter.next()
                    iter.remove()
                }
            }
            curr += n
        }
        max = maxOf(max, curr)
        return max
    }

    fun maximumUniqueSubarrayMap(nums: IntArray): Int {
        val subarr = HashMap<Int, Int>()

        var result = 0
        var currSum = 0

        var start = 0
        var end = 0

        while (end < nums.size) {
            val n = nums[end]
            if (n in subarr) {
                val prev = subarr[n]!!
                while (start <= prev) {
                    currSum -= nums[start++]
                }
            }
            subarr[n] = end
            currSum += n
            result = maxOf(result, currSum)
            end++
        }

        return result
    }
}
