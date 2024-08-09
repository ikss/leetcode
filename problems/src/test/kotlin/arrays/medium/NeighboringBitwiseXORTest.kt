package arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class NeighboringBitwiseXORTest {
    @Test
    fun test1CheckVariants() {
        val derived = intArrayOf(1, 1, 0)
        val expected = true

        assertEquals(expected, NeighboringBitwiseXOR.doesValidArrayExistCheckExistence(derived))
    }

    @Test
    fun test2CheckVariants() {
        val derived = intArrayOf(1, 1, 1, 0)
        val expected = false

        assertEquals(expected, NeighboringBitwiseXOR.doesValidArrayExistCheckExistence(derived))
    }

    @Test
    fun test1FlipCount() {
        val derived = intArrayOf(1, 1, 0)
        val expected = true

        assertEquals(expected, NeighboringBitwiseXOR.doesValidArrayExistFlipCount(derived))
    }

    @Test
    fun test2FlipCount() {
        val derived = intArrayOf(1, 1, 1, 0)
        val expected = false

        assertEquals(expected, NeighboringBitwiseXOR.doesValidArrayExistFlipCount(derived))
    }
}