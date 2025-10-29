package numbers.easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SmallestNumberWithAllSetBitsTest {
    @Test
    fun test1() {
        val n = 5
        val expected = 7

        assertEquals(expected, SmallestNumberWithAllSetBits.smallestNumber(n))
    }

    @Test
    fun test2() {
        val n = 10
        val expected = 15

        assertEquals(expected, SmallestNumberWithAllSetBits.smallestNumber(n))
    }

    @Test
    fun test3() {
        val n = 3
        val expected = 3

        assertEquals(expected, SmallestNumberWithAllSetBits.smallestNumber(n))
    }
}