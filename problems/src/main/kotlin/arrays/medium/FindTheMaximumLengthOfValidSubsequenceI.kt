package arrays.medium

/**
 * You are given an integer array nums.
 * A subsequence sub of nums with length x is called valid if it satisfies:
 *
 * (sub[0] + sub[1]) % 2 == (sub[1] + sub[2]) % 2 == ... == (sub[x - 2] + sub[x - 1]) % 2.
 * Return the length of the longest valid subsequence of nums.
 *
 * A subsequence is an array that can be derived from another array by deleting some or no elements without changing
 * the order of the remaining elements.
 *
 * [URL](https://leetcode.com/problems/find-the-maximum-length-of-valid-subsequence-i/)
 */
object FindTheMaximumLengthOfValidSubsequenceI {
    fun maximumLength(nums: IntArray): Int {
        val intArray = IntArray(4)
        // 0 -> all evens
        // 1 -> all odds
        // 2 -> flip starting with even
        // 3 -> flip starting with odd

        for (n in nums) {
            val isEven = n % 2 == 0

            if (isEven) {
                intArray[0]++
                if (intArray[2] % 2 == 0) {
                    intArray[2]++
                }
                if (intArray[3] % 2 != 0) {
                    intArray[3]++
                }
            } else {
                intArray[1]++
                if (intArray[2] % 2 != 0) {
                    intArray[2]++
                }
                if (intArray[3] % 2 == 0) {
                    intArray[3]++
                }
            }
        }

        return intArray.max()
    }
}
