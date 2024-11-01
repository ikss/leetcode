package arrays.easy

/**
 * You are given a 0-indexed array mountain. Your task is to find all the peaks in the mountain array.
 *
 * Return an array that consists of indices of peaks in the given array in any order.
 *
 * Notes:
 *
 * A peak is defined as an element that is strictly greater than its neighboring elements.
 * The first and last elements of the array are not a peak.
 *
 * [URL](https://leetcode.com/problems/find-the-peaks/)
 */
object FindThePeaks {
    fun findPeaks(mountain: IntArray): List<Int> {
        val result = ArrayList<Int>(mountain.size - 2)

        for (i in 1 until mountain.size - 1) {
            if (mountain[i] > mountain[i - 1] && mountain[i] > mountain[i + 1]) {
                result.add(i)
            }
        }

        return result
    }
}
