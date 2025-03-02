package arrays.medium

/**
 * You are given two 2D integer arrays nums1 and nums2.
 * * `nums1[i] = [idi, vali]` indicate that the number with the id idi has a value equal to vali.
 * * `nums2[i] = [idi, vali]` indicate that the number with the id idi has a value equal to vali.
 *
 * Each array contains unique ids and is sorted in ascending order by id.
 *
 * Merge the two arrays into one array that is sorted in ascending order by id, respecting the following conditions:
 * * Only ids that appear in at least one of the two arrays should be included in the resulting array.
 * * Each id should be included only once and its value should be the sum of the values of this id in the two arrays.
 * If the id does not exist in one of the two arrays, then assume its value in that array to be 0.
 *
 * Return the resulting array. The returned array must be sorted in ascending order by id.
 *
 * [URL](https://leetcode.com/problems/merge-two-2d-arrays-by-summing-values/)
 */
object MergeTwo2DArraysBySummingValues {
    fun mergeArrays(nums1: Array<IntArray>, nums2: Array<IntArray>): Array<IntArray> {
        val result = ArrayList<IntArray>(maxOf(nums1.size, nums2.size))

        var i1 = 0
        var i2 = 0

        while (i1 < nums1.size && i2 < nums2.size) {
            val n1 = nums1[i1]
            val n2 = nums2[i2]

            if (n1[0] < n2[0]) {
                result.add(n1)
                i1++
            } else if (n1[0] == n2[0]) {
                n1[1] += n2[1]
                result.add(n1)
                i1++
                i2++
            } else {
                result.add(n2)
                i2++
            }
        }

        while (i1 < nums1.size) {
            result.add(nums1[i1++])
        }

        while (i2 < nums2.size) {
            result.add(nums2[i2++])
        }

        return result.toTypedArray()
    }
}
