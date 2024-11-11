package arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class PrimeSubtractionOperationTest {
    @Test
    fun test1() {
        val nums = intArrayOf(4, 9, 6, 10)
        val expected = true

        assertEquals(expected, PrimeSubtractionOperation.primeSubOperation(nums))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(6, 8, 11, 12)
        val expected = true

        assertEquals(expected, PrimeSubtractionOperation.primeSubOperation(nums))
    }

    @Test
    fun test3() {
        val nums = intArrayOf(5, 8, 3)
        val expected = false

        assertEquals(expected, PrimeSubtractionOperation.primeSubOperation(nums))
    }

    @Test
    fun test4() {
        val nums = intArrayOf(2, 2)
        val expected = false

        assertEquals(expected, PrimeSubtractionOperation.primeSubOperation(nums))
    }
}