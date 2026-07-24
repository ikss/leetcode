package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class NumberOfUniqueXORTripletsIITest {

    @Test
    fun test1Enumeration() {
        val nums = intArrayOf(1, 3)
        val expected = 2

        assertEquals(expected, NumberOfUniqueXORTripletsII.uniqueXorTripletsEnumeration(nums))
    }

    @Test
    fun test2Enumeration() {
        val nums = intArrayOf(6, 7, 8, 9)
        val expected = 4

        assertEquals(expected, NumberOfUniqueXORTripletsII.uniqueXorTripletsEnumeration(nums))
    }

    @Test
    fun test3Enumeration() {
        val nums = intArrayOf(503, 161, 1144, 279, 513)
        val expected = 15

        assertEquals(expected, NumberOfUniqueXORTripletsII.uniqueXorTripletsEnumeration(nums))
    }
    @Test
    fun test1EnumerationOptimized() {
        val nums = intArrayOf(1, 3)
        val expected = 2

        assertEquals(expected, NumberOfUniqueXORTripletsII.uniqueXorTripletsEnumerationOptimized(nums))
    }

    @Test
    fun test2EnumerationOptimized() {
        val nums = intArrayOf(6, 7, 8, 9)
        val expected = 4

        assertEquals(expected, NumberOfUniqueXORTripletsII.uniqueXorTripletsEnumerationOptimized(nums))
    }

    @Test
    fun test3EnumerationOptimized() {
        val nums = intArrayOf(503, 161, 1144, 279, 513)
        val expected = 15

        assertEquals(expected, NumberOfUniqueXORTripletsII.uniqueXorTripletsEnumerationOptimized(nums))
    }
}
