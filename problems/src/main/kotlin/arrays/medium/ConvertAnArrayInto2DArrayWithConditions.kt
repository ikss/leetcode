package arrays.medium


/**
 * You are given an integer array nums. You need to create a 2D array from nums satisfying the following conditions:
 *
 * * The 2D array should contain only the elements of the array nums.
 * * Each row in the 2D array contains distinct integers.
 * * The number of rows in the 2D array should be minimal.
 *
 * Return the resulting array. If there are multiple answers, return any of them.
 *
 * Note that the 2D array can have a different number of elements on each row.
 *
 * [URL](https://leetcode.com/problems/convert-an-array-into-a-2d-array-with-conditions/)
 */
object ConvertAnArrayInto2DArrayWithConditions {
    fun findMatrixMap(nums: IntArray): List<List<Int>> {
        val nextRowIndex = HashMap<Int, Int>()
        val result = ArrayList<ArrayList<Int>>()

        for (n in nums) {
            val row = nextRowIndex.merge(n, 1, Integer::sum)!! - 1
            if (row >= result.size) {
                result.add(ArrayList())
            }
            result[row].add(n)
        }

        return result
    }

    fun findMatrixArray(nums: IntArray): List<MutableList<Int>> {
        val freq = IntArray(nums.size + 1)

        val result = ArrayList<MutableList<Int>>()
        for (c in nums) {
            if (freq[c] >= result.size) {
                result.add(ArrayList())
            }

            result[freq[c]].add(c)
            freq[c]++
        }

        return result
    }
}
