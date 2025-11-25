package arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SmallestIntegerDivisibleByKTest {
    @Test
    fun test1() {
        val k = 1
        val expected = 1

        assertEquals(expected, SmallestIntegerDivisibleByK.smallestRepunitDivByK(k))
    }

    @Test
    fun test2() {
        val k = 2
        val expected = -1

        assertEquals(expected, SmallestIntegerDivisibleByK.smallestRepunitDivByK(k))
    }

    @Test
    fun test3() {
        val k = 3
        val expected = 3
        assertEquals(expected, SmallestIntegerDivisibleByK.smallestRepunitDivByK(k))
    }
}