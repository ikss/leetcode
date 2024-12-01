package arrays.easy

/**
 * Given an array arr of integers, check if there exist two indices i and j such that :
 * * i != j
 * * 0 <= i, j < arr.length
 * * `arr[i] == 2 * arr[j]`
 *
 * [URL](https://leetcode.com/problems/check-if-n-and-its-double-exist/)
 */
object CheckIfNAndItsDoubleExist {
    fun checkIfExist(arr: IntArray): Boolean {
        val set = HashSet<Int>()

        for (n in arr) {
            if (n * 2 in set || (n % 2 == 0 && n / 2 in set)) {
                return true
            }
            set.add(n)
        }
        return false
    }
}
