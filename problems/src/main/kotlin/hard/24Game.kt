package hard

import kotlin.math.abs


/**
 * You are given an integer array cards of length 4. You have four cards, each containing a number in the range `[1, 9]`.
 * You should arrange the numbers on these cards in a mathematical expression using the operators `['+', '-', '*', '/']`
 * and the parentheses '(' and ')' to get the value 24.
 *
 * You are restricted with the following rules:
 * * The division operator '/' represents real division, not integer division.
 *     * For example, 4 / (1 - 2 / 3) = 4 / (1 / 3) = 12.
 * * Every operation done is between two numbers. In particular, we cannot use '-' as a unary operator.
 *     * For example, if cards = [1, 1, 1, 1], the expression "-1 - 1 - 1 - 1" is not allowed.
 * * You cannot concatenate numbers together
 *     * For example, if cards = [1, 2, 1, 2], the expression "12 + 12" is not valid.
 *
 * Return true if you can get such expression that evaluates to 24, and false otherwise.
 *
 * [URL](https://leetcode.com/problems/24-game/)
 */
object `24Game` {
    private fun generatePossibleResults(a: Double, b: Double): MutableList<Double> {
        val res: MutableList<Double> = ArrayList<Double>()
        res.add(a + b)
        res.add(a - b)
        res.add(b - a)
        res.add(a * b)
        if (b != 0.0) {
            res.add(a / b)
        }
        if (a != 0.0) {
            res.add(b / a)
        }
        return res
    }

    // Check if using current list we can react result 24.
    private fun checkIfResultReached(list: ArrayList<Double>): Boolean {
        if (list.size == 1) {
            // Base Case: We have only one number left, check if it is approximately 24.
            return abs(list[0] - 24) <= 0.1
        }

        for (i in list.indices) {
            for (j in i + 1..<list.size) {
                // Create a new list with the remaining numbers and the new result.
                val newList = ArrayList<Double>()
                for (k in list.indices) {
                    if (k != j && k != i) {
                        newList.add(list[k])
                    }
                }


                // For any two numbers in our list,
                // we perform every operation one by one.
                for (res in generatePossibleResults(list[i], list[j])) {
                    // Push the new result in the list
                    newList.add(res)

                    // Check if using this new list we can obtain the result 24.
                    if (checkIfResultReached(newList)) {
                        return true
                    }

                    // Backtrack: remove the result from the list.
                    newList.removeAt(newList.size - 1)
                }
            }
        }
        return false
    }

    fun judgePoint24(cards: IntArray): Boolean {
        val list = ArrayList<Double>()
        for (card in cards) {
            list.add(card.toDouble())
        }

        return checkIfResultReached(list)
    }
}
