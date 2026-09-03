package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ConstructUniformParityArrayIITest {
    @Test
    fun test1() {
        val nums1 = intArrayOf(1, 4, 7)
        val expected = true

        assertEquals(expected, ConstructUniformParityArrayII.uniformArray(nums1))
    }

    @Test
    fun test2() {
        val nums1 = intArrayOf(2, 3)
        val expected = false

        assertEquals(expected, ConstructUniformParityArrayII.uniformArray(nums1))
    }

    @Test
    fun test3() {
        val nums1 = intArrayOf(4, 6)
        val expected = true

        assertEquals(expected, ConstructUniformParityArrayII.uniformArray(nums1))
    }
}