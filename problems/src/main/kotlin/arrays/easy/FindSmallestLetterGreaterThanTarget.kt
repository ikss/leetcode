package arrays.easy

/**
 * You are given an array of characters letters that is sorted in non-decreasing order, and a character target.
 * There are at least two different characters in letters.
 *
 * Return the smallest character in letters that is lexicographically greater than target.
 * If such a character does not exist, return the first character in letters.
 *
 * [URL](https://leetcode.com/problems/find-smallest-letter-greater-than-target/)
 */
object FindSmallestLetterGreaterThanTarget {
    fun nextGreatestLetter(letters: CharArray, target: Char): Char {
        var left = 0
        var right = letters.size - 1
        while (left <= right) {
            val mid = left + (right - left) / 2
            if (letters[mid] <= target) {
                left = mid + 1
            } else {
                right = mid - 1
            }
        }

        return if (left == letters.size) letters[0] else letters[left]
    }
}
