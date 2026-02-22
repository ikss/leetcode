package easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class BinaryGapTest {
    @Test
    fun test1() {
        val n = 22
        val expected = 2

        assertEquals(expected, BinaryGap.binaryGap(n))
    }

    @Test
    fun test2() {
        val n = 8
        val expected = 0

        assertEquals(expected, BinaryGap.binaryGap(n))
    }

    @Test
    fun test3() {
        val n = 5
        val expected = 2

        assertEquals(expected, BinaryGap.binaryGap(n))
    }
}