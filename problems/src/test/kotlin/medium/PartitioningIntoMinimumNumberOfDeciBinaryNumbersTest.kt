package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class PartitioningIntoMinimumNumberOfDeciBinaryNumbersTest {
    @Test
    fun test1() {
        val n = "32"
        val expected = 3

        assertEquals(expected, PartitioningIntoMinimumNumberOfDeciBinaryNumbers.minPartitions(n))
    }

    @Test
    fun test2() {
        val n = "82734"
        val expected = 8

        assertEquals(expected, PartitioningIntoMinimumNumberOfDeciBinaryNumbers.minPartitions(n))
    }

    @Test
    fun test3() {
        val n = "27346209830709182346"
        val expected = 9

        assertEquals(expected, PartitioningIntoMinimumNumberOfDeciBinaryNumbers.minPartitions(n))
    }
}