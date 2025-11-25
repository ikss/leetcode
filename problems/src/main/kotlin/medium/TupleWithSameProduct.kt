package medium

/**
 * Given an array nums of distinct positive integers, return the number of tuples (a, b, c, d)
 * such that a * b = c * d where a, b, c, and d are elements of nums, and a != b != c != d.
 *
 * [URL](https://leetcode.com/problems/tuple-with-same-product/)
 */
object TupleWithSameProduct {

    fun tupleSameProduct(nums: IntArray): Int {
        val numsLength = nums.size

        val productsFreq: MutableMap<Int, Int> = HashMap()

        var totalNumberOfTuples = 0

        for (first in 0..<numsLength) {
            for (second in first + 1..<numsLength) {
                val product = nums[first] * nums[second]
                productsFreq.merge(product, 1, Int::plus)
            }
        }

        for (productValue in productsFreq.keys) {
            val freq = productsFreq[productValue]!!
            val pairsOfEqualProduct = ((freq - 1) * freq) / 2

            totalNumberOfTuples += 8 * pairsOfEqualProduct
        }

        return totalNumberOfTuples
    }
}
