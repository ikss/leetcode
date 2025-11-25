package easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MinimumBitFlipsToConvertNumberTest {
    @Test
    fun test1Simulation() {
        val result = MinimumBitFlipsToConvertNumber.minBitFlipsSimulation(10, 7)
        val expected = 3

        assertEquals(expected, result)
    }

    @Test
    fun test2Simulation() {
        val result = MinimumBitFlipsToConvertNumber.minBitFlipsSimulation(3, 4)
        val expected = 3

        assertEquals(expected, result)
    }
    
    @Test
    fun test1Xor() {
        val result = MinimumBitFlipsToConvertNumber.minBitFlipsXor(10, 7)
        val expected = 3

        assertEquals(expected, result)
    }

    @Test
    fun test2Xor() {
        val result = MinimumBitFlipsToConvertNumber.minBitFlipsXor(3, 4)
        val expected = 3

        assertEquals(expected, result)
    }

    @Test
    fun test1Kernighan() {
        val result = MinimumBitFlipsToConvertNumber.minBitFlipsKernighan(10, 7)
        val expected = 3

        assertEquals(expected, result)
    }

    @Test
    fun test2Kernighan() {
        val result = MinimumBitFlipsToConvertNumber.minBitFlipsKernighan(3, 4)
        val expected = 3

        assertEquals(expected, result)
    }
}