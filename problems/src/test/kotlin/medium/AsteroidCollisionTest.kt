package medium

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class AsteroidCollisionTest {
    @Test
    fun test1() {
        val asteroids = intArrayOf(5, 10, -5)
        val expected = intArrayOf(5, 10)
        val actual = AsteroidCollision.asteroidCollision(asteroids)
        assertArrayEquals(expected, actual)
    }

    @Test
    fun test2() {
        val asteroids = intArrayOf(8, -8)
        val expected = intArrayOf()
        val actual = AsteroidCollision.asteroidCollision(asteroids)
        assertArrayEquals(expected, actual)
    }

    @Test
    fun test3() {
        val asteroids = intArrayOf(10, 2, -5)
        val expected = intArrayOf(10)
        val actual = AsteroidCollision.asteroidCollision(asteroids)
        assertArrayEquals(expected, actual)
    }
}