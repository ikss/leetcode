package arrays.easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class RemoveElementTest {
    @Test
    fun test1() {
        val nums = intArrayOf(3, 2, 2, 3)
        val `val` = 3
        val expected = 2
        val result = RemoveElement.removeElement(nums, `val`)

        assertEquals(expected, result)
        assertEquals(listOf(2, 2), nums.take(result))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(0, 1, 2, 2, 3, 0, 4, 2)
        val `val` = 2
        val expected = 5
        val result = RemoveElement.removeElement(nums, `val`)

        assertEquals(expected, result)
        assertEquals(listOf(0, 1, 3, 0, 4), nums.take(result))
    }
}