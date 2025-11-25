package easy

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class Finding3DigitEvenNumbersTest {
    @Test
    fun test1() {
        val digits = intArrayOf(3, 2, 1, 0)
        val expected = intArrayOf(102, 120, 130, 132, 210, 230, 302, 310, 312, 320)

        assertArrayEquals(expected, Finding3DigitEvenNumbers.findEvenNumbers(digits))
    }

    @Test
    fun test2() {
        val digits = intArrayOf(2, 2, 8, 8, 2)
        val expected = intArrayOf(222, 228, 282, 288, 822, 828, 882)

        assertArrayEquals(expected, Finding3DigitEvenNumbers.findEvenNumbers(digits))
    }

    @Test
    fun test3() {
        val digits = intArrayOf(3, 7, 5)
        val expected = intArrayOf()

        assertArrayEquals(expected, Finding3DigitEvenNumbers.findEvenNumbers(digits))
    }
}