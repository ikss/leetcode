package arrays.medium

import java.util.*

/**
 * You have an initial power of power, an initial score of 0, and a bag of tokens
 * where `tokens[i]` is the value of the ith token (0-indexed).
 *
 * Your goal is to maximize your total score by potentially playing each token in one of two ways:
 *
 * * If your current power is at least `tokens[i]`, you may play the ith token face up,
 * losing `tokens[i]` power and gaining 1 score.
 * * If your current score is at least 1, you may play the ith token face down,
 * gaining `tokens[i]` power and losing 1 score.
 *
 * Each token may be played at most once and in any order. You do not have to play all the tokens.
 *
 * Return the largest possible score you can achieve after playing any number of tokens.
 *
 * [URL](https://leetcode.com/problems/bag-of-tokens/)
 */
object BagOfTokens {
    fun bagOfTokensScore(tokens: IntArray, power: Int): Int {
        tokens.sort()
        var start = 0
        var end = tokens.size - 1

        var result = 0
        var power = power

        while (start <= end && power >= tokens[start]) {
            power -= tokens[start++]
            result++
            if (start < end && power < tokens[start]) {
                power += tokens[end--]
                result--
            }

        }

        return result
    }

}