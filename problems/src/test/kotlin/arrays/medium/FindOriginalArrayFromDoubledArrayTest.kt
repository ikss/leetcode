package arrays.medium

import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class FindOriginalArrayFromDoubledArrayTest {
    @Test
    fun test1() {
        val changed = intArrayOf(1, 3, 4, 2, 6, 8)
        val expected = intArrayOf(1, 3, 4)

        assertTrue(expected.contentEquals(FindOriginalArrayFromDoubledArray.findOriginalArray(changed)))
    }

    @Test
    fun test2() {
        val changed = intArrayOf(6, 3, 0, 1)
        val expected = intArrayOf()

        assertTrue(expected.contentEquals(FindOriginalArrayFromDoubledArray.findOriginalArray(changed)))
    }

    @Test
    fun test3() {
        val changed = intArrayOf(1)
        val expected = intArrayOf()

        assertTrue(expected.contentEquals(FindOriginalArrayFromDoubledArray.findOriginalArray(changed)))
    }
}