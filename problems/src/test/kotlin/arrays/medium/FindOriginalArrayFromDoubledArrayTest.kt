package arrays.medium

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class FindOriginalArrayFromDoubledArrayTest {
    @Test
    fun test1() {
        val changed = intArrayOf(1, 3, 4, 2, 6, 8)
        val expected = intArrayOf(1, 3, 4)

        assertArrayEquals(expected, FindOriginalArrayFromDoubledArray.findOriginalArray(changed))
    }

    @Test
    fun test2() {
        val changed = intArrayOf(6, 3, 0, 1)
        val expected = intArrayOf()

        assertArrayEquals(expected, FindOriginalArrayFromDoubledArray.findOriginalArray(changed))
    }

    @Test
    fun test3() {
        val changed = intArrayOf(1)
        val expected = intArrayOf()

        assertArrayEquals(expected, FindOriginalArrayFromDoubledArray.findOriginalArray(changed))
    }
}