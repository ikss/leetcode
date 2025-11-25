package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class BitwiseORsOfSubarraysTest {

    @Test
    fun testSubarrayBitwiseORs() {
        val arr = intArrayOf(0)
        val expected = 1

        assertEquals(expected, BitwiseORsOfSubarrays.subarrayBitwiseORs(arr))
    }

    @Test
    fun testSubarrayBitwiseORsWithDuplicates() {
        val arr = intArrayOf(1, 1, 2)
        val expected = 3

        assertEquals(expected, BitwiseORsOfSubarrays.subarrayBitwiseORs(arr))
    }

    @Test
    fun testSubarrayBitwiseORsWithLargerArray() {
        val arr = intArrayOf(1, 2, 4)
        val expected = 6

        assertEquals(expected, BitwiseORsOfSubarrays.subarrayBitwiseORs(arr))
    }
}