package arrays.medium

/**
 * A sequence of numbers is called arithmetic if it consists of at least two elements, and the difference between every
 * two consecutive elements is the same. More formally, a sequence s is arithmetic if and only if
 * `s[i+1] - s[i] == s[1] - s[0]` for all valid i.
 *
 * For example, these are arithmetic sequences:
 * 1, 3, 5, 7, 9
 * 7, 7, 7, 7
 * 3, -1, -5, -9
 *
 * The following sequence is not arithmetic:
 * 1, 1, 2, 5, 7
 *
 * You are given an array of n integers, nums, and two arrays of m integers each, l and r, representing the m range
 * queries, where the ith query is the range `[l[i], r[i]]`. All the arrays are 0-indexed.
 *
 * Return a list of boolean elements answer, where `answer[i]` is true if the subarray
 * `nums[l[i]], nums[l[i]+1], ... , nums[r[i]]` can be rearranged to form an arithmetic sequence, and false otherwise.
 *
 * [URL](https://leetcode.com/problems/arithmetic-subarrays/)
 */
object ArithmeticSubarrays {

    fun checkArithmeticSubarrays(nums: IntArray, l: IntArray, r: IntArray): List<Boolean> {
        val result = ArrayList<Boolean>(l.size)
        for (i in l.indices) {
            val arr = IntArray(r[i] - l[i] + 1)
            for (j in arr.indices) {
                arr[j] = nums[l[i] + j]
            }
            result.add(check(arr))
        }
        return result
    }

    private fun check(arr: IntArray): Boolean {
        var min = Int.MAX_VALUE
        var max = Int.MIN_VALUE
        val unique = HashSet<Int>()
        
        for (num in arr) {
            min = minOf(min, num)
            max = maxOf(max, num)
            unique.add(num)
        }
        if ((max - min) % (arr.size - 1) != 0) {
            return false
        }
        val diff = (max - min) / (arr.size - 1)
        var curr = min + diff
        while (curr < max) {
            if (!unique.contains(curr)) {
                return false
            }
            curr += diff
        }
        return true
    }
}
