package arrays.easy

/**
 * A sequence of numbers is called an arithmetic progression if the difference between any two consecutive elements
 * is the same.
 *
 * Given an array of numbers arr, return true if the array can be rearranged to form an arithmetic progression.
 * Otherwise, return false.
 *
 * [URL](https://leetcode.com/problems/can-make-arithmetic-progression-from-sequence/)
 */
object CanMakeArithmeticProgressionFromSequence {
    fun canMakeArithmeticProgression(arr: IntArray): Boolean {
        arr.sort()
        val diff = arr[1] - arr[0]

        for (i in 2 until arr.size) {
            if (arr[i] - arr[i - 1] != diff) return false
        }
        return true
    }
}
