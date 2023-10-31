package arrays.medium

/**
 * You are given an integer array pref of size n. Find and return the array arr of size n that satisfies:
 * * `pref[i] = arr[0] ^ arr[1] ^ ... ^ arr[i]`.
 *
 * Note that ^ denotes the bitwise-xor operation.
 *
 * It can be proven that the answer is unique.
 *
 * [URL](https://leetcode.com/problems/find-the-original-array-of-prefix-xor/)
 */
object FindTheOriginalArrayOfPrefixXor {
    fun findArray(pref: IntArray): IntArray {
        return IntArray(pref.size) {
            if (it == 0) pref[0] else pref[it] xor pref[it - 1]
        }
    }
}
