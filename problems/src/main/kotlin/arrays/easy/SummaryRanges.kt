package arrays.easy

/**
 * You are given a sorted unique integer array nums.
 *
 * A range `[a,b]` is the set of all integers from a to b (inclusive).
 *
 * Return the smallest sorted list of ranges that cover all the numbers in the array exactly.
 * That is, each element of nums is covered by exactly one of the ranges, and there is no integer x such that x is
 * in one of the ranges but not in nums.
 *
 * Each range `[a,b]` in the list should be output as:
 * * "a->b" if a != b
 * * "a" if a == b
 *
 * [URL](https://leetcode.com/problems/two-sum/)
 */
object SummaryRanges {
    fun summaryRanges(nums: IntArray): List<String> {
        val result = ArrayList<String>()
        var i = 0

        while (i < nums.size) {
            val start = nums[i]
            // Keep iterating until the next element is one more than the current element.
            while (i + 1 < nums.size && nums[i] + 1 == nums[i + 1]) {
                i++
            }
            val end = nums[i]
            if (start != end) {
                result.add("$start->$end")
            } else {
                result.add("$start")
            }
            i++
        }
        return result
    }
}
