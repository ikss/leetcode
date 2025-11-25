package easy

import java.util.*

/**
 * You are given an integer array gifts denoting the number of gifts in various piles. Every second, you do the following:
 * * Choose the pile with the maximum number of gifts.
 * * If there is more than one pile with the maximum number of gifts, choose any.
 * * Leave behind the floor of the square root of the number of gifts in the pile. Take the rest of the gifts.
 *
 * Return the number of gifts remaining after k seconds.
 *
 * [URL](https://leetcode.com/problems/take-gifts-from-the-richest-pile/)
 */
object TakeGiftsFromTheRichestPile {
    fun pickGifts(gifts: IntArray, k: Int): Long {
        var sum = 0L
        val queue = PriorityQueue<Int> { g1, g2 -> g2 - g1 }
        for (g in gifts) {
            sum += g
            queue.offer(g)
        }

        for (i in 1 .. k) {
            val pile = queue.poll()
            val sqrt = Math.sqrt(pile.toDouble()).toInt()
            val removed = pile - sqrt
            if (removed == 0) break

            sum -= removed
            queue.offer(sqrt)
        }

        return sum
    }
}
