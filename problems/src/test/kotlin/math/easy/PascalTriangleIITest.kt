package math.easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class PascalTriangleIITest {

    @Test
    fun test1() {
        val rowIndex = 3
        val expected = listOf(1, 3, 3, 1)

        assertEquals(expected, PascalTriangleII.getRow(rowIndex))
    }

    @Test
    fun test2() {
        val rowIndex = 0
        val expected = listOf(1)

        assertEquals(expected, PascalTriangleII.getRow(rowIndex))
    }

    @Test
    fun test3() {
        val rowIndex = 1
        val expected = listOf(1, 1)

        assertEquals(expected, PascalTriangleII.getRow(rowIndex))
    }
}