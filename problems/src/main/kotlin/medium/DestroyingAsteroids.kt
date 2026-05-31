package medium

import java.util.PriorityQueue

/**
 * You are given an integer mass, which represents the original mass of a planet.
 * You are further given an integer array asteroids, where `asteroids[i]` is the mass of the ith asteroid.
 *
 * You can arrange for the planet to collide with the asteroids in any arbitrary order.
 * If the mass of the planet is greater than or equal to the mass of the asteroid,
 * the asteroid is destroyed and the planet gains the mass of the asteroid. Otherwise, the planet is destroyed.
 *
 * Return true if all asteroids can be destroyed. Otherwise, return false.
 *
 * [URL](https://leetcode.com/problems/destroying-asteroids/)
 */
object DestroyingAsteroids {
    fun asteroidsDestroyed(mass: Int, asteroids: IntArray): Boolean {
        var mass = mass.toLong()
        val pq = PriorityQueue<Int>()

        for (a in asteroids) {
            if (mass < a) {
                pq.offer(a)
                continue
            }
            mass += a
            while (pq.isNotEmpty() && mass >= pq.peek()) {
                mass += pq.poll()
            }
        }
        return pq.isEmpty()
    }
}
