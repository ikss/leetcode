package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class DestroyingAsteroidsTest {
    @Test
    fun test1() {
        val mass = 10
        val asteroids = intArrayOf(3, 9, 19, 5, 21)
        val expected = true

        assertEquals(expected, DestroyingAsteroids.asteroidsDestroyed(mass, asteroids))
    }

    @Test
    fun test2() {
        val mass = 5
        val asteroids = intArrayOf(4,9,23,4)
        val expected = false

        assertEquals(expected, DestroyingAsteroids.asteroidsDestroyed(mass, asteroids))
    }
}