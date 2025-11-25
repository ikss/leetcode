package easy

/**
 * There is a programming language with only four operations and one variable X:
 *
 * * ++X and X++ increments the value of the variable X by 1.
 * * --X and X-- decrements the value of the variable X by 1.
 *
 * Initially, the value of X is 0.
 *
 * Given an array of strings operations containing a list of operations,
 * return the final value of X after performing all the operations.
 *
 * [URL](https://leetcode.com/problems/final-value-of-variable-after-performing-operations/)
 */
object FinalValueOfVariableAfterPerformingOperations {
    fun finalValueAfterOperations(operations: Array<String>): Int {
        var result = 0

        for (op in operations) {
            if (op[1] == '-') {
                result--
            } else {
                result++
            }
        }

        return result
    }
}