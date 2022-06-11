package math.easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class PascalTriangleTest {

    @Test
    fun test1() {
        val n = 5
        val expected = listOf(listOf(1), listOf(1, 1), listOf(1, 2, 1), listOf(1, 3, 3, 1), listOf(1, 4, 6, 4, 1))

        assertEquals(expected, PascalTriangle.generate(n))
    }

    @Test
    fun test2() {
        val n = 1
        val expected = listOf(listOf(1))

        assertEquals(expected, PascalTriangle.generate(n))
    }
}
