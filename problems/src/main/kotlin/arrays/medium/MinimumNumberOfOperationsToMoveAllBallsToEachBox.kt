package arrays.medium

/**
 * You have n boxes. You are given a binary string boxes of length n, where `boxes[i]` is '0' if the ith box is empty,
 * and '1' if it contains one ball.
 *
 * In one operation, you can move one ball from a box to an adjacent box. Box i is adjacent to box j if abs(i - j) == 1.
 * Note that after doing so, there may be more than one ball in some boxes.
 *
 * Return an array answer of size n, where `answer[i]` is the minimum number of operations needed to move all the balls
 * to the ith box.
 *
 * Each `answer[i]` is calculated considering the initial state of the boxes.
 *
 * [URL](https://leetcode.com/problems/minimum-number-of-operations-to-move-all-balls-to-each-box/)
 */
object MinimumNumberOfOperationsToMoveAllBallsToEachBox {
    fun minOperations(boxes: String): IntArray {
        val n = boxes.length
        val result = IntArray(n)

        var currBalls = 0
        var currMoves = 0
        for (i in 0 until n) {
            currMoves += currBalls
            result[i] = currMoves
            if (boxes[i] == '1') {
                currBalls++
            }
        }

        currBalls = 0
        currMoves = 0
        for (i in n - 1 downTo 0) {
            currMoves += currBalls
            result[i] += currMoves
            if (boxes[i] == '1') {
                currBalls++
            }
        }

        return result
    }
}
