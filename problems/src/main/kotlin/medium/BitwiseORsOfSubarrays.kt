package medium

/**
 * Given an integer array arr, return the number of distinct bitwise ORs of all the non-empty subarrays of arr.
 *
 * The bitwise OR of a subarray is the bitwise OR of each integer in the subarray.
 * The bitwise OR of a subarray of one integer is that integer.
 *
 * A subarray is a contiguous non-empty sequence of elements within an array.
 *
 * [URL](https://leetcode.com/problems/bitwise-ors-of-subarrays/)
 */
object BitwiseORsOfSubarrays {
    fun subarrayBitwiseORs(arr: IntArray): Int {
        val result = HashSet<Int>()
        var curr = HashSet<Int>()
        curr.add(0)

        for (n in arr) {
            val curr2 = HashSet<Int>()
            curr2.add(n)
            for (c in curr) {
                curr2.add(c or n)
            }
            curr = curr2
            result.addAll(curr)
        }

        return result.size
    }
}
