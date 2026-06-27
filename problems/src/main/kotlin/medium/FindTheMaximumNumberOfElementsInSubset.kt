package medium

/**
 * You are given an array of positive integers nums.
 *
 * You need to select a subset of nums which satisfies the following condition:
 *
 * * You can place the selected elements in a 0-indexed array such that it follows the pattern:
 * `[x, x2, x4, ..., xk/2, xk, xk/2, ..., x4, x2, x]` (Note that k can be be any non-negative power of 2).
 * For example, `[2, 4, 16, 4, 2]` and `[3, 9, 3]` follow the pattern while `[2, 4, 8, 4, 2]` does not.
 * Return the maximum number of elements in a subset that satisfies these conditions.
 *
 * [URL](https://leetcode.com/problems/find-the-maximum-number-of-elements-in-subset/)
 */
object FindTheMaximumNumberOfElementsInSubset {
    fun maximumLength(nums: IntArray): Int {
        val counts = HashMap<Int, Int>()

        for (n in nums) {
            counts[n] = counts.getOrDefault(n, 0) + 1
        }

        var result = 0
        val computed = HashMap<Int, Int>()
        for ((num, _) in counts) {
            result = maxOf(result, computeMax(num, computed, counts))
        }

        return result
    }

    private fun computeMax(num: Int, computed: HashMap<Int, Int>, counts: HashMap<Int, Int>): Int {
        computed[num]?.let {
            return it
        }
        val count = counts[num]
        val result = if (count == null || count == 0) {
            0
        } else if (count == 1) {
            1
        } else {
            counts[num] = count - 2
            val res = computeMax(num * num, computed, counts)
            if (res == 0) 1 else 2 + computeMax(num * num, computed, counts)
        }
        computed[num] = result

        return result
    }
}
