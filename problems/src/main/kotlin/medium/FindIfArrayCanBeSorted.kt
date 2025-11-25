package medium

/**
 * You are given a 0-indexed array of positive integers nums.
 *
 * In one operation, you can swap any two adjacent elements if they have the same number of set bits
 * You are allowed to do this operation any number of times (including zero).
 *
 * Return true if you can sort the array, else return false.
 *
 * [URL](https://leetcode.com/problems/find-if-array-can-be-sorted/)
 */
object FindIfArrayCanBeSorted {
    fun canSortArray(nums: IntArray): Boolean {
        val bitcount = HashMap<Int, Int>()
        var i = 0
        while (i < nums.size - 1) {
            val n1 = nums[i]
            val n2 = nums[i + 1]
            if (n1 <= n2) {
                i++
                continue
            }
            val bc1 = bitcount.computeIfAbsent(n1) { countBits(n1) }
            val bc2 = bitcount.computeIfAbsent(n2) { countBits(n2) }
            if (bc1 != bc2) return false
            nums[i] = n2
            nums[i + 1] = n1
            if (i > 0) {
                i--
            }
        }
        return true
    }

    private fun countBits(n: Int): Int {
        var bits = 0
        var n = n

        while (n > 0) {
            n = n and (n - 1)
            bits++
        }

        return bits
    }
}