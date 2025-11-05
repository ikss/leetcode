package arrays.easy

/**
 * You are given an integer array nums.
 *
 * Start by selecting a starting position curr such that `nums[curr] == 0`,
 * and choose a movement direction of either left or right.
 *
 * After that, you repeat the following process:
 * * If curr is out of the range [0, n - 1], this process ends.
 * * If `nums[curr] == 0`, move in the current direction by incrementing curr if you are moving right,
 * or decrementing curr if you are moving left.
 * * Else if `nums[curr] > 0`:
 *    * Decrement `nums[curr]` by 1.
 *    * Reverse your movement direction (left becomes right and vice versa).
 *    * Take a step in your new direction.
 * A selection of the initial position curr and movement direction is considered valid if every element
 * in nums becomes 0 by the end of the process.
 *
 * Return the number of possible valid selections.
 *
 * [URL](https://leetcode.com/problems/make-array-elements-equal-to-zero/)
 */
object MakeArrayElementsEqualToZero {
    fun countValidSelections(nums: IntArray): Int {
        var nonZero = 0
        val starts = ArrayList<Int>()
        for (i in nums.indices) {
            if (nums[i] == 0) {
                starts.add(i)
            } else {
                nonZero++
            }
        }
        if (nonZero == 0) {
            return nums.size * 2
        }

        var result = 0
        val tempArray = IntArray(nums.size)
        for (start in starts) {
            System.arraycopy(nums, 0, tempArray, 0, nums.size)
            if (valid(tempArray, start, -1, nonZero)) {
                result++
            }
            System.arraycopy(nums, 0, tempArray, 0, nums.size)
            if (valid(tempArray, start, 1, nonZero)) {
                result++
            }
        }
        return result
    }

    private fun valid(nums: IntArray, start: Int, dir: Int, nonZero: Int): Boolean {
        var nonZero = nonZero
        var dir = dir
        var curr = start
        while (nonZero > 0) {
            curr += dir
            if (curr !in 0..nums.size - 1) return false
            if (nums[curr] > 0) {
                nums[curr]--
                dir = -dir
                if (nums[curr] == 0) {
                    nonZero--
                }
            }
        }
        return true
    }
}
