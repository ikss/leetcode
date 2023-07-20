package arrays.medium

import java.util.*


/**
 * We are given an array asteroids of integers representing asteroids in a row.
 *
 * For each asteroid, the absolute value represents its size, and the sign represents its direction
 * (positive meaning right, negative meaning left). Each asteroid moves at the same speed.
 *
 * Find out the state of the asteroids after all collisions. If two asteroids meet, the smaller one will explode.
 * If both are the same size, both will explode. Two asteroids moving in the same direction will never meet.
 *
 * [URL](https://leetcode.com/problems/asteroid-collision/)
 */
object AsteroidCollision {
    fun asteroidCollision(asteroids: IntArray): IntArray {
        val chain = Stack<Int>()

        for (asteroid in asteroids) {
            var shouldAdd = true
            while (!chain.isEmpty() && chain.peek() > 0 && asteroid < 0) {
                if (Math.abs(chain.peek()) < Math.abs(asteroid)) {
                    chain.pop()
                    continue
                } else if (Math.abs(chain.peek()) == Math.abs(asteroid)) {
                    chain.pop()
                }
                shouldAdd = false
                break
            }
            if (shouldAdd) {
                chain.push(asteroid)
            }
        }

        val size = chain.size
        val result = IntArray(size)

        for (i in size - 1 downTo 0) {
            result[i] = chain.pop()
        }
        return result
    }

}