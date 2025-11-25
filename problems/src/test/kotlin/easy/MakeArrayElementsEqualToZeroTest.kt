package easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MakeArrayElementsEqualToZeroTest {
    @Test
    fun test1() {
        val nums = intArrayOf(1, 0, 2, 0, 3)
        val expected = 2

        assertEquals(expected, MakeArrayElementsEqualToZero.countValidSelections(nums))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(2, 3, 4, 0, 4, 1, 0)
        val expected = 0

        assertEquals(expected, MakeArrayElementsEqualToZero.countValidSelections(nums))
    }

    @Test
    fun test3() {
        val nums = intArrayOf(0, 0, 0, 0, 0)
        val expected = 10

        assertEquals(expected, MakeArrayElementsEqualToZero.countValidSelections(nums))
    }
}