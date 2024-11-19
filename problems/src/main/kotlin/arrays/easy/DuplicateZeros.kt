package arrays.easy

/**
 * Given an array of integers nums which is sorted in ascending order, and an integer target, write a function
 * to search target in nums. If target exists, then return its index. Otherwise, return -1.
 * You must write an algorithm with O(log n) runtime complexity.
 *
 * [URL](https://leetcode.com/problems/duplicate-zeros/)
 */
object DuplicateZeros {
    fun duplicateZeros(arr: IntArray) {
        var possibleDups = 0
        var len = arr.size - 1

        var left = 0
        while (left <= len - possibleDups) {
            if (arr[left] == 0) {
                if (left == len - possibleDups) {
                    arr[len] = 0
                    len -= 1
                    break
                }
                possibleDups++
            }
            left++
        }

        val last = len - possibleDups

        for (i in last downTo 0) {
            arr[i + possibleDups] = arr[i]
            if (arr[i] == 0) {
                possibleDups--
                arr[i + possibleDups] = 0
            }
        }
    }
}
