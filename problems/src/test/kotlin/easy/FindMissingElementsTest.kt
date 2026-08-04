package easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FindMissingElementsTest {
    @Test
    fun test1() {
        val nums = intArrayOf(1, 4, 2, 5)
        val expected = listOf(3)

        assertEquals(expected, FindMissingElements.findMissingElements(nums))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(7, 8, 6, 9)
        val expected = listOf<Int>()

        assertEquals(expected, FindMissingElements.findMissingElements(nums))
    }

    @Test
    fun test3() {
        val nums = intArrayOf(5, 1)
        val expected = listOf(2, 3, 4)

        assertEquals(expected, FindMissingElements.findMissingElements(nums))
    }
}