package arrays.easy

/**
 * There is a function signFunc(x) that returns:
 * * 1 if x is positive.
 * * -1 if x is negative.
 * * 0 if x is equal to 0.
 *
 * You are given an integer array nums. Let product be the product of all values in the array nums.
 *
 * Return signFunc(product).
 *
 * [URL](https://leetcode.com/problems/sign-of-the-product-of-an-array/)
 */
object SignOfTheProductOfArray {
    fun arraySign(nums: IntArray): Int {
        var sign = 1
        for (n in nums) {
            if (n == 0) return 0
            if (n < 0) sign = -sign
        }

        return sign
    }
}
