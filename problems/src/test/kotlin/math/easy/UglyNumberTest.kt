package math.easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class UglyNumberTest {

    @Test
    fun test1() {
        val n = 6
        val expected = true

        assertEquals(expected, UglyNumber.isUgly(n))
    }

    @Test
    fun test2() {
        val n = 1
        val expected = true

        assertEquals(expected, UglyNumber.isUgly(n))
    }

    @Test
    fun test3() {
        val n = 14
        val expected = false

        assertEquals(expected, UglyNumber.isUgly(n))
    }

    @Test
    fun test4() {
        val n = -1
        val expected = false

        assertEquals(expected, UglyNumber.isUgly(n))
    }
}