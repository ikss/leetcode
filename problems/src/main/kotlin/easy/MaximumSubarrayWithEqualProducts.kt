package easy

/**
 * You are given an array of positive integers nums.
 *
 * An array arr is called product equivalent if prod(arr) == lcm(arr) * gcd(arr), where:
 * * prod(arr) is the product of all elements of arr.
 * * gcd(arr) is the GCD of all elements of arr.
 * * lcm(arr) is the LCM of all elements of arr.
 *
 * Return the length of the longest product equivalent subarray of nums.
 *
 * [URL](https://leetcode.com/problems/maximum-subarray-with-equal-products/)
 */
object MaximumSubarrayWithEqualProducts {
    fun maxLength(nums: IntArray): Int {
        var result = 1
        for (i in 0 until nums.size - 1) {
            val x = nums[i]
            var currGcd = x
            var currLcm = x
            var currPow = x

            for (j in i + 1 until nums.size) {
                val y = nums[j]

                currPow *= y
                currGcd = gcd(currGcd, y)
                currLcm = lcm(currLcm, y)

                if (currPow == currGcd * currLcm) {
                    result = maxOf(j - i + 1, result)
                }
            }
        }

        return result
    }

    private fun gcd(x: Int, y: Int): Int {
        if (x == 0) {
            return y
        }
        return gcd(y % x, x)
    }

    private fun lcm(x: Int, y: Int): Int {
        return (x * y) / gcd(x, y)
    }
}
