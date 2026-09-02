package easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ConstructUniformParityArrayITest {
    @Test
    fun test1() {
        val nums1 = intArrayOf(2, 3)
        val expected = true

        assertEquals(expected, ConstructUniformParityArrayI.uniformArray(nums1))
    }

    @Test
    fun test2() {
        val nums1 = intArrayOf(2, 4)
        val expected = true

        assertEquals(expected, ConstructUniformParityArrayI.uniformArray(nums1))
    }
}