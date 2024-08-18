package numbers.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class UglyNumberIITest {
    @Test
    fun test1TreeSet() {
        val n = 10
        val expected = 12

        assertEquals(expected, UglyNumberII.nthUglyNumberTreeSet(n))
    }

    @Test
    fun test2TreeSet() {
        val n = 1
        val expected = 1

        assertEquals(expected, UglyNumberII.nthUglyNumberTreeSet(n))
    }

    @Test
    fun test1Dp() {
        val n = 10
        val expected = 12

        assertEquals(expected, UglyNumberII.nthUglyNumberDp(n))
    }

    @Test
    fun test2Dp() {
        val n = 1
        val expected = 1

        assertEquals(expected, UglyNumberII.nthUglyNumberDp(n))
    }
}