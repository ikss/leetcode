package numbers.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class UglyNumberIITest {
    @Test
    fun test1() {
        val n = 10
        val expected = 12

        assertEquals(expected, UglyNumberII.nthUglyNumber(n))
    }
    
    @Test
    fun test2() {
        val n = 1
        val expected = 1

        assertEquals(expected, UglyNumberII.nthUglyNumber(n))
    }
}