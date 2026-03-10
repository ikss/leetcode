package hard

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class FindAllPossibleStableBinaryArraysIITest {
    @Test
    fun test1() {
        val zero = 1
        val one = 1
        val limit = 2
        val expected = 2

        assertEquals(expected, FindAllPossibleStableBinaryArraysII.numberOfStableArrays(zero, one, limit))
    }

    @Test
    fun test2() {
        val zero = 1
        val one = 2
        val limit = 1
        val expected = 1

        assertEquals(expected, FindAllPossibleStableBinaryArraysII.numberOfStableArrays(zero, one, limit))
    }

    @Test
    fun test3() {
        val zero = 3
        val one = 3
        val limit = 2
        val expected = 14

        assertEquals(expected, FindAllPossibleStableBinaryArraysII.numberOfStableArrays(zero, one, limit))
    }
}