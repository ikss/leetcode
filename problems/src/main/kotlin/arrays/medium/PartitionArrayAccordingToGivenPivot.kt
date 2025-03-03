package arrays.medium

/**
 * You are given a 0-indexed integer array nums and an integer pivot.
 * Rearrange nums such that the following conditions are satisfied:
 * * Every element less than pivot appears before every element greater than pivot.
 * * Every element equal to pivot appears in between the elements less than and greater than pivot.
 * * The relative order of the elements less than pivot and the elements greater than pivot is maintained.
 * * * More formally, consider every pi, pj where pi is the new position of the ith element and pj is the new position
 * of the jth element. If i < j and both elements are smaller (or larger) than pivot, then pi < pj.
 *
 * Return nums after the rearrangement.
 *
 * [URL](https://leetcode.com/problems/partition-array-according-to-given-pivot/)
 */
object PartitionArrayAccordingToGivenPivot {
    fun pivotArray(nums: IntArray, pivot: Int): IntArray {
        var less = 0
        var eq = 0
        for (n in nums) {
            if (n < pivot) {
                less++
            } else if (n == pivot) {
                eq++
            }
        }

        val result = IntArray(nums.size)

        var il = 0
        var iq = less
        var ih = less + eq
        for (n in nums) {
            if (n < pivot) {
                result[il++] = n
            } else if (n > pivot) {
                result[ih++] = n
            } else {
                result[iq++] = pivot
            }
        }

        return result
    }
}