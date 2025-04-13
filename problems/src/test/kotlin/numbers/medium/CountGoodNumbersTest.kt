package numbers.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CountGoodNumbersTest {
    @Test
    fun test1() {
        val n = 1L
        val expected = 5

        assertEquals(expected, CountGoodNumbers.countGoodNumbers(n))
    }

    @Test
    fun test2() {
        val n = 4L
        val expected = 400

        assertEquals(expected, CountGoodNumbers.countGoodNumbers(n))
    }
    
    @Test
    fun test3() {
        val n = 50L
        val expected = 564908303

        assertEquals(expected, CountGoodNumbers.countGoodNumbers(n))
    }
}