package numbers.easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CountNumbersWithUniqueDigitsIITest {
    @Test
    fun test1() {
        val a = 1
        val b = 20
        val expected = 19

        assertEquals(expected, CountNumbersWithUniqueDigitsII.numberCount(a, b))
    }
    
    @Test
    fun test2() {
        val a = 10
        val b = 20
        val expected = 9

        assertEquals(expected, CountNumbersWithUniqueDigitsII.numberCount(a, b))
    }
    
    @Test
    fun test3() {
        val a = 1
        val b = 100
        val expected = 81

        assertEquals(expected, CountNumbersWithUniqueDigitsII.numberCount(a, b))
    }
}