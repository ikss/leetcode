package hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MaximizeConsecutiveElementsInAnArrayAfterModificationTest {
    @Test
    fun test1() {
        val nums = intArrayOf(2, 1, 5, 1, 1)
        val expected = 3

        assertEquals(expected, MaximizeConsecutiveElementsInAnArrayAfterModification.maxSelectedElements(nums))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(1, 4, 7, 10)
        val expected = 1

        assertEquals(expected, MaximizeConsecutiveElementsInAnArrayAfterModification.maxSelectedElements(nums))
    }
}