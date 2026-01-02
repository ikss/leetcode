package easy

/**
 * You are given an integer array nums with the following properties:
 *
 * * nums.length == 2 * n.
 * * nums contains n + 1 unique elements.
 * * Exactly one element of nums is repeated n times.
 *
 * Return the element that is repeated n times.
 *
 * [URL](https://leetcode.com/problems/n-repeated-element-in-size-2n-array/)
 */
object NRepeatedElementInSize2NArray {
    fun repeatedNTimes(nums: IntArray): Int {
        val seen = HashSet<Int>()

        for (n in nums) {
            if (!seen.add(n)) return n
        }

        return -1
    }
}
