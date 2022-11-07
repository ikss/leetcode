package numbers.easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class Maximum69NumberTest {

    @Test
    fun test1() {
        val num = 9669
        val expected = 9969

        assertEquals(expected, Maximum69Number.maximum69Number(num))
    }

    @Test
    fun test2() {
        val num = 9669
        val expected = 9969

        assertEquals(expected, Maximum69Number.maximum69Number(num))
    }

    @Test
    fun test3() {
        val num = 9999
        val expected = 9999

        assertEquals(expected, Maximum69Number.maximum69Number(num))
    }
}