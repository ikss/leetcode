package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ConcatenationOfConsecutiveBinaryNumbersTest {

    @Test
    fun test1bigInt() {
        val num = 1
        val expected = 1

        assertEquals(expected, ConcatenationOfConsecutiveBinaryNumbers.concatenatedBinaryBigInt(num))
    }

    @Test
    fun test2bigInt() {
        val num = 3
        val expected = 27

        assertEquals(expected, ConcatenationOfConsecutiveBinaryNumbers.concatenatedBinaryBigInt(num))
    }

    @Test
    fun test3bigInt() {
        val num = 12
        val expected = 505379714

        assertEquals(expected, ConcatenationOfConsecutiveBinaryNumbers.concatenatedBinaryBigInt(num))
    }

    @Test
    fun test1bitShift() {
        val num = 1
        val expected = 1

        assertEquals(expected, ConcatenationOfConsecutiveBinaryNumbers.concatenatedBinaryBitShift(num))
    }

    @Test
    fun test2bitShift() {
        val num = 3
        val expected = 27

        assertEquals(expected, ConcatenationOfConsecutiveBinaryNumbers.concatenatedBinaryBitShift(num))
    }

    @Test
    fun test3bitShift() {
        val num = 12
        val expected = 505379714

        assertEquals(expected, ConcatenationOfConsecutiveBinaryNumbers.concatenatedBinaryBitShift(num))
    }
}