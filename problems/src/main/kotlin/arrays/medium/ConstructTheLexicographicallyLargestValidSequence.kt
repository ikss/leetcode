package arrays.medium

import java.util.*

/**
 * Given an integer n, find a sequence that satisfies all of the following:
 *
 * * The integer 1 occurs once in the sequence.
 * * Each integer between 2 and n occurs twice in the sequence.
 * * For every integer i between 2 and n, the distance between the two occurrences of i is exactly i.
 *
 * The distance between two numbers on the sequence, `a[i] and a[j]`, is the absolute difference of their indices,
 * |j - i|.
 *
 * Return the lexicographically largest sequence. It is guaranteed that under the given constraints,
 * there is always a solution.
 *
 * A sequence a is lexicographically larger than a sequence b (of the same length) if in the first position where
 * a and b differ, sequence a has a number greater than the corresponding number in b. For example, `[0,1,9,0]` is
 * lexicographically larger than `[0,1,5,6]` because the first position they differ is at the third number,
 * and 9 is greater than 5.
 *
 * [URL](https://leetcode.com/problems/construct-the-lexicographically-largest-valid-sequence/)
 */
object ConstructTheLexicographicallyLargestValidSequence {

    fun constructDistancedSequence(targetNumber: Int): IntArray {
        val result = IntArray(targetNumber * 2 - 1)

        val isNumberUsed = BooleanArray(targetNumber + 1)

        findLexicographicallyLargestSequence(
            0,
            result,
            isNumberUsed,
            targetNumber
        )

        return result
    }

    private fun findLexicographicallyLargestSequence(
        curr: Int,
        result: IntArray,
        isNumberUsed: BooleanArray,
        targetNumber: Int,
    ): Boolean {
        // If we have filled all positions, return true indicating success
        if (curr == result.size) {
            return true
        }

        // If the current position is already filled, move to the next index
        if (result[curr] != 0) {
            return findLexicographicallyLargestSequence(curr + 1, result, isNumberUsed, targetNumber)
        }

        // Attempt to place numbers from targetNumber to 1 for a
        // lexicographically largest result
        for (numberToPlace in targetNumber downTo 1) {
            if (isNumberUsed[numberToPlace]) continue

            isNumberUsed[numberToPlace] = true
            result[curr] = numberToPlace

            // If placing number 1, move to the next index directly
            if (numberToPlace == 1) {
                if (findLexicographicallyLargestSequence(curr + 1, result, isNumberUsed, targetNumber)) {
                    return true
                }
            } else if (curr + numberToPlace < result.size && result[curr + numberToPlace] == 0) {
                result[curr + numberToPlace] = numberToPlace

                if (findLexicographicallyLargestSequence(curr + 1, result, isNumberUsed, targetNumber)) {
                    return true
                }

                // Undo the placement for backtracking
                result[curr + numberToPlace] = 0
            }

            // Undo current placement and mark the number as unused
            result[curr] = 0
            isNumberUsed[numberToPlace] = false
        }

        return false
    }

}