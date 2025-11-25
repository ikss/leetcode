package easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class BinaryPrefixDivisibleBy5Test {
    @Test
    fun test1() {
        val nums = intArrayOf(0, 1, 1)
        val expected = listOf(true, false, false)

        assertEquals(expected, BinaryPrefixDivisibleBy5.prefixesDivBy5(nums))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(1, 1, 1)
        val expected = listOf(false, false, false)

        assertEquals(expected, BinaryPrefixDivisibleBy5.prefixesDivBy5(nums))
    }
}