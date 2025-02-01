package arrays.easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SpecialArrayITest {
    @Test
    fun test1() {
        val nums = intArrayOf(1)
        val expected = true

        assertEquals(expected, SpecialArrayI.isArraySpecial(nums))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(2, 1, 4)
        val expected = true

        assertEquals(expected, SpecialArrayI.isArraySpecial(nums))
    }

    @Test
    fun test3() {
        val nums = intArrayOf(4, 3, 1, 6)
        val expected = false

        assertEquals(expected, SpecialArrayI.isArraySpecial(nums))
    }
}