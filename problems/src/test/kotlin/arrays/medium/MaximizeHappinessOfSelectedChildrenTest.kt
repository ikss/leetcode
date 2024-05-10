package arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MaximizeHappinessOfSelectedChildrenTest {
    @Test
    fun test1() {
        val happiness = intArrayOf(1, 2, 3)
        val k = 2
        val expected = 4L

        assertEquals(expected, MaximizeHappinessOfSelectedChildren.maximumHappinessSum(happiness, k))
    }

    @Test
    fun test2() {
        val happiness = intArrayOf(1, 1, 1, 1)
        val k = 2
        val expected = 1L

        assertEquals(expected, MaximizeHappinessOfSelectedChildren.maximumHappinessSum(happiness, k))
    }
}