package data_structures.arrays.medium

/**
 * Given an integer array nums, handle multiple queries of the following types:
 *
 *  * Update the value of an element in nums.
 *  * Calculate the sum of the elements of nums between indices left and right inclusive where left <= right.
 *
 * Implement the NumArray class:
 *
 *  * NumArray(int[] nums) Initializes the object with the integer array nums.
 *  * void update(int index, int val) Updates the value of `nums[index]` to be val.
 *  * int sumRange(int left, int right) Returns the sum of the elements of nums between indices left and right inclusive
 *  (i.e. `nums[left]` + `nums[left + 1]` + ... + `nums[right]`).
 *
 * [URL](https://leetcode.com/problems/range-sum-query-mutable/)
 */
object RangeSumQueryMutable {
    class NumArrayNaive(val nums: IntArray) {
        fun update(index: Int, `val`: Int) {
            nums[index] = `val`
        }

        fun sumRange(left: Int, right: Int): Int {
            var sum = 0
            for (i in left..right) {
                sum += nums[i]
            }
            return sum
        }

    }


    class NumArrayPrecalculatedSums(val nums: IntArray) {
        private var sums: IntArray
        private var len = 0

        init {
            val l = Math.sqrt(nums.size.toDouble())
            len = Math.ceil(nums.size / l).toInt()
            sums = IntArray(len)
            for (i in nums.indices) {
                sums[i / len] += nums[i]
            }
        }

        fun sumRange(i: Int, j: Int): Int {
            var sum = 0
            val startBlock = i / len
            val endBlock = j / len
            if (startBlock == endBlock) {
                for (k in i..j) sum += nums[k]
                return sum
            } else {
                for (k in i until (startBlock + 1) * len) sum += nums[k]
                for (k in startBlock + 1 until endBlock) sum += sums[k]
                for (k in endBlock * len..j) sum += nums[k]
            }
            return sum
        }

        fun update(i: Int, `val`: Int) {
            val b_l = i / len
            sums[b_l] = sums[b_l] - nums[i] + `val`
            nums[i] = `val`
        }
    }
}
