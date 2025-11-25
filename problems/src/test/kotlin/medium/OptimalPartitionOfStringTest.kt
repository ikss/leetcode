package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class OptimalPartitionOfStringTest {

    @Test
    fun test1naive() {
        val s = "abacaba"
        val expected = 4

        assertEquals(expected, OptimalPartitionOfString.partitionStringNaive(s))
    }

    @Test
    fun test2naive() {
        val s = "ssssss"
        val expected = 6

        assertEquals(expected, OptimalPartitionOfString.partitionStringNaive(s))
    }

    @Test
    fun test1optimized() {
        val s = "abacaba"
        val expected = 4

        assertEquals(expected, OptimalPartitionOfString.partitionStringOptimized(s))
    }

    @Test
    fun test2optimized() {
        val s = "ssssss"
        val expected = 6

        assertEquals(expected, OptimalPartitionOfString.partitionStringOptimized(s))
    }
}