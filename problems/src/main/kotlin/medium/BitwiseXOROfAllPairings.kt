package medium

/**
 * You are given two 0-indexed arrays, nums1 and nums2, consisting of non-negative integers.
 * There exists another array, nums3, which contains the bitwise XOR of all pairings of integers between nums1 and nums2
 * (every integer in nums1 is paired with every integer in nums2 exactly once).
 *
 * Return the bitwise XOR of all integers in nums3.
 *
 * [URL](https://leetcode.com/problems/bitwise-xor-of-all-pairings/)
 */
object BitwiseXOROfAllPairings {

    fun xorAllNums(nums1: IntArray, nums2: IntArray): Int {
        if (nums1.size % 2 == 0 && nums2.size % 2 == 0) {
            return 0
        }
        if (nums1.size % 2 == 0) {
            return getXor(nums1)
        }
        if (nums2.size % 2 == 0) {
            return getXor(nums2)
        }
        return getXor(nums1) xor getXor(nums2)
    }

    private fun getXor(nums: IntArray): Int {
        var result = 0
        for (n in nums) {
            result = result xor n
        }

        return result
    }
}
