package numbers.easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ValidPerfectSquareTest {
    @Test
    fun test1BinarySearch() {
        val num = 16
        val expected = true

        assertEquals(expected, ValidPerfectSquare.isPerfectSquareBinarySearch(num))
    }

    @Test
    fun test2BinarySearch() {
        val num = 14
        val expected = false

        assertEquals(expected, ValidPerfectSquare.isPerfectSquareBinarySearch(num))
    }

    @Test
    fun test1NewtonAlgorithm() {
        val num = 16
        val expected = true

        assertEquals(expected, ValidPerfectSquare.isPerfectSquareNewtonAlgorithm(num))
    }
    
    @Test
    fun test2NewtonAlgorithm() {
        val num = 14
        val expected = false

        assertEquals(expected, ValidPerfectSquare.isPerfectSquareNewtonAlgorithm(num))
    }
}