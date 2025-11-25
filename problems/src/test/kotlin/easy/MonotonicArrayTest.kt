package easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MonotonicArrayTest {
    @Test
    fun test1() {
        val nums = intArrayOf(1, 2, 2, 3)
        val expected = true

        assertEquals(expected, MonotonicArray.isMonotonic(nums))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(6, 5, 4, 4)
        val expected = true

        assertEquals(expected, MonotonicArray.isMonotonic(nums))
    }

    @Test
    fun test3() {
        val nums = intArrayOf(1, 3, 2)
        val expected = false

        assertEquals(expected, MonotonicArray.isMonotonic(nums))
    }

    @Test
    fun test4() {
        val nums = intArrayOf(5, 4, 3, 2, 2, 2, 3, 4, 5)
        val expected = false

        assertEquals(expected, MonotonicArray.isMonotonic(nums))
    }
}