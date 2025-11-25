package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class LineReflectionTest {
    @Test
    fun test1() {
        val points = arrayOf(intArrayOf(1, 1), intArrayOf(-1, 1))
        val expected = true

        assertEquals(expected, LineReflection.isReflected(points))
    }

    @Test
    fun test2() {
        val points = arrayOf(intArrayOf(1, 1), intArrayOf(-1, -1))
        val expected = false

        assertEquals(expected, LineReflection.isReflected(points))
    }

    @Test
    fun test3() {
        val points = arrayOf(intArrayOf(0, 0), intArrayOf(1, 0), intArrayOf(3, 0))
        val expected = false

        assertEquals(expected, LineReflection.isReflected(points))
    }
}