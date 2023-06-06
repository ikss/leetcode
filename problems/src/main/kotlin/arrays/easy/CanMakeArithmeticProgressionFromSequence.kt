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
    fun canMakeArithmeticProgressionSort(arr: IntArray): Boolean {
        arr.sort()
        val diff = arr[1] - arr[0]

        for (i in 2 until arr.size) {
            if (arr[i] - arr[i - 1] != diff) return false
        }
        return true
    }

    fun canMakeArithmeticProgressionOptimized(arr: IntArray): Boolean {
        val n = arr.size
        val (min, max) = arr.findMinMax()

        if (min == max) return true
        if ((max - min) % (n - 1) != 0) return false
        val delta = (max - min) / (n - 1)

        val set = HashSet<Int>()
        for (el in arr) {
            if (((el - min) % delta != 0) || !set.add(el)) return false
        }
        return true
    }

    private fun IntArray.findMinMax(): Pair<Int, Int> {
        var min = Int.MAX_VALUE
        var max = Int.MIN_VALUE

        for (n in this) {
            if (n < min) min = n
            if (n > max) max = n
        }
        return min to max
    }
}
