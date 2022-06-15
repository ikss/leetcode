package math.easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CountPrimesTest {

    @Test
    fun test1() {
        val n = 10

        assertEquals(4, CountPrimes.countPrimes(n))
    }

    @Test
    fun test2() {
        val n = 0

        assertEquals(0, CountPrimes.countPrimes(n))
    }

    @Test
    fun test3() {
        val n = 1

        assertEquals(0, CountPrimes.countPrimes(n))
    }
}
