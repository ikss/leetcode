package easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FindAllKDistantIndicesInArrayTest {
    @Test
    fun test1() {
        val nums = intArrayOf(3, 4, 9, 1, 3, 9, 5)
        val key = 9
        val k = 1
        val expected = listOf(1, 2, 3, 4, 5, 6)

        assertEquals(expected, FindAllKDistantIndicesInArray.findKDistantIndices(nums, key, k))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(2, 2, 2, 2, 2)
        val key = 2
        val k = 2
        val expected = listOf(0, 1, 2, 3, 4)

        assertEquals(expected, FindAllKDistantIndicesInArray.findKDistantIndices(nums, key, k))
    }
}