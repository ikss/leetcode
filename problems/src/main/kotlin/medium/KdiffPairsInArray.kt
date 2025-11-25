package medium

/**
 * Given an array of integers nums and an integer k, return the number of unique k-diff pairs in the array.
 *
 * A k-diff pair is an integer pair `(nums[i], nums[j])`, where the following are true:
 * * 0 <= i, j < nums.length
 * * i != j
 * * `|nums[i] - nums[j]| == k`
 *
 * Notice that |val| denotes the absolute value of val.
 *
 * [URL](https://leetcode.com/problems/k-diff-pairs-in-an-array/)
 */
object KdiffPairsInArray {
    fun findPairs(nums: IntArray, k: Int): Int {
        var result = 0

        val map = HashMap<Int, Int>()
        for (n in nums) {
            map.merge(n, 1, Int::plus)
        }

        for ((num, freq) in map.entries) {
            if (k > 0 && map.containsKey(num + k)) {
                result++
            } else if (k == 0 && freq > 1) {
                result++
            }
        }
        return result
    }
}