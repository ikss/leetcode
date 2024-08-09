package arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class NeighboringBitwiseXORTest {
    @Test
    fun test1() {
        val derived = intArrayOf(1, 1, 0)
        val expected = true

        assertEquals(expected, NeighboringBitwiseXOR.doesValidArrayExist(derived))
    }
    
    @Test
    fun test2() {
        val derived = intArrayOf(1, 1, 1, 0)
        val expected = false

        assertEquals(expected, NeighboringBitwiseXOR.doesValidArrayExist(derived))
    }
}