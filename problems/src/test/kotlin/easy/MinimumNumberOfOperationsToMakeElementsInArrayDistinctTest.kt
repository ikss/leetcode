package easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MinimumNumberOfOperationsToMakeElementsInArrayDistinctTest {
    @Test
    fun test1() {
        val nums = intArrayOf(1, 2, 3, 4, 2, 3, 3, 5, 7)
        val expected = 2

        assertEquals(expected, MinimumNumberOfOperationsToMakeElementsInArrayDistinct.minimumOperations(nums))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(4, 5, 6, 4, 4)
        val expected = 2

        assertEquals(expected, MinimumNumberOfOperationsToMakeElementsInArrayDistinct.minimumOperations(nums))
    }

    @Test
    fun test3() {
        val nums = intArrayOf(6, 7, 8, 9)
        val expected = 0

        assertEquals(expected, MinimumNumberOfOperationsToMakeElementsInArrayDistinct.minimumOperations(nums))
    }

    @Test
    fun test1LastDuplicate() {
        val nums = intArrayOf(1, 2, 3, 4, 2, 3, 3, 5, 7)
        val expected = 2

        assertEquals(expected, MinimumNumberOfOperationsToMakeElementsInArrayDistinct.minimumOperationsLastDuplicate(nums))
    }

    @Test
    fun test2LastDuplicate() {
        val nums = intArrayOf(4, 5, 6, 4, 4)
        val expected = 2

        assertEquals(expected, MinimumNumberOfOperationsToMakeElementsInArrayDistinct.minimumOperationsLastDuplicate(nums))
    }

    @Test
    fun test3LastDuplicate() {
        val nums = intArrayOf(6, 7, 8, 9)
        val expected = 0

        assertEquals(expected, MinimumNumberOfOperationsToMakeElementsInArrayDistinct.minimumOperationsLastDuplicate(nums))
    }
}