package hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MinimumDifferenceInSumsAfterRemovalOfElementsTest {
    @Test
    fun test1() {
        val nums = intArrayOf(3, 1, 2)
        val expected = -1L

        assertEquals(expected, MinimumDifferenceInSumsAfterRemovalOfElements.minimumDifference(nums))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(7, 9, 5, 8, 1, 3)
        val expected = 1L

        assertEquals(expected, MinimumDifferenceInSumsAfterRemovalOfElements.minimumDifference(nums))
    }
}