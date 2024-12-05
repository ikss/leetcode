package strings.medium


/**
 * You are given two strings start and target, both of length n.
 * Each string consists only of the characters 'L', 'R', and '_' where:
 * * The characters 'L' and 'R' represent pieces, where a piece 'L' can move to the left only if there is a blank space
 * directly to its left, and a piece 'R' can move to the right only if there is a blank space directly to its right.
 * * The character '_' represents a blank space that can be occupied by any of the 'L' or 'R' pieces.
 *
 * Return true if it is possible to obtain the string target by moving the pieces of the string start any number of
 * times. Otherwise, return false.
 *
 * [URL](https://leetcode.com/problems/move-pieces-to-obtain-a-string/)
 */
object MovePiecesToObtainString {

    fun canChange(start: String, target: String): Boolean {
        val startLength = start.length
        var startIndex = 0
        var targetIndex = 0

        while (startIndex < startLength || targetIndex < startLength) {
            while (startIndex < startLength && start[startIndex] == '_') {
                startIndex++
            }
            while (targetIndex < startLength && target[targetIndex] == '_') {
                targetIndex++
            }
            if (startIndex == startLength || targetIndex == startLength) {
                return startIndex == startLength && targetIndex == startLength
            }

            if (
                start[startIndex] != target[targetIndex] ||
                (start[startIndex] == 'L' && startIndex < targetIndex) ||
                (start[startIndex] == 'R' && startIndex > targetIndex)
            ) return false

            startIndex++
            targetIndex++
        }

        return true
    }
}