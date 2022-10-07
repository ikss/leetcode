package math.easy

import interfaces.GuessEngine

/**
 * We are playing the Guess Game. The game is as follows:
 *
 * I pick a number from 1 to n. You have to guess which number I picked.
 *
 * Every time you guess wrong, I will tell you whether the number I picked is higher or lower than your guess.
 *
 * You call a pre-defined API int guess(int num), which returns three possible results:
 *
 * * -1: Your guess is higher than the number I picked (i.e. num > pick).
 * * 1: Your guess is lower than the number I picked (i.e. num < pick).
 * * 0: your guess is equal to the number I picked (i.e. num == pick).
 * Return the number that I picked.
 *
 * [URL](https://leetcode.com/problems/guess-number-higher-or-lower/)
 */
abstract class GuessNumber : GuessEngine {
    fun guessNumber(n: Int): Int {
        var min = 0
        var max = n

        while (min <= max) {
            val temp = (max - min) / 2 + min
            when (guess(temp)) {
                -1 -> max = temp - 1
                0 -> return temp
                else -> min = temp + 1
            }
        }
        return -1
    }
}
