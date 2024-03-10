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
        var length_ = arr.size - 1

        // Find the number of zeros to be duplicated
        // Stopping when left points beyond the last element in the original array
        // which would be part of the modified array
        for (left in 0..length_ - possibleDups) {

            // Count the zeros
            if (arr[left] == 0) {
                // Edge case: This zero can't be duplicated. We have no more space,
                // as left is pointing to the last element which could be included  
                if (left == length_ - possibleDups) {
                    // For this zero we just copy it without duplication.
                    arr[length_] = 0
                    length_ -= 1
                    break
                }
                possibleDups++
            }
            if (left >= length_ - possibleDups) break
        }

        // Start backwards from the last element which would be part of new array.
        val last = length_ - possibleDups

        // Copy zero twice, and non zero once.
        for (i in last downTo 0) {
            arr[i + possibleDups] = arr[i]
            if (arr[i] == 0) {
                possibleDups--
                arr[i + possibleDups] = 0
            }
        }
    }
}
