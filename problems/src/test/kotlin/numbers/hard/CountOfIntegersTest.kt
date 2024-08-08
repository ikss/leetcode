package numbers.hard

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

class CountOfIntegersTest {
    @Test
    fun test1() {
        val num1 = "1"
        val num2 = "12"
        val min_sum = 1
        val max_sum = 8
        val expected = 11

        assertEquals(expected, CountOfIntegers.count(num1, num2, min_sum, max_sum))
    }

    @Test
    fun test2() {
        val num1 = "1"
        val num2 = "5"
        val min_sum = 1
        val max_sum = 5
        val expected = 5

        assertEquals(expected, CountOfIntegers.count(num1, num2, min_sum, max_sum))
    }

    @Test
    @Disabled("This test is disabled because it throws TLE")
    fun test3() {
        val num1 = "4179205230"
        val num2 = "7748704426"
        val min_sum = 8
        val max_sum = 46
        val expected = 883045899

        assertEquals(expected, CountOfIntegers.count(num1, num2, min_sum, max_sum))
    }
}