package strings.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ZigZagConversionTest {

    @Test
    fun test1() {
        val s = "PAYPALISHIRING"
        val expected = "PAHNAPLSIIGYIR"
        assertEquals(expected, ZigZagConversion.convert(s, 3))
    }

    @Test
    fun test2() {
        val s = "PAYPALISHIRING"
        val expected = "PINALSIGYAHRPI"
        assertEquals(expected, ZigZagConversion.convert(s, 4))
    }

    @Test
    fun test3() {
        val s = "PAYPALISHIRING"
        val expected = "PAYPALISHIRING"
        assertEquals(expected, ZigZagConversion.convert(s, 1))
    }
}
