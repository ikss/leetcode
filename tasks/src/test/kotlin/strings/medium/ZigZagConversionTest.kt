package strings.medium

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class ZigZagConversionTest {

    @Test
    fun test1() {
        val s = "PAYPALISHIRING"
        val excepted = "PAHNAPLSIIGYIR"
        assertEquals(excepted, ZigZagConversion.convert(s, 3))
    }

    @Test
    fun test2() {
        val s = "PAYPALISHIRING"
        val excepted = "PINALSIGYAHRPI"
        assertEquals(excepted, ZigZagConversion.convert(s, 4))
    }

    @Test
    fun test3() {
        val s = "PAYPALISHIRING"
        val excepted = "PAYPALISHIRING"
        assertEquals(excepted, ZigZagConversion.convert(s, 1))
    }
}
