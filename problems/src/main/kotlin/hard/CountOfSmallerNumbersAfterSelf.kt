package hard

/**
 * You are given an integer array nums and you have to return a new counts array.
 * The counts array has the property where `counts[i]` is the number of smaller elements to the right of `nums[i]`.
 *
 * [URL](https://leetcode.com/problems/count-of-smaller-numbers-after-self/)
 */
object CountOfSmallerNumbersAfterSelf {
    fun countSmaller(nums: IntArray): List<Int> {
        val res = IntArray(nums.size)
        val index = IntArray(res.size)
        for (i in res.indices) {
            index[i] = i
        }
        mergeSort(nums, index, 0, nums.size - 1, res)
        val list = ArrayList<Int>(res.size)
        for (i in res) {
            list.add(i)
        }
        return list
    }

    private fun mergeSort(nums: IntArray, index: IntArray, l: Int, r: Int, res: IntArray) {
        if (l >= r) return
        val mid = l + (r - l) / 2
        mergeSort(nums, index, l, mid, res)
        mergeSort(nums, index, mid + 1, r, res)
        merge(nums, index, l, mid, mid + 1, r, res)
    }

    private fun merge(nums: IntArray, index: IntArray, l1: Int, r1: Int, l2: Int, r2: Int, res: IntArray) {
        var l1 = l1
        var l2 = l2
        val start = l1
        val tmp = IntArray(r2 - l1 + 1)
        var count = 0
        var p = 0
        while (l1 <= r1 || l2 <= r2) {
            if (l1 > r1) {
                tmp[p++] = index[l2++]
            } else if (l2 > r2) {
                res[index[l1]] += count
                tmp[p++] = index[l1++]
            } else if (nums[index[l1]] > nums[index[l2]]) {
                tmp[p++] = index[l2++]
                count++
            } else {
                res[index[l1]] += count
                tmp[p++] = index[l1++]
            }
        }
        for (i in tmp.indices) {
            index[start + i] = tmp[i]
        }
    }
}
