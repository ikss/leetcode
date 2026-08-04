package easy

/**
 * You are given an integer array nums consisting of unique integers.
 *
 * Originally, nums contained every integer within a certain range.
 * However, some integers might have gone missing from the array.
 *
 * The smallest and largest integers of the original range are still present in nums.
 *
 * Return a sorted list of all the missing integers in this range. If no integers are missing, return an empty list.
 *
 * [URL](https://leetcode.com/problems/find-missing-elements/)
 */
object FindMissingElements {
    fun findMissingElements(nums: IntArray): List<Int> {
        val seen = BooleanArray(101)
        var min = 101
        var max = 0

        for (n in nums) {
            seen[n] = true
            max = maxOf(max, n)
            min = minOf(min, n)
        }
        if (max - min + 1 == nums.size) {
            return emptyList()
        }

        val result = ArrayList<Int>()

        var started = false
        for (i in min + 1 until max) {
            if (!seen[i]) {
                result.add(i)
            }
        }

        return result
    }
}