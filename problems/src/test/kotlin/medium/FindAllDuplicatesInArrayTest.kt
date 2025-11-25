package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FindAllDuplicatesInArrayTest {
    @Test
    fun test1() {
        val nums = intArrayOf(4, 3, 2, 7, 8, 2, 3, 1)
        val expected = listOf(2, 3)

        assertEquals(expected, FindAllDuplicatesInArray.findDuplicates(nums))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(1, 1, 2)
        val expected = listOf(1)

        assertEquals(expected, FindAllDuplicatesInArray.findDuplicates(nums))
    }

    @Test
    fun test1dp() {
        val nums = intArrayOf(1)
        val expected = emptyList<Int>()

        assertEquals(expected, FindAllDuplicatesInArray.findDuplicates(nums))
    }
}