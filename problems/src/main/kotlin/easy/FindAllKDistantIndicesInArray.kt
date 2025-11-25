package easy

/**
 * You are given a 0-indexed integer array nums and two integers key and k. A k-distant index is an index i of nums
 * for which there exists at least one index j such that |i - j| <= k and `nums[j] == key`.
 *
 * Return a list of all k-distant indices sorted in increasing order.
 *
 * [URL](https://leetcode.com/problems/find-all-k-distant-indices-in-an-array/)
 */
object FindAllKDistantIndicesInArray {
    fun findKDistantIndices(nums: IntArray, key: Int, k: Int): List<Int> {
        val result = ArrayList<Int>()

        for (i in nums.indices) {
            if (nums[i] != key) continue

            val left = maxOf((result.lastOrNull() ?: -1) + 1, i - k)
            val right = minOf(nums.size - 1, i + k)
            for (j in left .. right) {
                result.add(j)
            }
        }


        return result.toList()
    }
}
